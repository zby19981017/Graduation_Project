package com.park.pojo;

import com.park.pojo.Sysrecord;
import com.park.pojo.SysrecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysrecordMapper {
    int countByExample(SysrecordExample example);

    int deleteByExample(SysrecordExample example);

    int deleteByPrimaryKey(Integer sysid);

    int insert(Sysrecord record);

    int insertSelective(Sysrecord record);

    List<Sysrecord> selectByExample(SysrecordExample example);

    Sysrecord selectByPrimaryKey(Integer sysid);

    int updateByExampleSelective(@Param("record") Sysrecord record, @Param("example") SysrecordExample example);

    int updateByExample(@Param("record") Sysrecord record, @Param("example") SysrecordExample example);

    int updateByPrimaryKeySelective(Sysrecord record);

    int updateByPrimaryKey(Sysrecord record);
}