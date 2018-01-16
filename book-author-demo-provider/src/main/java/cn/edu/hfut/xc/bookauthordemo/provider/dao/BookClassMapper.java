package cn.edu.hfut.xc.bookauthordemo.provider.dao;

import cn.edu.hfut.xc.bookauthordemo.common.model.Author;
import cn.edu.hfut.xc.bookauthordemo.common.model.BookClass;
import cn.edu.hfut.xc.bookauthordemo.common.model.BookClassExample;
import java.util.List;

public interface BookClassMapper {
    long countByExample(BookClassExample example);

    int deleteByPrimaryKey(String id);

    int insert(BookClass record);

    int insertSelective(BookClass record);

    List<BookClass> selectByExample(BookClassExample example);

    BookClass selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(BookClass record);

    int updateByPrimaryKey(BookClass record);

    /**
     * 根据图书分类的某个字段来查询数据
     */
    List<BookClass> selectByColumn(BookClass bookClass);

    /**
     * 查询所有信息
     */
    List<BookClass> selectAll();
}