package cn.edu.hfut.xc.bookauthordemo.provider.dao;

import cn.edu.hfut.xc.bookauthordemo.common.model.Library;

public interface LibraryMapper {
    int deleteByPrimaryKey(String id);

    int insert(Library record);

    int insertSelective(Library record);

    Library selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Library record);

    int updateByPrimaryKey(Library record);
}