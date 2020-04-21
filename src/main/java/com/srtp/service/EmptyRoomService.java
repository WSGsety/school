package com.srtp.service;

import com.srtp.pojo.EmptyRoom;

import java.util.List;

/**
 * @Auther: Wzx
 * @Date: 2020/2/8
 * @Description: com.srtp.service
 * @version: 1.0
 */
public interface EmptyRoomService {

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
    List<EmptyRoom> findEmptyRoom(EmptyRoom emptyRoom);
}
