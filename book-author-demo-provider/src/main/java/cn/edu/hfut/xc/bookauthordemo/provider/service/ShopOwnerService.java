package cn.edu.hfut.xc.bookauthordemo.provider.service;

import cn.edu.hfut.xc.bookauthordemo.common.model.ShopOwner;

/**
 * Created by sunwei on 2017/12/8 Time:9:42
 */
public interface ShopOwnerService {

    /**
     * 根据主键删除店主信息
     * @param id
     * @return
     */
    int deleteByPrimaryKey(String id);

    /**
     * 插入店主信息
     * @param record
     * @return
     */
    int insert(ShopOwner record);

    /**
     * 有条件的插入店主信息
     * @param record
     * @return
     */
    int insertSelective(ShopOwner record);

    /**
     * 根据主键查询店主信息
     * @param id
     * @return
     */
    ShopOwner selectByPrimaryKey(String id);

    /**
     * 有条件的更新店主信息
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(ShopOwner record);

    /**
     * 更新店主信息
     * @param record
     * @return
     */
    int updateByPrimaryKey(ShopOwner record);
}
