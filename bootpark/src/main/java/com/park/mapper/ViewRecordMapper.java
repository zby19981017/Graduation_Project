package com.park.mapper;

import com.park.pojo.ViewRecord;
import com.park.pojo.ViewRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ViewRecordMapper {
    int countByExample(ViewRecordExample example);

    int deleteByExample(ViewRecordExample example);

    int insert(ViewRecord record);

    int insertSelective(ViewRecord record);

    List<ViewRecord> selectByExample(ViewRecordExample example);

    int updateByExampleSelective(@Param("record") ViewRecord record, @Param("example") ViewRecordExample example);

    int updateByExample(@Param("record") ViewRecord record, @Param("example") ViewRecordExample example);
}