package com.nmfun.server.dao;


import com.nmfun.server.vo.TestDao;
import com.nmfun.server.vo.TestDaoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TestDaoMapper {
    long countByExample(TestDaoExample example);

    int deleteByExample(TestDaoExample example);

    int deleteByPrimaryKey(String id);

    int insert(TestDao record);

    int insertSelective(TestDao record);

    List<TestDao> selectByExample(TestDaoExample example);

    TestDao selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TestDao record, @Param("example") TestDaoExample example);

    int updateByExample(@Param("record") TestDao record, @Param("example") TestDaoExample example);

    int updateByPrimaryKeySelective(TestDao record);

    int updateByPrimaryKey(TestDao record);
}