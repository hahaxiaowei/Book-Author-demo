package cn.edu.hfut.xc.bookauthordemo.provider.service.Impl;

import cn.edu.hfut.xc.bookauthordemo.common.model.Author;
import cn.edu.hfut.xc.bookauthordemo.common.model.AuthorExample;
import cn.edu.hfut.xc.bookauthordemo.common.model.AuthorInfo;
import cn.edu.hfut.xc.bookauthordemo.common.util.EncryptUtil;
import cn.edu.hfut.xc.bookauthordemo.common.util.Pagination;
import cn.edu.hfut.xc.bookauthordemo.common.util.Result;
import cn.edu.hfut.xc.bookauthordemo.common.util.StringUtil;
import cn.edu.hfut.xc.bookauthordemo.provider.config.BusinessUtils;
import cn.edu.hfut.xc.bookauthordemo.provider.config.RedisUtils;
import cn.edu.hfut.xc.bookauthordemo.provider.dao.AuthorMapper;
import cn.edu.hfut.xc.bookauthordemo.provider.service.AuthorService;
import com.alibaba.fastjson.JSON;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by sunwei on 2017/12/6 Time:17:26
 */
@Service
public class AuthorServiceImpl implements AuthorService {

    private static Logger logger = LoggerFactory.getLogger(AuthorServiceImpl.class);

    @Autowired
    private AuthorMapper authorMapper;

    @Autowired
    private TelLogin telLogin;

    public static String LOGIN_AUTHENTICATION_ = "LOGIN_AUTHENTICATION_";

    /**
     * 登录验证
     *
     * @param authorInfo
     * @return
     */
    @Override
    public Result login(AuthorInfo authorInfo) {
        Result result = new Result();
        try {
            if (StringUtil.isNullOrEmpty(authorInfo.getPassword()) || StringUtil.isNullOrEmpty(authorInfo.getPhoneNumber())) {
                result.setRetCode(Result.RECODE_VALIDATE_ERROR);
                result.setErrMsg("用户名或密码不正确！");
                return result;
            }
            String ps = EncryptUtil.encryptPassWord(authorInfo.getPassword());
            authorInfo.setPassword(ps);
            Result telHandler = telLogin.handler(authorInfo);
            result = telHandler;
        } catch (Exception e) {
            result.setRetCode(Result.RECODE_ERROR);
            result.setErrMsg("执行出错");
            logger.error("方法执行出错", e);
            throw new RuntimeException(e);
        }
        return result;
    }

    /**
     * @param id
     * @return int
     * @description
     * @method deleteByPrimaryKey
     */
    @Override
    public int deleteByPrimaryKey(String id) {
        return authorMapper.deleteByPrimaryKey(id);
    }

    /**
     * @param record
     * @return int
     * @description
     * @method insert
     */
    @Override
    public int insert(Author record) {
        //进行MD5加密
        record.setPassword(EncryptUtil.encryptPassWord(record.getPassword()));
        return authorMapper.insert(record);
    }

    /**
     * @param record
     * @return int
     * @description
     * @method insertSelective
     */
    @Override
    public int insertSelective(Author record) {
        //进行MD5加密
        record.setPassword(EncryptUtil.encryptPassWord(record.getPassword()));
        return authorMapper.insertSelective(record);
    }

    /**
     * @param id
     * @return cn.edu.hfut.xc.bookauthordemo.common.model.Author
     * @description 根据主键查询作者信息
     * @method selectByPrimaryKey
     */
    @Cacheable(value = "data", key = "#id")
    @Override
    public Author selectByPrimaryKey(String id) {
        return authorMapper.selectByPrimaryKey(id);
    }

    /**
     * @param authorName
     * @param pageNum
     * @param pageSize
     * @return cn.edu.hfut.xc.bookauthordemo.common.util.Pagination<cn.edu.hfut.xc.bookauthordemo.common.model.Author>
     * @description 分页查询，根据作者的姓名分页查询
     * @method selectPageQuery
     */
    @Cacheable(value = "data", key = "#authorName+'_'+#pageNum+'_'+#pageSize")
    @Override
    public Pagination<Author> selectPageQuery(String authorName, int pageNum, int pageSize) {

        AuthorExample authorExample = new AuthorExample();
        //如果查询的名字不为空，则创建这个条件
        if (!StringUtil.isNullOrEmpty(authorName)) {
            authorExample.createCriteria().andAuthorNameLike(authorName);
        }
        Page<Author> page = PageHelper.startPage(pageNum, pageSize);
        List<Author> list = authorMapper.selectByExample(authorExample);
        Pagination<Author> pagination = new Pagination<Author>(list, page.getTotal());
        return pagination;
    }

    @Override
    public int updateByPrimaryKeySelective(Author record) {
        return authorMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Author record) {
        return authorMapper.updateByPrimaryKey(record);
    }


