package com.srtp.service;

import com.srtp.pojo.Account;
import com.srtp.pojo.User;

import java.util.List;

/**
 * @Auther: Wzx
 * @Date: 2020/2/7
 * @Description: com.srtp.service
 * @version: 1.0
 */
public interface UserService {

    /**
     * 判断用户是否存在
     * 根据用户id查询用户信息
     *                  userId(user_id)：用户id
     * @param userId 用户id
     * @return
     */
    List<User> selUser(String userId);

    /**
     * 登录
     *       userId(user_id)：用户id
     *       userPwd(user_pwd)：用户密码
     * @param userId 用户id
     * @param userPwd 用户密码
     * @return
     */
    int login(String userId, String userPwd);

    /**
     * 注册用户
     * @param user 用户对象：
     *             userId(user_id)： 用户Id
     *             userPwd(user_pwd)： 用户密码
     * @return
     */
    int register(User user);
    
    /**
     * 修改
     * @param userId  用户Id
     * @return
     */
    int expwd(String userId,String userPwd);


}
