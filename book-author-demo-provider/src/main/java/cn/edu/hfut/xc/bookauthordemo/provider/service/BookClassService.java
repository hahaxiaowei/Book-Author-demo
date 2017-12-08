package cn.edu.hfut.xc.bookauthordemo.provider.service;

import cn.edu.hfut.xc.bookauthordemo.common.model.BookClass;

/**
 * Created by sunwei on 2017/12/8 Time:9:40
 */
public interface BookClassService {

    /**
     * 根据id删除类别
     * @param id
     * @return
     */
    int deleteByPrimaryKey(String id);

    /**
     * 插入新的类别
     * @param record
     * @return
     */
    int insert(BookClass record);

    /**
     * 有条件的插入新的类别
     * @param record
     * @return
     */
    int insertSelective(BookClass record);

    /**
     * 根据主键查询图书类别
     * @param id
     * @return
     */
    BookClass selectByPrimaryKey(String id);

    /**
     * 有条件的更新类别
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(BookClass record);

    /**
     * 根据主键更新类别
     * @param record
     * @return
     */
    int updateByPrimaryKey(BookClass record);
}
