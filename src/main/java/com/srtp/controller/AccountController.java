package com.srtp.controller;

import com.srtp.pojo.Account;
import com.srtp.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Auther: Wzx
 * @Date: 2020/2/7
 * @Description: com.srtp.controller
 * @version: 1.0
 */
@Controller
public class AccountController {

    @Autowired
    private AccountService accountServiceImpl;

    /**
     * 根据用户id查询课程表     kcb:课程表
     * @param userId 用户id
     * @return
     */
//    @ResponseBody
//    @RequestMapping("/findKcb")
//    public String findKcb(String userId){
//        Account account = accountServiceImpl.findKcb(userId);
//        String kcb = account.getUserKcb();
//        return kcb;
//    }


    /**
     * 修改信息
     * 
     * @param userName	用户名	
     * @param userAge	用户年龄
     * @param userTel	用户电话
     * @param userSex	用户性别
     * @param userInfo	用户签名
     * @return
     */
    @ResponseBody
    @RequestMapping("/Info")
    public int updateInfo(String userName,String userAge,String userTel,String userSex,String userInfo,String userId){
    	int flag=accountServiceImpl.UpdateInfo(userName, userAge, userTel, userSex, userInfo, userId);
    	return flag;
    }
    
    
    /**
     * 登录成功后将对应信息返回至前端
     *                      userName(user_name)：用户昵称
     *                      userInfo(user_info)：用户个人简介
     *                      userImg(user_img)：用户头像
     * @param userId 用户id
     * @return
     */
    @ResponseBody
    @RequestMapping("/findUserInfo")
    public Account findUserInfo(String userId){
        Account account = accountServiceImpl.findInfo(userId);
        return account;
    }


    /**
     * 查看个人资料
     *          userName(user_name)：用户昵称
     *          userTel(user_tel)：用户联系电话
     *          userSex(user_sex)：用户性别
     *          userAge(user_age)：用户年龄
     *          userInfo(user_info)：用户个人简介
     * @param userId 用户id
     * @return
     */
    @ResponseBody
    @RequestMapping("/selectPersonInfo")
    public Account findPersonInfo(String userId){
        Account account = accountServiceImpl.findPersonInfo(userId);
        return account;
    }

}
