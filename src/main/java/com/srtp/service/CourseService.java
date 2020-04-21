package com.srtp.service;

import com.srtp.pojo.Course;

import java.util.List;

/**
 * @Auther: Wzx
 * @Date: 2020/2/7
 * @Description: com.srtp.service
 * @version: 1.0
 */
public interface CourseService {

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
    public List<Course> selCourse(String userId, String userPwd);

}
