package cn.edu.hfut.xc.bookauthordemo.provider.service.Impl;

import cn.edu.hfut.xc.bookauthordemo.common.entity.NationEnum;
import cn.edu.hfut.xc.bookauthordemo.common.model.*;
import cn.edu.hfut.xc.bookauthordemo.provider.BookAuthorDemoProviderApplication;
import cn.edu.hfut.xc.bookauthordemo.provider.service.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by sunwei on 2018/1/18 Time:15:40
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = BookAuthorDemoProviderApplication.class)
public class AuthorWithBookTest {

    @Autowired
    private AuthorService authorService;

    @Autowired
    private BookService bookService;

    @Autowired
    private AuthorBookService authorBookService;

    private BookClassService bookClassService;

    private PublisherService publisherService;

    private LibraryService libraryService;

    private ShopService shopService;


    private BookWithNationality bookWithNationality;

    private BookWithShop bookWithShop;

    private BookWithLibrary bookWithLibrary;


    @Autowired
    private NationalityService nationalityService;
    @Test
    public void insert(){
        Author author = new Author();
        Book book = new Book();
        Nationality nationality = new Nationality();
        AuthorWithBook authorWithBook = new AuthorWithBook();
        //设置添加国籍
        nationality.setNationalityName("伊拉克");
        nationality.setNationalityLife("68年");
        nationality.setNationalityCreatedTime("1950年6月20号");
        nationality.setNationalityLocation("中亚");
        nationalityService.insert(nationality);

        //设置作者信息
        author.setAuthorName("小工");
        author.setUserName("xiaogong");
        author.setPhoneNumber("1876546746");
        author.setIdCode("184384347349349434");
        author.setQqNumber("8447384384");
        author.setNationalityId(nationality.getId());
        author.setNation(NationEnum.HAN.getDesc());
        author.setWechatNumber("238488483");
        author.setSinaMicroblogNumber("8484584");
        authorService.insert(author);

        book.setBookName("骆驼祥子");
        //
    }
}