    /**
     * @param phoneNumber
     * @return cn.edu.hfut.xc.bookauthordemo.common.util.Result
     * @description 判断手机号是否注册过
     * @method isPhoneNumberExist
     */
    @Override
    public Result isPhoneNumberExist(String phoneNumber) {

        Result result = new Result();
        Boolean tag = true;
        try {
            Author author = new Author();
            author.setPhoneNumber(phoneNumber);
            List<Author> list = authorMapper.selectByColumn(author);
            if (StringUtil.isNullOrEmpty(list) || list.size() == 0) {
                tag = false;
                result.setData(tag);
                return result;
            }
            result.setData(tag);
        } catch (Exception e) {
            result.setRetCode(Result.RECODE_ERROR);
            result.setErrMsg("方法执行出错");
            logger.error("方法执行出错", e);
            throw new RuntimeException(e);
        }
        return result;
    }

    /**
     * @param phoneNumber
     * @return cn.edu.hfut.xc.bookauthordemo.common.model.Author
     * @description 根据手机号查询
     * @method selectByPhoneNumber
     */
    @Override
    public Author selectByPhoneNumber(String phoneNumber) {

        return authorMapper.selectByPhoneNumber(phoneNumber);
    }

    /**
     * @param emailNumber
     * @return cn.edu.hfut.xc.bookauthordemo.common.model.Author
     * @description 根据邮箱号查询
     * @method selectByEmailNumber
     */
    @Override
    public Author selectByEmailNumber(String emailNumber) {
        return authorMapper.selectByEmailNumber(emailNumber);
    }

    /**
     * @param userName
     * @return cn.edu.hfut.xc.bookauthordemo.common.model.Author
     * @description 根据用户名查询
     * @method selectByUserName
     */
    @Override
    public Author selectByUserName(String userName) {

        return authorMapper.selectByUserName(userName);
    }

    /**
     * @param idCode
     * @return cn.edu.hfut.xc.bookauthordemo.common.model.Author
     * @description 根据身份证号查询作者信息
     * @method selectByIDCard
     */
    @Override
    public Author selectByIDCard(String idCode) {

        return authorMapper.selectByIDCard(idCode);
    }

    @Override
    public Result getVerificatCode(String phoneNum) {
        Result result = new Result();
        try {
            if (StringUtil.isNullOrEmpty(phoneNum)) {
                result.setRetCode(Result.RECODE_ERROR);
                result.setErrMsg("手机号为空");
                return result;
            }
            if (!StringUtil.isNullOrEmpty(authorMapper.selectByPhoneNumber(phoneNum))) {
                result.setRetCode(Result.RECODE_ERROR);
                result.setErrMsg("手机号已存在");
                return result;
            }
            //返回验证码和时间
            Map<String, Object> codeMap = BusinessUtils.getValidVerificatCode(phoneNum);
            result.setData(codeMap);
        } catch (Exception e) {
            result.setRetCode(Result.RECODE_ERROR);
            result.setErrMsg("获取验证码错误" + e);
            logger.error("方法执行出错", e);
            throw new RuntimeException(e);
        }
        return result;
    }

    @Override
    public Boolean isVerificatCorrect(String verificationcode, String epeo_Tel) {
        Boolean tag = false;
        try {
            String value = RedisUtils.getInstance().getValue(LOGIN_AUTHENTICATION_ + epeo_Tel);
            logger.info("查到数据为" + value);
            if (StringUtil.isNullOrEmpty(value)) {
                return tag;
            }
            Map<String, Object> mapRedis = JSON.parseObject(value, Map.class);
            String code = String.valueOf(mapRedis.get("verificatCode"));
            logger.info("redis里面存放到验证码为：" + code);
            if (verificationcode.equals(code)) {
                tag = true;
            }
        } catch (Exception e) {
            logger.error("isVerificatCorrect方法执行异常" + e.getMessage() + e);
            throw new RuntimeException(e);
        }
        return tag;
    }

    /**
     * @param bookId
     * @return java.util.List<cn.edu.hfut.xc.bookauthordemo.common.model.Author>
     * @description 根据图书id查询该图书的作者信息
     * @method selectByBookId
     */
    @Override
    public List<Author> selectAuthorsByBookId(String bookId) {

        return authorMapper.selectAuthorsByBookId(bookId);
    }

    @Override
    public List<Author> selectAll() {
        return authorMapper.selectAll();
    }

    @Override
    public Author selectAuthorBookByPrimaryKey(String id) {
        return authorMapper.selectAuthorBookByPrimaryKey(id);
    }

    @Override
    public List<Author> selectAuthorsByNationalityId(String nationalityId) {
        return authorMapper.selectAuthorsByNationalityId(nationalityId);
    }
}
