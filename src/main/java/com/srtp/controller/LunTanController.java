package com.srtp.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.srtp.pojo.LunTanInfo;
import com.srtp.service.impl.LunTanServiceImpl;

@Controller
public class LunTanController {

	 @Autowired
	 private LunTanServiceImpl lunTanServiceImpl;
	 
	 @ResponseBody
	 @RequestMapping("/ReleaseArticle")
	 public int Release(String userId,String title,String content){
	   	int flag=lunTanServiceImpl.releaseArticle(userId, title, content);
	   	return 1;
     }
	 
	 @ResponseBody
	 @RequestMapping("/AllLunTan")
	 public List<LunTanInfo> getAllLunTan(){
		 ArrayList<LunTanInfo> list=new ArrayList<>();
		 list=(ArrayList<LunTanInfo>) lunTanServiceImpl.getAllLunTan();
		 return list;
	 }
	 
	 @ResponseBody
	 @RequestMapping("/AllLunTanById")
	 public List<LunTanInfo> getMyLunTan(String userId){
		 ArrayList<LunTanInfo> list=new ArrayList<>();
		 list=(ArrayList<LunTanInfo>) lunTanServiceImpl.getMyLunTan(userId);
		 return list;
	 }
	
}
