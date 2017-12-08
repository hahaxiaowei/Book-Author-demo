package cn.edu.hfut.xc.bookauthordemo.provider.dao;

import cn.edu.hfut.xc.bookauthordemo.common.model.Library;

public interface LibraryMapper {
    /**
     * 根据id删除图书馆信息
     * @param id
     * @return
     */
    int deleteByPrimaryKey(String id);

    /**
     * 插入图书馆信息
     * @param record
     * @return
     */
    int insert(Library record);

    /**
     * 有条件的插入信息
     * @param record
     * @return
     */
    int insertSelective(Library record);

    /**
     * 根据主键查询图书馆信息
     * @param id
     * @return
     */
    Library selectByPrimaryKey(String id);

    /**
     * 更新图书馆信息
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(Library record);

    /**
     * 更新图书馆信息
     * @param record
     * @return
     */
    int updateByPrimaryKey(Library record);
}