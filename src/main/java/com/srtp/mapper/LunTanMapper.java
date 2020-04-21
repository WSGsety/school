package com.srtp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.srtp.pojo.LunTanInfo;


public interface LunTanMapper {

	
	 @Insert("insert into luntaninfo(user_id,title,content) values (#{param1},#{param2},#{param3})")
	 int ReleaseArticle(String userId,String title,String content);
	 
	 
	 @Select("select * from luntaninfo")
	 List<LunTanInfo> getAllLunTan();
	 
	 @Select("select * from luntaninfo where user_id = #{param1}")
	 List<LunTanInfo> getMyLunTan(String userId);
}
