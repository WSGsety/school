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
public class Notice {
    private Integer notId;
    private String notTitle;
    private String notContent;
    private String notDate;

    public Notice() {
    }

    public Notice(Integer notId, String notTitle, String notContent, String notDate) {
        this.notId = notId;
        this.notTitle = notTitle;
        this.notContent = notContent;
        this.notDate = notDate;
    }

    public Notice(String notTitle, String notDate) {
        super();
        this.notTitle = notTitle;
        this.notDate = notDate;
    }

    public Integer getNotId() {
        return notId;
    }

    public void setNotId(Integer notId) {
        this.notId = notId;
    }

    public String getNotTitle() {
        return notTitle;
    }

    public void setNotTitle(String notTitle) {
        this.notTitle = notTitle;
    }

    public String getNotContent() {
        return notContent;
    }

    public void setNotContent(String notContent) {
        this.notContent = notContent;
    }

    public String getNotDate() {
        return notDate;
    }

    public void setNotDate(String notDate) {
        this.notDate = notDate;
    }
}
