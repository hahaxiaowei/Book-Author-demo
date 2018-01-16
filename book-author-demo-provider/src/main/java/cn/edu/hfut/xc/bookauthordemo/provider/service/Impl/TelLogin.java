package cn.edu.hfut.xc.bookauthordemo.provider.service.Impl;

import cn.edu.hfut.xc.bookauthordemo.common.model.Author;
import cn.edu.hfut.xc.bookauthordemo.common.model.AuthorInfo;
import cn.edu.hfut.xc.bookauthordemo.common.util.Result;
import cn.edu.hfut.xc.bookauthordemo.provider.service.AuthorService;
import cn.edu.hfut.xc.bookauthordemo.provider.service.LoginHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by sunwei on 2018/1/11 Time:8:47
 */
@Service
public class TelLogin extends LoginHandler {

    @Autowired
    private AuthorService authorService;

    @Autowired
    private EmailLogin emailLogin;


    /**
     * 手机号登录
     * @param authorInfo
     * @return Result 返回的Result里面包括数据库作者信息，前端传入的作者信息，和邮箱登录信息
     */
    @Override
    public Result handler(AuthorInfo authorInfo) {
        Author author = null;
        if (preHandler(authorInfo.getPhoneNumber())) {
            author = authorService.selectByPhoneNumber(authorInfo.getPhoneNumber());
        }
        return getResult(author, authorInfo, emailLogin);
    }

    @Override
    public boolean preHandler(String authorName) {
        return true;
    }
}
