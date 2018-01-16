package cn.edu.hfut.xc.bookauthordemo.provider.dao;

import cn.edu.hfut.xc.bookauthordemo.common.model.Author;
import cn.edu.hfut.xc.bookauthordemo.common.model.ShopWithShopOwner;
import cn.edu.hfut.xc.bookauthordemo.common.model.ShopWithShopOwnerExample;
import java.util.List;

public interface ShopWithShopOwnerMapper {
    long countByExample(ShopWithShopOwnerExample example);

    int deleteByPrimaryKey(String id);

    int insert(ShopWithShopOwner record);

    int insertSelective(ShopWithShopOwner record);

    List<ShopWithShopOwner> selectByExample(ShopWithShopOwnerExample example);

    ShopWithShopOwner selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ShopWithShopOwner record);

    int updateByPrimaryKey(ShopWithShopOwner record);

    /**
     * 查询所有作者信息
     */
    List<ShopWithShopOwner> selectAll();
}