package cn.edu.hfut.xc.bookauthordemo.provider.dao;

import cn.edu.hfut.xc.bookauthordemo.common.model.Shop;

public interface ShopMapper {
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
}