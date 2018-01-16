package cn.edu.hfut.xc.bookauthordemo.provider.dao;

import cn.edu.hfut.xc.bookauthordemo.common.model.Author;
import cn.edu.hfut.xc.bookauthordemo.common.model.AuthorExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

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
}