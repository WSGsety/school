package com.srtp.service.impl;

import com.srtp.mapper.EmptyRoomMapper;
import com.srtp.pojo.EmptyRoom;
import com.srtp.service.EmptyRoomService;
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
public class EmptyRoomServiceImpl implements EmptyRoomService {

    @Autowired
    private EmptyRoomMapper emptyRoomMapper;

    /**
     * 查询空教室，包含：
     *            lesson：空课号
     *            roomName(room_name)：教室号
     *            floor：楼号
     *            schoolArea(school_area)：校区
     *            date：日期
     * @param emptyRoom
     * @return
     */
    @Override
    public List<EmptyRoom> findEmptyRoom(EmptyRoom emptyRoom) {
        return emptyRoomMapper.selAll(emptyRoom);
    }
}
