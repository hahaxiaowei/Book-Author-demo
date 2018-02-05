package cn.edu.hfut.xc.bookauthordemo.provider.service;

import cn.edu.hfut.xc.bookauthordemo.common.model.Shop;
import cn.edu.hfut.xc.bookauthordemo.common.model.ShopOwner;
import cn.edu.hfut.xc.bookauthordemo.common.util.Pagination;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by sunwei on 2017/12/8 Time:9:42
 */
public interface ShopService {

    /**
     * 根据主键删除商店信息
     * @param id
     * @return
     */
    int deleteByPrimaryKey(String id);

    /**
     * 插入商店信息
     * @param record
     * @return
     */
    int insert(Shop record);

    /**
     * 有条件的插入商店信息
     * @param record
     * @return
     */
    int insertSelective(Shop record);

    /**
     * 根据主键查询商店信息
     * @param id
     * @return
     */
    Shop selectByPrimaryKey(String id);

    /**
     * 分页查询
     * @param shopName
     * @param pageNum
     * @param pageSize
     * @return
     */
    Pagination<Shop> selectPageQuery (String shopName, int pageNum , int pageSize);

    /**
     * 有条件的更新商店信息
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(Shop record);

    /**
     * 更新商店信息
     * @param record
     * @return
     */
    int updateByPrimaryKey(Shop record);

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
