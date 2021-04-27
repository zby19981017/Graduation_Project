package com.park.mapper;

import com.park.pojo.Countrecord;
import com.park.pojo.CountrecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CountrecordMapper {
    int countByExample(CountrecordExample example);

    int deleteByExample(CountrecordExample example);

    int deleteByPrimaryKey(Integer countid);

    int insert(Countrecord record);

    int insertSelective(Countrecord record);

    List<Countrecord> selectByExample(CountrecordExample example);

    Countrecord selectByPrimaryKey(Integer countid);

    int updateByExampleSelective(@Param("record") Countrecord record, @Param("example") CountrecordExample example);

    int updateByExample(@Param("record") Countrecord record, @Param("example") CountrecordExample example);

    int updateByPrimaryKeySelective(Countrecord record);

    int updateByPrimaryKey(Countrecord record);
}