package cn.edu.hfut.xc.bookauthordemo.provider.service;

import cn.edu.hfut.xc.bookauthordemo.common.model.Author;
import cn.edu.hfut.xc.bookauthordemo.common.model.AuthorInfo;
import cn.edu.hfut.xc.bookauthordemo.common.util.Pagination;
import cn.edu.hfut.xc.bookauthordemo.common.util.Result;

import java.util.List;

/**
 * Created by sunwei on 2017/12/6 Time:17:25
 */
public interface AuthorService {

    /**
     * 根据主键查询作者信息
     * @param id
     * @return
     */
    int deleteByPrimaryKey(String id);

    /**
     * 插入作者信息
     * @param record
     * @return
     */
    int insert(Author record);

    /**
     * 有条件的插入作者信息
     * @param record
     * @return
     */
    int insertSelective(Author record);

    /**
     * 根据主键查询作者信息
     * @param id
     * @return
     */
    Author selectByPrimaryKey(String id);

    /**
     * 分页查询
     * @param authorName
     * @param pageNum
     * @param pageSize
     * @return
     */
    Pagination<Author> selectPageQuery (String authorName, int pageNum , int pageSize);

    /**
     * 有条件更新作者信息
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(Author record);

    /**
     * 根据作者的主键更新作者信息
     * @param record
     * @return
     */
    int updateByPrimaryKey(Author record);

    /**
     * 判断作者的手机号是不是已存在
     */
    Result isPhoneNumberExist(String phoneNumber);

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

    Result login(AuthorInfo authorInfo);

    /**
     * 获取验证码
     * @param phoneNum
     * @return
     */
    Result getVerificatCode(String phoneNum);

    /**
     * 判断输入的验证码是否正确
     * @param verificationcode
     * @param epeo_Tel
     * @return
     */
    Boolean isVerificatCorrect(String verificationcode, String epeo_Tel);

    /**
     * 查询所有作者信息
     */
    List<Author> selectAll();

}
