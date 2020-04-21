package com.srtp.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @Auther: Wzx
 * @Date: 2020/2/7
 * @Description: com.srtp.pojo
 * @version: 1.0
 */
public class LunTanInfo {
	private int luntanid;
    private String userId;
    private String title;
    private String content;
    private String faceImg;
    private String contentImg;

    
    public int getLuntanid() {
		return luntanid;
	}

	public void setLuntanid(int luntanid) {
		this.luntanid = luntanid;
	}

	public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFaceImg() {
        return faceImg;
    }

    public void setFaceImg(String faceImg) {
        this.faceImg = faceImg;
    }

    public String getContentImg() {
        return contentImg;
    }

    public void setContentImg(String contentImg) {
        this.contentImg = contentImg;
    }

	public LunTanInfo(String userId, String title, String content) {
		super();
		this.userId = userId;
		this.title = title;
		this.content = content;
	}
    
    
}
