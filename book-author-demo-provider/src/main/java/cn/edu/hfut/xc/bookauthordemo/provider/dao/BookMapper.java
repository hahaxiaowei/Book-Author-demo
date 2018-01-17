package cn.edu.hfut.xc.bookauthordemo.provider.dao;

import cn.edu.hfut.xc.bookauthordemo.common.model.Author;
import cn.edu.hfut.xc.bookauthordemo.common.model.Book;
import cn.edu.hfut.xc.bookauthordemo.common.model.BookExample;
import java.util.List;

public interface BookMapper {
    long countByExample(BookExample example);

    int deleteByPrimaryKey(String id);

    int insert(Book record);

    int insertSelective(Book record);

    List<Book> selectByExample(BookExample example);

    Book selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Book record);

    int updateByPrimaryKey(Book record);

    List<Book> selectByColumn(Book book);

    /**
     * 查询所有信息
     */
    List<Book> selectAll();
}