package cn.edu.hfut.xc.bookauthordemo.provider.dao;

import cn.edu.hfut.xc.bookauthordemo.common.model.Author;
import cn.edu.hfut.xc.bookauthordemo.common.model.Shop;
import cn.edu.hfut.xc.bookauthordemo.common.model.ShopOwner;
import cn.edu.hfut.xc.bookauthordemo.common.model.ShopOwnerExample;
import java.util.List;

public interface ShopOwnerMapper {
    long countByExample(ShopOwnerExample example);

    int deleteByPrimaryKey(String id);

    int insert(ShopOwner record);

    int insertSelective(ShopOwner record);

    List<ShopOwner> selectByExample(ShopOwnerExample example);

    ShopOwner selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ShopOwner record);

    int updateByPrimaryKey(ShopOwner record);

    /**
     * 根据店主的某个字段来查询数据
     * @param shopOwner
     * @return
     */
    List<ShopOwner> selectByColumn(ShopOwner shopOwner);

    /**
     * 查询所有作者信息
     */
    List<ShopOwner> selectAll();
}