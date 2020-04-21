package com.srtp.service.impl;


import com.srtp.mapper.UserMapper;
import com.srtp.pojo.User;
import com.srtp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: Wzx
 * @Date: 2020/2/7
 * @Description: com.srtp.service.impl
 * @version: 1.0
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 判断用户是否存在
     * 根据用户id查询用户信息
     *                  userId(user_id)：用户id
     * @param userId 用户id
     * @return
     */
    @Override
    public List<User> selUser(String userId) {
        return userMapper.selByUserId(userId);
    }

    /**
     * 登录
     *       userId(user_id)：用户id
     *       userPwd(user_pwd)：用户密码
     * @param userId 用户id
     * @param userPwd 用户密码
     * @return
     */
    @Override
    public int login(String userId, String userPwd) {
        User user = userMapper.SelByUserIdPwd(userId, userPwd);
        if (user != null) {
            return 1;
        } else {
            return 0;
        }
    }

    /**
     * 注册用户
     * @param user 用户对象：
     *             userId(user_id)： 用户Id
     *             userPwd(user_pwd)： 用户密码
     * @return
     */
    @Override
    public int register(User user) {
        return userMapper.InsUser(user);
    }

	/* 
	 * 修改密码
	 * @param userId	用户id
	 * 		  userPwd	新密码
	 * 
	 * @return
	 */
	@Override
	public int expwd(String userId,String userPwd) {
		return userMapper.expwd(userId, userPwd);
	}


}
