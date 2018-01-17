package cn.edu.hfut.xc.bookauthordemo.provider.service;

import cn.edu.hfut.xc.bookauthordemo.common.model.Book;
import cn.edu.hfut.xc.bookauthordemo.common.util.Pagination;

import java.util.List;

/**
 * Created by sunwei on 2017/12/6 Time:17:25
 */
public interface BookService {

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
     * 分页查询
     * @param bookName
     * @param pageNum
     * @param pageSize
     * @return
     */
    Pagination<Book> selectPageQuery (String bookName, int pageNum , int pageSize);

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

    /**
     * 查询所有信息
     */
    List<Book> selectAll();
}
