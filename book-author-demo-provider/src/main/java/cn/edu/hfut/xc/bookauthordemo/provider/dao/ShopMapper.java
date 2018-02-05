package cn.edu.hfut.xc.bookauthordemo.provider.dao;

import cn.edu.hfut.xc.bookauthordemo.common.model.Author;
import cn.edu.hfut.xc.bookauthordemo.common.model.Shop;
import cn.edu.hfut.xc.bookauthordemo.common.model.ShopExample;
import cn.edu.hfut.xc.bookauthordemo.common.model.ShopOwner;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShopMapper {
    long countByExample(ShopExample example);

    int deleteByPrimaryKey(String id);

    int insert(Shop record);

    int insertSelective(Shop record);

    List<Shop> selectByExample(ShopExample example);

    Shop selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Shop record);

    int updateByPrimaryKey(Shop record);

    /**
     * 根据商店里面某个字段来查询数据
     * @param shop
     * @return
     */
    List<Shop> selectByColumn(Shop shop);

    /**
     * 查询所有信息
     */
    List<Shop> selectAll();

    /**
     * 根据店主id查询该店主所拥有的商店信息
     * @param shopOwnerId
     * @return
     */
    List<Shop> selectShopByShopOwnerId(@Param("shopOwnerId") String shopOwnerId);

    /**
     * 根据国籍id查询该国籍下的商店信息
     * @param shopNationalityId
     * @return
     */
    List<Shop> selectShopByNationalityId(@Param("shopNationalityId") String shopNationalityId );
}