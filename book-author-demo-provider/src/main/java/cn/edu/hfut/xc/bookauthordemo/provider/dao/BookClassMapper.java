package cn.edu.hfut.xc.bookauthordemo.provider.dao;

import cn.edu.hfut.xc.bookauthordemo.common.model.BookClass;

public interface BookClassMapper {
    int deleteByPrimaryKey(String id);

    int insert(BookClass record);

    int insertSelective(BookClass record);

    BookClass selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(BookClass record);

    int updateByPrimaryKey(BookClass record);
}