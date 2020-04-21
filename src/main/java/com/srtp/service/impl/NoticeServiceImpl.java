package com.srtp.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.srtp.mapper.NoticeMapper;
import com.srtp.pojo.Notice;
import com.srtp.pojo.ShowNotice;
import com.srtp.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: Wzx
 * @Date: 2020/2/8
 * @Description: com.srtp.service.impl
 * @version: 1.0
 */
@Service
public class NoticeServiceImpl implements NoticeService {

    @Autowired
    private NoticeMapper noticeMapper;

    /**
     * 首页通知分页
     * @param page 第几页
     * @param rows 每页几条
     * @return
     */
    @Override
    public ShowNotice show(int page, int rows) {
        //设置页数和每页条数
        PageHelper.startPage(page, rows);
        // 查询全部
        List<Notice> list = noticeMapper.selAll();
        //分页代码
        PageInfo<Notice> pi = new PageInfo<>(list);

        ShowNotice dataGrid = new ShowNotice();
        dataGrid.setRows(pi.getList());
        dataGrid.setTotal(pi.getTotal());
        return dataGrid;
    }
}
