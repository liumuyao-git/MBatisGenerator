package org.liuyu.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.liuyu.entity.Peoplecard;
import org.liuyu.entity.PeoplecardExample;

public interface PeoplecardMapper {
    long countByExample(PeoplecardExample example);

    int deleteByExample(PeoplecardExample example);

    int deleteByPrimaryKey(Integer cardid);

    int insert(Peoplecard record);

    int insertSelective(Peoplecard record);

    List<Peoplecard> selectByExample(PeoplecardExample example);

    Peoplecard selectByPrimaryKey(Integer cardid);

    int updateByExampleSelective(@Param("record") Peoplecard record, @Param("example") PeoplecardExample example);

    int updateByExample(@Param("record") Peoplecard record, @Param("example") PeoplecardExample example);

    int updateByPrimaryKeySelective(Peoplecard record);

    int updateByPrimaryKey(Peoplecard record);
}