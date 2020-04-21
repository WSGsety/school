package com.srtp.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.srtp.pojo.Comment;
import com.srtp.service.CommentService;
import com.srtp.service.impl.CommentServiceImpl;

@Controller
public class CommentController {

    @Autowired
    private CommentServiceImpl commentServiceImpl;


    @ResponseBody
    @RequestMapping("/AllCommentByTitle")
    public List<Comment> Serach(String luntanid) {
        ArrayList<Comment> list = new ArrayList<>();
        int id = Integer.parseInt(luntanid);
        list = (ArrayList<Comment>) commentServiceImpl.AllComment(id);
        return list;
    }

    @ResponseBody
    @RequestMapping("/ReleaseCommentDemo")
    public int ReleaseComment(String luntanid, String userid, String comment, String title) {
        ArrayList<Comment> list = new ArrayList<>();
        int id = Integer.parseInt(luntanid);
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String nowdate = sdf.format(date);
        int number = commentServiceImpl.ReleaseComment(id, userid, comment, title, nowdate);
        return number;
    }

}
