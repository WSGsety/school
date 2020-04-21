package com.srtp.controller;

import com.srtp.pojo.ShowNotice;
import com.srtp.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


/**
 * @Auther: Wzx
 * @Date: 2020/2/8
 * @Description: com.srtp.controller
 * @version: 1.0
 */
@Controller
public class NoticeController {

    @Autowired
    private NoticeService noticeServiceImpl;

    /**
     * 首页通知分页
     * @param page 第几页
     * @param rows 每页几条
     * @return
     */
    @ResponseBody
    @RequestMapping("/showAllNotice")
    public List<?> showAllNotice(int page, int rows){
        ShowNotice show = noticeServiceImpl.show(page, rows);
        List<?> list = show.getRows();
        return list;
    }
    
    /*@ResponseBody
    @RequestMapping("/ReleaseArticle")
    public int Release(String userId,String title,String content){
    	Date nowdate=new Date();
    	SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
    	String date=sdf.format(nowdate);
    	//int flag=
    	return 1;
    }*/
}
