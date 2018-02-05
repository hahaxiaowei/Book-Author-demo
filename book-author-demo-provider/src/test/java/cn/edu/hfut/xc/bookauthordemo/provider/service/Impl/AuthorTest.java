package cn.edu.hfut.xc.bookauthordemo.provider.service.Impl;

import cn.edu.hfut.xc.bookauthordemo.common.model.Author;
import cn.edu.hfut.xc.bookauthordemo.common.model.AuthorInfo;
import cn.edu.hfut.xc.bookauthordemo.common.util.Result;
import cn.edu.hfut.xc.bookauthordemo.provider.BookAuthorDemoProviderApplication;
import cn.edu.hfut.xc.bookauthordemo.provider.service.AuthorService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by sunwei on 2018/1/5 Time:14:24
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = BookAuthorDemoProviderApplication.class)
public class AuthorTest {
    private static Logger logger = LoggerFactory.getLogger(AuthorServiceImpl.class);
    @Autowired
    private AuthorService authorService;

    @Test
    public void deleteByPrimaryKey() {
        Result result = new Result();
        String id = "";
        try {
            int tag = authorService.deleteByPrimaryKey(id);
            result.setData(tag);
        } catch (Exception e) {
            logger.error("方法执行出错", e);
            throw new RuntimeException(e);
        }
        logger.info("执行结果：" + result);
    }

    @Test
    public void insert() throws Exception {
        Author author = new Author();
        author.setUserName("雨中漫步");
        author.setAuthorName("小红");
        author.setPhoneNumber("18656315534");
        author.setPassword("88888888");
        author.setNation("汉族");
        author.setNationalityId("35707478f51e11e7a28b88d7f63dcda2");
        author.setAge("20");
        author.setAddress("安徽省合肥市蜀山区清潭路716号");
        author.setSinaMicroblogNumber("飞往天空的雨");
        author.setEmailNumber("208759455@qq.com");
        author.setWechatNumber("雨中漫步");
        author.setQqNumber("208759455");
        int tag = authorService.insert(author);
        logger.info("插入结果" + tag);
        logger.info("插入的id: " + author.getId());
    }

    @Test
    public void insertSelective() throws Exception {
    }

    @Test
    public void selectByPrimaryKey() throws Exception {
    }

    @Test
    public void selectPageQuery() throws Exception {
    }

    @Test
    public void updateByPrimaryKeySelective() throws Exception {
    }

    @Test
    public void updateByPrimaryKey() throws Exception {
    }

    @Test
    public void isPhoneNumberExist() throws Exception {
        String phoneNumber = "110";
        Result result = authorService.isPhoneNumberExist(phoneNumber);
        logger.info("查询结果为" + result);
    }

    @Test
    public void login() throws Exception {
        AuthorInfo author = new AuthorInfo();
        author.setUserName("雨中漫步");
        author.setAuthorName("小红");
        author.setPhoneNumber("18656315534");
        author.setPassword("88888888");
        author.setNation("汉族");
        author.setNationalityId("35707478f51e11e7a28b88d7f63dcda2");
        author.setAge("20");
        author.setAddress("安徽省合肥市蜀山区清潭路716号");
        author.setSinaMicroblogNumber("飞往天空的雨");
        author.setEmailNumber("208759455@qq.com");
        author.setWechatNumber("雨中漫步");
        author.setQqNumber("208759455");
        Result result = authorService.login(author);
        logger.info("result结果为：" + result);
    }

    @Test
    public void loginOut() throws Exception {

    }

    @Test
    public void getVerificatCode() {
        String phoneNum = "18656315504";
        Result result = authorService.getVerificatCode(phoneNum);
        logger.info("结果为：" + result);
    }

//    @Test
//    public void selectAuthorBook(){
//        String id = "e6d8d921f9ce11e7a28b88d7f63dcda2";
//        Author author =  authorService.selectAuthorBook(id);
//        logger.info("查询的作者信息为"+author);
//    }
}