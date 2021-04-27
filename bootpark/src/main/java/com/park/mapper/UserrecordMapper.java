package com.park.mapper;

import com.park.pojo.Userrecord;
import com.park.pojo.UserrecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserrecordMapper {
    int countByExample(UserrecordExample example);

    int deleteByExample(UserrecordExample example);

    int deleteByPrimaryKey(Integer userid);

    int insert(Userrecord record);

    int insertSelective(Userrecord record);

    List<Userrecord> selectByExample(UserrecordExample example);

    Userrecord selectByPrimaryKey(Integer userid);

    int updateByExampleSelective(@Param("record") Userrecord record, @Param("example") UserrecordExample example);

    int updateByExample(@Param("record") Userrecord record, @Param("example") UserrecordExample example);

    int updateByPrimaryKeySelective(Userrecord record);

    int updateByPrimaryKey(Userrecord record);
}