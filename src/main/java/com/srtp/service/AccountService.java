package com.srtp.service;

import com.srtp.pojo.Account;

/**
 * @Auther: Wzx
 * @Date: 2020/2/7
 * @Description: com.srtp.service
 * @version: 1.0
 */
public interface AccountService {

    /**
     * 用户注册
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
    int register(Account account);

    /**
     * 根据用户id查询课程表     kcb:课程表
     * @param userId 用户id
     * @return
     */
    Account findKcb(String userId);



    /**
     * 登录成功后将对应信息返回至前端
     *                      userName(user_name)：用户昵称
     *                      userInfo(user_info)：用户个人简介
     *                      userImg(user_img)：用户头像
     * @param userId 用户id
     * @return
     */
    Account findInfo(String userId);


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
    Account findPersonInfo(String userId);
    
    
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
    int UpdateInfo(String userName,String userAge,String userTel,String userSex,String userInfo,String userId);
}
