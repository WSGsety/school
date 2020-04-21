package com.srtp.mapper;

import com.srtp.pojo.Notice;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Auther: Wzx
 * @Date: 2020/2/8
 * @Description: com.srtp.mapper
 * @version: 1.0
 */
public interface NoticeMapper {

    /**
     * 查询全部通知
     * 分页插件时使用
     *     id：通知id
     * @return
     */
    @Select("select * from notice order by not_id desc")
    List<Notice> selAll();
}
