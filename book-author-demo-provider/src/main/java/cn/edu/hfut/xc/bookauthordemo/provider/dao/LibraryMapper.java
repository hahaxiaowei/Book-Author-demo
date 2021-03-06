package cn.edu.hfut.xc.bookauthordemo.provider.dao;

import cn.edu.hfut.xc.bookauthordemo.common.model.Author;
import cn.edu.hfut.xc.bookauthordemo.common.model.Library;
import cn.edu.hfut.xc.bookauthordemo.common.model.LibraryExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LibraryMapper {
    long countByExample(LibraryExample example);

    int deleteByPrimaryKey(String id);

    int insert(Library record);

    int insertSelective(Library record);

    List<Library> selectByExample(LibraryExample example);

    Library selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Library record);

    int updateByPrimaryKey(Library record);

    /**
     * 根据图书馆的某个字段来查询数据
     */
    List<Library> selectByColumn(Library library);

    /**
     * 查询所有信息
     */
    List<Library> selectAll();

    Library selectLibraryBookByPrimaryKey(String id);

    List<Library> selectLibraryWithBook();

    /**
     * 根据国籍id查询该国籍下的图书馆信息
     * @param libraryNationalityId
     * @return
     */
    List<Library> selectLibraryByNationalityId(@Param("libraryNationalityId") String libraryNationalityId);
}