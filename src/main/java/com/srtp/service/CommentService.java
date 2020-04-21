package com.srtp.service;

import java.util.List;

import com.srtp.pojo.Comment;

public interface CommentService {

	
	/**
	 * @param userid 文章作者的id
	 * @param title	文章的标题名
	 * @return
	 */
	List<Comment> AllComment(int id);
	
	
	/**
	 * @param userid	当前登录的用户id
	 * @param comment	当前的评论内容comment
	 * @param title		当前评论的文章标题title
	 * @return
	 */
	int ReleaseComment(int id,String userid,String comment,String title,String nowdate);
}
