package com.srtp.mapper;

import com.srtp.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @Auther: Wzx
 * @Date: 2020/2/7
 * @Description: com.srtp.mapper
 * @version: 1.0
 */
public interface UserMapper {

    /**
     * 判断用户是否存在
     * 根据用户id查询用户信息
     *                  userId(user_id)：用户id
     * @param userId 用户id
     * @return
     */
    @Select("select * from user where user_id = #{0}")
    List<User> selByUserId(String userId);

    /**
     * 登录
     * 判断用户名密码是否匹配
     *                  userId(user_id)：用户id
     *                  userPwd(user_pwd)：用户密码
     * @param userId 用户id
     * @param userPwd 用户密码
     * @return
     */
    @Select("select * from user where user_id = #{param1} and user_pwd = #{param2}")
    User SelByUserIdPwd(String userId, String userPwd);


    /**
     * 注册用户
     * @param user 用户对象：
     *             userId(user_id)： 用户Id
     *             userPwd(user_pwd)： 用户密码
     * @return
     */
    @Insert("insert into user values(#{userId},#{userPwd})")
    int InsUser(User user);
    
    
    @Update("update user set user_pwd = #{param2} where user_id = #{param1}")
    int expwd(String userId,String userPwd);

}
