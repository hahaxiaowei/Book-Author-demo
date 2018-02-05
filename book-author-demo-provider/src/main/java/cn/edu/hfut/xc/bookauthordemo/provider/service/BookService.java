package cn.edu.hfut.xc.bookauthordemo.provider.service;

import cn.edu.hfut.xc.bookauthordemo.common.entity.BookVo;
import cn.edu.hfut.xc.bookauthordemo.common.model.Author;
import cn.edu.hfut.xc.bookauthordemo.common.model.Book;
import cn.edu.hfut.xc.bookauthordemo.common.util.Pagination;
import org.apache.ibatis.annotations.Param;

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
    Pagination<BookVo> selectPageQuery (String bookName, int pageNum , int pageSize);

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


    /**
     * @param authorId
     * @return java.util.List<cn.edu.hfut.xc.bookauthordemo.common.model.Book>
     * @description 根据作者id来获取该作者所写的图书信息
     * @method selectBooksByAuthorId
     */
    List<Book> selectBooksByAuthorId(@Param("authorId") String authorId);

    //根据图书馆id查询图书信息
    List<Book> selectBooksByLibraryId(@Param("libraryId") String libraryId);

    //根据商店id查询商店售卖的图书信息
    List<Book> selectBooksByShopId(@Param("shopId") String shopId);

    //根据商店id查询商店售卖的图书信息
    List<Book> selectBooksByNationalityId(@Param("nationalityId") String nationalityId);

    /**
     * @param id
     * @return cn.edu.hfut.xc.bookauthordemo.common.model.Book
     * @description 根据主键查询图书信息
     * @method selectBookAuthorByPrimaryKey
     */
    Book selectBookAuthorByPrimaryKey(String id);

    /*
     * @param
     * @return java.util.List<cn.edu.hfut.xc.bookauthordemo.common.model.Book>
     * @description 查询所有图书信息
     * @method selectBookWithAuthor
     */
    List<Book> selectBookWithAuthor();

    /**
     * @param id
     * @return cn.edu.hfut.xc.bookauthordemo.common.model.Book
     * @description 根据主键查询图书信息包括该书所在的图书馆信息
     * @method selectBookLibraryByPrimaryKey
     */
    Book selectBookLibraryByPrimaryKey(String id);

    /**
     * @param
     * @return java.util.List<cn.edu.hfut.xc.bookauthordemo.common.model.Book>
     * @description 查询所有图书信息和该图书所在的图书馆信息
     * @method selectBookWithLibrary
     */
    List<Book> selectBookWithLibrary();

//    PageList<Book> pageSelect(String bookName, int pageNum , int pageSize );
}
