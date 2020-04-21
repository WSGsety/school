package com.srtp.controller;

import com.srtp.pojo.EmptyRoom;
import com.srtp.service.EmptyRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Auther: Wzx
 * @Date: 2020/2/8
 * @Description: com.srtp.controller
 * @version: 1.0
 */
@Controller
public class EmptyRoomController {

    @Autowired
    private EmptyRoomService emptyRoomServiceImpl;

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
    @ResponseBody
    @RequestMapping("/findEmptyRoom")
    public List<EmptyRoom> findEmptyRoom(EmptyRoom emptyRoom){
        List<EmptyRoom> list = emptyRoomServiceImpl.findEmptyRoom(emptyRoom);
        return list;
    }
}
