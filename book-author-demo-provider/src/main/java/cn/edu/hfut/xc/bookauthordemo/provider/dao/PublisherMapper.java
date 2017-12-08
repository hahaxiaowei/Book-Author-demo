package cn.edu.hfut.xc.bookauthordemo.provider.dao;

import cn.edu.hfut.xc.bookauthordemo.common.model.Publisher;

public interface PublisherMapper {
    /**
     * 根据主键删除出版商信息
     * @param id
     * @return
     */
    int deleteByPrimaryKey(String id);

    /**
     * 插入出版商信息
     * @param record
     * @return
     */
    int insert(Publisher record);

    /**
     * 有条件的插入出版商信息
     * @param record
     * @return
     */
    int insertSelective(Publisher record);

    /**
     * 根据主键查询出版商信息
     * @param id
     * @return
     */
    Publisher selectByPrimaryKey(String id);

    /**
     * 有条件的更新出版商信息
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(Publisher record);

    /**
     * 更新出版商信息
     * @param record
     * @return
     */
    int updateByPrimaryKey(Publisher record);
}