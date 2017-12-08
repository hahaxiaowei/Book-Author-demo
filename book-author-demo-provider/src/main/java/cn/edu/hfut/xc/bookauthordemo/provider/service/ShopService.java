package cn.edu.hfut.xc.bookauthordemo.provider.service;

import cn.edu.hfut.xc.bookauthordemo.common.model.Shop;

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
