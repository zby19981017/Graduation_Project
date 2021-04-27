package com.park.mapper;

import com.park.pojo.Positionrecord;
import com.park.pojo.PositionrecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PositionrecordMapper {
    int countByExample(PositionrecordExample example);

    int deleteByExample(PositionrecordExample example);

    int deleteByPrimaryKey(Integer pid);

    int insert(Positionrecord record);

    int insertSelective(Positionrecord record);

    List<Positionrecord> selectByExample(PositionrecordExample example);

    Positionrecord selectByPrimaryKey(Integer pid);

    int updateByExampleSelective(@Param("record") Positionrecord record, @Param("example") PositionrecordExample example);

    int updateByExample(@Param("record") Positionrecord record, @Param("example") PositionrecordExample example);

    int updateByPrimaryKeySelective(Positionrecord record);

    int updateByPrimaryKey(Positionrecord record);
}