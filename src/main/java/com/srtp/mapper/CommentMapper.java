package com.srtp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import com.srtp.pojo.Comment;

public interface CommentMapper {

	 @Select("select * from comment where luntanid = #{param1}")
	 List<Comment> AllComment(int id);
	 
	 @Insert("insert into comment(userid,title,comment,luntanid,date) values (#{param2},#{param4},#{param3},#{param1},#{param5})")
	 int ReleaseCommetn(int id,String userid,String comment,String title,String nowdate);
	
}
