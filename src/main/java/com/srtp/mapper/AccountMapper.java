package com.srtp.mapper;

import com.srtp.pojo.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Service;

/**
 * @Auther: Wzx
 * @Date: 2020/2/7
 * @Description: com.srtp.mapper
 * @version: 1.0
 */
public interface AccountMapper {

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
    @Insert("insert into account values(#{userId},#{userName},#{userAge},#{userTel},#{userSex},#{userInfo},#{userImg})")
    int insAccount(Account account);

    /**
     * 根据用户id查询课程表     user_kcb:用户课程表
     * @param userId 用户id
     * @return
     */
    @Select("select user_kcb from account where user_id = #{userId}")
    Account selKcb(String userId);


    /**
     * 登录成功后将对应信息返回至前端
     *                      userName(user_name)：用户昵称
     *                      userInfo(user_info)：用户个人简介
     *                      userImg(user_img)：用户头像
     * @param userId 用户id
     * @return
     */
    @Select("select user_name,user_info,user_img from account where user_id = #{userId}")
    Account selUserInfo(String userId);

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
    @Select("select user_id,user_name,user_tel,user_sex,user_age,user_info from account where user_id = #{userId}")
    Account selUserInfoById(String userId);
    
    /*update user set user_pwd = #{arg1} where user_id = #{arg0}*/
    @Update("update account set user_name = #{param1},user_age = #{param2},user_tel = #{param3},user_sex = #{param4},user_info = #{param5} where user_id = #{param6}")
    int UpdateInfo(String userName, String userAge, String userTel, String userSex, String userInfo,String userId);
}
