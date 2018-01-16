package cn.edu.hfut.xc.bookauthordemo.provider.service;

import cn.edu.hfut.xc.bookauthordemo.common.model.Book;
import cn.edu.hfut.xc.bookauthordemo.common.model.Library;
import cn.edu.hfut.xc.bookauthordemo.common.util.Pagination;

/**
 * Created by sunwei on 2017/12/8 Time:9:40
 */
public interface LibraryService {

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
     * 分页查询
     * @param libraryName
     * @param pageNum
     * @param pageSize
     * @return
     */
    Pagination<Library> selectPageQuery (String libraryName, int pageNum , int pageSize);

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
