package com.srtp.service;

import com.srtp.pojo.ShowNotice;

/**
 * @Auther: Wzx
 * @Date: 2020/2/8
 * @Description: com.srtp.service
 * @version: 1.0
 */
public interface NoticeService {

    /**
     * 首页通知分页
     * @param page 第几页
     * @param rows 每页几条
     * @return
     */
    ShowNotice show(int page, int rows);
    
    
    /**
     * 发布文章
     * 
     * @param userId	用户id
     * @param title		文章标题
     * @param content	文章内容
     * @param date		当前事件
     * @return
     *//*
    int releaseArticle(String userId,String title,String content,String date);*/
}
