package com.srtp.mapper;

import com.srtp.pojo.Course;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Auther: Wzx
 * @Date: 2020/2/7
 * @Description: com.srtp.mapper
 * @version: 1.0
 */
public interface CourseMapper {

    /**
     * 根据用户id查询成绩（为了安全需要提供密码）
     *              userId(user_id)：用户id
     *              courseName(course_name)：课程名
     *              courseScore(course_score)：课程成绩
     *              userPwd(user_pwd)：用户密码
     * @param userId 用户id
     * @param userPwd 用户密码
     * @return
     */
    @Select("select c.user_id,c.course_name,c.course_score from course c right join user u on c.user_id=u.user_id and c.user_id = #{param1} and u.user_pwd = #{param2}")
    List<Course> selById(String userId, String userPwd);

}
