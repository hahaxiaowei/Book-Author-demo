package cn.edu.hfut.xc.bookauthordemo.provider.dao;

import cn.edu.hfut.xc.bookauthordemo.common.model.Book;

public interface BookMapper {
    /**
     * 根据主键删除图书
     * @param id
     * @return
     */
    int deleteByPrimaryKey(String id);

    /**
     * 插入新的图书
     * @param record
     * @return
     */
    int insert(Book record);

    /**
     * 有条件的插入图书信息
     * @param record
     * @return
     */
    int insertSelective(Book record);

    /**
     * 根据主键查询图书信息
     * @param id
     * @return
     */
    Book selectByPrimaryKey(String id);

    /**
     * 有条件的更新图书信息
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(Book record);

    /**
     * 更新图书信息
     * @param record
     * @return
     */
    int updateByPrimaryKey(Book record);
}