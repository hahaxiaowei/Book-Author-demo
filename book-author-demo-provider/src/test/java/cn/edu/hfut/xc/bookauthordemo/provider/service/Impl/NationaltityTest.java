package cn.edu.hfut.xc.bookauthordemo.provider.service.Impl;

import cn.edu.hfut.xc.bookauthordemo.common.model.Nationality;
import cn.edu.hfut.xc.bookauthordemo.common.util.Result;
import cn.edu.hfut.xc.bookauthordemo.provider.BookAuthorDemoProviderApplication;
import cn.edu.hfut.xc.bookauthordemo.provider.service.NationalityService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * Created by sunwei on 2018/1/9 Time:16:58
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = BookAuthorDemoProviderApplication.class)
public class NationaltityTest {
    private static Logger logger = LoggerFactory.getLogger(NationalityServiceImpl.class);

    @Autowired(required = false)
    private NationalityService nationalityService;

    @Test
    public void insert() {
        Nationality nationality = new Nationality();
        nationality.setNationalityName("美国");
        nationality.setNationalityLocation("北美洲中部");
        nationality.setNationalityLife("200");
        Date date = new Date();
        nationality.setNationalityCreatedTime(String.valueOf(date));
        Result result = new Result();
        result.setData(nationalityService.insert(nationality));
        logger.info("插入结果为：" + result);
    }

    @Test
    public void selectNationaltiyByColumn() {
        Nationality nationality = new Nationality();
        nationality.setNationalityName("美国");
        nationality.setNationalityLocation("北美洲中部");
        nationality.setNationalityLife("200");
        List<Nationality> list = nationalityService.selectByColumn(nationality);

//        遍历list方式：1.增强型for循环 2.迭代器 3.一般for循环
        for (Nationality n: list
             ) {
            logger.info("**************增强型for循环**********************");
            logger.info("结果为"+n.toString());
            logger.info("************************************************");
        }

        for(int i = 0; i <list.size() ; i++) {
            Nationality nationality1 = (Nationality) list.get(i);
            logger.info("***************一般for循环*************************");
            logger.info("查询结果为："+ nationality1.toString());
            logger.info("***************************************************");
        }

//        迭代器
        Iterator<Nationality> iterator = list.iterator();
        while (iterator.hasNext()){
            logger.info("**********************迭代器*****************************");
            logger.info("查询结果为："+iterator.next().toString());
            logger.info("*********************************************************");
        }
    }

}
