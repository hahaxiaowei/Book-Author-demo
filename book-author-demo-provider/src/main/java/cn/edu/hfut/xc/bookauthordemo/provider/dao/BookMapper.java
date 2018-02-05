package cn.edu.hfut.xc.bookauthordemo.provider.dao;

import cn.edu.hfut.xc.bookauthordemo.common.entity.BookVo;
import cn.edu.hfut.xc.bookauthordemo.common.model.Author;
import cn.edu.hfut.xc.bookauthordemo.common.model.Book;
import cn.edu.hfut.xc.bookauthordemo.common.model.BookExample;
import org.apache.ibatis.annotations.Param;

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
     * @param
     * @return java.util.List<cn.edu.hfut.xc.bookauthordemo.common.model.Book>
     * @description 查询图书信息，不包括作者
     * @method selectAll
     */
    List<Book> selectAll();

    /**
     * @param id
     * @return cn.edu.hfut.xc.bookauthordemo.common.model.Book
     * @description 根据主键查询图书信息
     * @method selectBookAuthorByPrimaryKey
     */
    Book selectBookAuthorByPrimaryKey(String id);

    //根据作者id来获取该作者所写的图书信息
    List<Book> selectBooksByAuthorId(@Param("authorId") String authorId);

    //根据图书馆id查询图书信息
    List<Book> selectBooksByLibraryId(@Param("libraryId") String libraryId);

    //根据商店id查询商店售卖的图书信息
    List<Book> selectBooksByShopId(@Param("shopId") String shopId);

    //根据国籍id查询该国籍下的图书信息
    List<Book> selectBooksByNationalityId(@Param("nationalityId") String nationalityId);


    /*
     * @param
     * @return java.util.List<cn.edu.hfut.xc.bookauthordemo.common.model.Book>
     * @description 查询所有图书信息和该图书的作者信息
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

    /**
     * 根据主键查询图书信息和售卖该图书的商店信息
     * @param id
     * @return
     */
    Book selectBookShopByPrimaryKey(String id);

    /**
     * 查询所有图书信息包括售卖该图书的商店信息
     */
    List<Book> selectBookWithShop();
}