package cn.edu.hfut.xc.bookauthordemo.provider.dao;

import cn.edu.hfut.xc.bookauthordemo.common.model.Nationality;

public interface NationalityMapper {
    int deleteByPrimaryKey(String id);

    int insert(Nationality record);

    int insertSelective(Nationality record);

    Nationality selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Nationality record);

    int updateByPrimaryKey(Nationality record);
}