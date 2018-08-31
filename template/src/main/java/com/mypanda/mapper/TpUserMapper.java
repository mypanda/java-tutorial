package com.mypanda.mapper;

import com.mypanda.pojo.TpUser;
import com.mypanda.pojo.TpUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TpUserMapper {
    int countByExample(TpUserExample example);

    int deleteByExample(TpUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TpUser record);

    int insertSelective(TpUser record);

    List<TpUser> selectByExample(TpUserExample example);

    TpUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TpUser record, @Param("example") TpUserExample example);

    int updateByExample(@Param("record") TpUser record, @Param("example") TpUserExample example);

    int updateByPrimaryKeySelective(TpUser record);

    int updateByPrimaryKey(TpUser record);
}