package com.srtp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srtp.mapper.CommentMapper;
import com.srtp.pojo.Comment;
import com.srtp.service.CommentService;

@Service
public class CommentServiceImpl implements CommentService{

	@Autowired
	private CommentMapper commentmapper;
	
	@Override
	public List<Comment> AllComment(int id) {
		return commentmapper.AllComment(id);
	}

	@Override
	public int ReleaseComment(int id,String userid, String comment, String title,String nowdate) {
		return commentmapper.ReleaseCommetn(id,userid, comment, title,nowdate);
	}

}
