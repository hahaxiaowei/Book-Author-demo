package cn.edu.hfut.xc.bookauthordemo.provider.dao;

import cn.edu.hfut.xc.bookauthordemo.common.model.Publisher;

public interface PublisherMapper {
    int deleteByPrimaryKey(String id);

    int insert(Publisher record);

    int insertSelective(Publisher record);

    Publisher selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Publisher record);

    int updateByPrimaryKey(Publisher record);
}