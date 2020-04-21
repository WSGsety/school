package com.srtp.controller;

import com.srtp.pojo.Account;
import com.srtp.pojo.User;
import com.srtp.service.AccountService;
import com.srtp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Auther: Wzx
 * @Date: 2020/2/7
 * @Description: com.srtp.controller
 * @version: 1.0
 */
@Controller
public class UserController {

    @Autowired
    private UserService userServiceImpl;

    @Autowired
    private AccountService accountServiceImpl;

    /**
     * 判断用户是否存在
     * 根据用户id查询用户信息
     * userId(user_id)：用户id
     *
     * @param userId 用户id
     * @return
     */
    @ResponseBody
    @RequestMapping("/selByUserId")
    public List<User> findUserInfo(String userId) {
        List<User> list = userServiceImpl.selUser(userId);
        return list;
    }
    
    
    /*
     * 修改密码
     * 
     * 根据userId
     * 
     */
    @ResponseBody
    @RequestMapping("/expwdByUserId")
    public int expwd(String userId,String userPwd){
    	int flag=userServiceImpl.expwd(userId, userPwd);
    	return flag;
    }

    /**
     * 登录
     * userId(user_id)：用户id
     * userPwd(user_pwd)：用户密码
     *
     * @param userId  用户id
     * @param userPwd 用户密码
     * @return
     */
    @RequestMapping("/login")
    public String login(String userId, String userPwd) {
        int flag = userServiceImpl.login(userId, userPwd);
        if (flag == 1) {
            //请求转发给AccountController的findUserInfo
            System.out.println("请求转发");
            return "redirect:/findUserInfo?userId=" + userId;
        }
        System.out.println("aaa");
        return "error1";
    }

    @ResponseBody
    @RequestMapping("/error1")
    public Map<String, String> error() {
        Map<String, String> map = new HashMap<>();
        map.put("userName", "null");
        return map;
    }


    /**
     * 注册用户
     *
     * @param user    用户对象：
     *                userId(user_id)： 用户Id
     *                userPwd(user_pwd)： 用户密码
     * @param account 账户对象：
     *                userId(user_id)： 用户id
     *                userName(user_name)：用户昵称
     *                userAge(user_age)： 用户年龄
     *                userTel(user_tel)： 用户联系电话
     *                userSex(user_sex)： 用户性别
     *                userInfo(user_info)： 用户个人简介
     *                userImg(user_img)： 用户头像
     * @return
     */
    @ResponseBody
    @RequestMapping("/register")
    public int register(User user, Account account) {
        //注册用户表的标志  0：失败，1：成功
        int flag = 0;
        //注册用户表的标志  0：失败，1：成功
        int flag2 = 0;
        List<User> list = userServiceImpl.selUser(user.getUserId());
        if (list.size() == 0) {
            flag = userServiceImpl.register(user);
            flag2 = accountServiceImpl.register(account);
        }
        if (flag == 1 && flag2 == 1) {
            return 1;
        }
        return 0;
    }
}
