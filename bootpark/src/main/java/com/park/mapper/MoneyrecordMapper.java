package com.park.mapper;

import com.park.pojo.Moneyrecord;
import com.park.pojo.MoneyrecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MoneyrecordMapper {
    int countByExample(MoneyrecordExample example);

    int deleteByExample(MoneyrecordExample example);

    int insert(Moneyrecord record);

    int insertSelective(Moneyrecord record);

    List<Moneyrecord> selectByExample(MoneyrecordExample example);

    int updateByExampleSelective(@Param("record") Moneyrecord record, @Param("example") MoneyrecordExample example);

    int updateByExample(@Param("record") Moneyrecord record, @Param("example") MoneyrecordExample example);
}