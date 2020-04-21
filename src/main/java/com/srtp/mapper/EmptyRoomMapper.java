package com.srtp.mapper;

import com.srtp.pojo.EmptyRoom;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Auther: Wzx
 * @Date: 2020/2/7
 * @Description: com.srtp.mapper
 * @version: 1.0
 */
public interface EmptyRoomMapper {

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
    @Select("select lesson,room_name from emptyroom where floor = #{floor} and school_area = #{schoolArea} and date = #{date}")
    List<EmptyRoom> selAll(EmptyRoom emptyRoom);
}
