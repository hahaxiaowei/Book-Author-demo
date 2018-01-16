package cn.edu.hfut.xc.bookauthordemo.provider.dao;

import cn.edu.hfut.xc.bookauthordemo.common.model.Author;
import cn.edu.hfut.xc.bookauthordemo.common.model.BookWithLibrary;
import cn.edu.hfut.xc.bookauthordemo.common.model.BookWithLibraryExample;
import java.util.List;

public interface BookWithLibraryMapper {
    long countByExample(BookWithLibraryExample example);

    int deleteByPrimaryKey(String id);

    int insert(BookWithLibrary record);

    int insertSelective(BookWithLibrary record);

    List<BookWithLibrary> selectByExample(BookWithLibraryExample example);

    BookWithLibrary selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(BookWithLibrary record);

    int updateByPrimaryKey(BookWithLibrary record);

    /**
     * 查询所有作者信息
     */
    List<BookWithLibrary> selectAll();
}