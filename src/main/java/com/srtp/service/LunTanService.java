package com.srtp.service;

import java.util.List;

import com.srtp.pojo.LunTanInfo;

/**
 * @author xcq
 *			2020-3-25
 */

public interface LunTanService {

	
	/**
     * 发布文章
     * 
     * @param userId	用户id
     * @param title		文章标题
     * @param content	文章内容
     * @return
     */
    int releaseArticle(String userId,String title,String content);
    
    /**
     *遍历获取所有文章的集合
     * 
     * @return
     */
    List<LunTanInfo> getAllLunTan();
    
    /**
     * 获取登录用户的文章
     * 
     * @return
     */
    List<LunTanInfo> getMyLunTan(String userId);
}
