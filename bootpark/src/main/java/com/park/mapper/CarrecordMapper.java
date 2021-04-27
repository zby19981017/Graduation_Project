package com.park.mapper;

import com.park.pojo.Carrecord;
import com.park.pojo.CarrecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CarrecordMapper {
    int countByExample(CarrecordExample example);

    int deleteByExample(CarrecordExample example);

    int deleteByPrimaryKey(Integer rid);

    int insert(Carrecord record);

    int insertSelective(Carrecord record);

    List<Carrecord> selectByExample(CarrecordExample example);

    Carrecord selectByPrimaryKey(Integer rid);

    int updateByExampleSelective(@Param("record") Carrecord record, @Param("example") CarrecordExample example);

    int updateByExample(@Param("record") Carrecord record, @Param("example") CarrecordExample example);

    int updateByPrimaryKeySelective(Carrecord record);

    int updateByPrimaryKey(Carrecord record);
}