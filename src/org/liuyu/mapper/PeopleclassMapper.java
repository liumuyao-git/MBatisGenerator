package org.liuyu.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.liuyu.entity.Peopleclass;
import org.liuyu.entity.PeopleclassExample;

public interface PeopleclassMapper {
    long countByExample(PeopleclassExample example);

    int deleteByExample(PeopleclassExample example);

    int deleteByPrimaryKey(Integer classid);

    int insert(Peopleclass record);

    int insertSelective(Peopleclass record);

    List<Peopleclass> selectByExample(PeopleclassExample example);

    Peopleclass selectByPrimaryKey(Integer classid);

    int updateByExampleSelective(@Param("record") Peopleclass record, @Param("example") PeopleclassExample example);

    int updateByExample(@Param("record") Peopleclass record, @Param("example") PeopleclassExample example);

    int updateByPrimaryKeySelective(Peopleclass record);

    int updateByPrimaryKey(Peopleclass record);
}