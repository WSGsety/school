package com.srtp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srtp.mapper.LunTanMapper;
import com.srtp.pojo.LunTanInfo;
import com.srtp.service.LunTanService;


@Service
public class LunTanServiceImpl implements LunTanService{

	@Autowired
	private LunTanMapper luntanmapper;
	
	@Override
	public int releaseArticle(String userId, String title, String content) {
		return luntanmapper.ReleaseArticle(userId, title, content);
	}

	@Override
	public List<LunTanInfo> getAllLunTan() {
		// TODO Auto-generated method stub
		return luntanmapper.getAllLunTan();
	}

	@Override
	public List<LunTanInfo> getMyLunTan(String userId) {
		// TODO Auto-generated method stub
		return luntanmapper.getMyLunTan(userId);
	}

}
