package cn.edu.hfut.xc.bookauthordemo.provider.dao;

import cn.edu.hfut.xc.bookauthordemo.common.model.Author;
import cn.edu.hfut.xc.bookauthordemo.common.model.AuthorExample;
import cn.edu.hfut.xc.bookauthordemo.common.model.Book;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AuthorMapper {
    long countByExample(AuthorExample example);

    int deleteByPrimaryKey(String id);

    int insert(Author record);

    int insertSelective(Author record);

    List<Author> selectByExample(AuthorExample example);

    Author selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Author record);

    int updateByPrimaryKey(Author record);

    /**
     * 根据某个字段来查询数据
     */
    List<Author> selectByColumn(Author author);

    /**
     * 根据手机号查询作者信息
     * @param phoneNumber
     * @return Author
     */
    Author selectByPhoneNumber(String phoneNumber);

    /**
     * 根据邮箱号查询作者信息
     * @param emailNumber
     * @return Author
     */
    Author selectByEmailNumber(String emailNumber);

    /**
     * 根据用户名查询作者信息
     * @param userName
     * @return Author
     */
    Author selectByUserName(String userName);

    /**
     * 根据身份证号查询作者信息
     * @param idCode
     * @return
     */
    Author selectByIDCard(String idCode);

    /**
     * 查询所有作者信息
     */
    List<Author> selectAll();

    /**
     * @param bookId
     * @return java.util.List<cn.edu.hfut.xc.bookauthordemo.common.model.Author>
     * @description 根据bookId查询作者信息
     * @method selectByBookId
     */
    List<Author> selectAuthorsByBookId(@Param("bookId") String bookId);

    /**
     * @param nationalityId
     * @return java.util.List<cn.edu.hfut.xc.bookauthordemo.common.model.Author>
     * @description 根据国籍id查询该国籍下的作者信息
     * @method selectAuthorsByNationalityId
     */
    List<Author> selectAuthorsByNationalityId(@Param("nationalityId") String nationalityId);

    /**
     * 根据主键查询作者和该作者所写的书
     * @param id
     * @return
     */
    Author selectAuthorBookByPrimaryKey(String id);

}