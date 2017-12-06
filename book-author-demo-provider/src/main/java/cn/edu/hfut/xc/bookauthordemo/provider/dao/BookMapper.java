package cn.edu.hfut.xc.bookauthordemo.provider.dao;

import cn.edu.hfut.xc.bookauthordemo.common.model.Book;

public interface BookMapper {
    int deleteByPrimaryKey(String id);

    int insert(Book record);

    int insertSelective(Book record);

    Book selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Book record);

    int updateByPrimaryKey(Book record);
}