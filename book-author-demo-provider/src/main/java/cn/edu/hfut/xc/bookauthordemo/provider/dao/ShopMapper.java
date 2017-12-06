package cn.edu.hfut.xc.bookauthordemo.provider.dao;

import cn.edu.hfut.xc.bookauthordemo.common.model.Shop;

public interface ShopMapper {
    int deleteByPrimaryKey(String id);

    int insert(Shop record);

    int insertSelective(Shop record);

    Shop selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Shop record);

    int updateByPrimaryKey(Shop record);
}