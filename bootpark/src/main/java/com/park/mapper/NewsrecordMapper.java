package com.park.mapper;

import com.park.pojo.Newsrecord;
import com.park.pojo.NewsrecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NewsrecordMapper {
    int countByExample(NewsrecordExample example);

    int deleteByExample(NewsrecordExample example);

    int deleteByPrimaryKey(Integer newsid);

    int insert(Newsrecord record);

    int insertSelective(Newsrecord record);

    List<Newsrecord> selectByExample(NewsrecordExample example);

    Newsrecord selectByPrimaryKey(Integer newsid);

    int updateByExampleSelective(@Param("record") Newsrecord record, @Param("example") NewsrecordExample example);

    int updateByExample(@Param("record") Newsrecord record, @Param("example") NewsrecordExample example);

    int updateByPrimaryKeySelective(Newsrecord record);

    int updateByPrimaryKey(Newsrecord record);
}