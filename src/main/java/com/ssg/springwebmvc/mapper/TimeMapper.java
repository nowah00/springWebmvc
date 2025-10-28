package com.ssg.springwebmvc.mapper;

import org.apache.ibatis.annotations.Select;

// 기능을 가진 매퍼인터페이스
public interface TimeMapper {
    // 데이터베이스의 현재 시각을 문자열로 처리하는 메서드 getTimeNow()
    @Select("SELECT NOW()")
    String getTimeNow();
}
