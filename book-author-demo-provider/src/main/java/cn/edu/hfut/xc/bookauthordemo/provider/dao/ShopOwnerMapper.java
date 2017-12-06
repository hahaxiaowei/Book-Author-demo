package cn.edu.hfut.xc.bookauthordemo.provider.dao;

import cn.edu.hfut.xc.bookauthordemo.common.model.ShopOwner;

public interface ShopOwnerMapper {
    int deleteByPrimaryKey(String id);

    int insert(ShopOwner record);

    int insertSelective(ShopOwner record);

    ShopOwner selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ShopOwner record);

    int updateByPrimaryKey(ShopOwner record);
}