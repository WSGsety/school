package com.srtp.service.impl;

import com.srtp.mapper.AccountMapper;
import com.srtp.pojo.Account;
import com.srtp.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther: Wzx
 * @Date: 2020/2/7
 * @Description: com.srtp.service.impl
 * @version: 1.0
 */
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;

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
    @Override
    public int register(Account account) {
        return accountMapper.insAccount(account);
    }

    /**
     * 根据用户id查询课程表     kcb:课程表
     * @param userId 用户id
     * @return
     */
    @Override
    public Account findKcb(String userId) {
        return accountMapper.selKcb(userId);
    }

    /**
     * 登录成功后将对应信息返回至前端
     *                      userName(user_name)：用户昵称
     *                      userInfo(user_info)：用户个人简介
     *                      userImg(user_img)：用户头像
     * @param userId 用户id
     * @return
     */
    @Override
    public Account findInfo(String userId) {
        return accountMapper.selUserInfo(userId);
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
    @Override
    public Account findPersonInfo(String userId) {
        return accountMapper.selUserInfoById(userId);
    }

	@Override
	public int UpdateInfo(String userName, String userAge, String userTel, String userSex, String userInfo,String userId) {
		return accountMapper.UpdateInfo(userName, userAge, userTel, userSex, userInfo, userId);
	}
}
