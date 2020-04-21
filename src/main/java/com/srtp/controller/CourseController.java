package com.srtp.controller;

import com.srtp.pojo.Course;
import com.srtp.service.CourseService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Auther: Wzx
 * @Date: 2020/2/7
 * @Description: com.srtp.controller
 * @version: 1.0
 */
@Controller
public class CourseController {

    @Autowired
    private CourseService courseServiceImpl;


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
    @ResponseBody
    @RequestMapping("/findCourse")
    public List<Course> findCourse(String userId, String userPwd){
        List<Course> list = courseServiceImpl.selCourse(userId, userPwd);
        return list;
    }
}
