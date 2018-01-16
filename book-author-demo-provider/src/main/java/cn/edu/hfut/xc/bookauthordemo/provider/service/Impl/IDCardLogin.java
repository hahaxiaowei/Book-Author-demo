package cn.edu.hfut.xc.bookauthordemo.provider.service.Impl;

import cn.edu.hfut.xc.bookauthordemo.common.model.Author;
import cn.edu.hfut.xc.bookauthordemo.common.model.AuthorInfo;
import cn.edu.hfut.xc.bookauthordemo.common.util.Result;
import cn.edu.hfut.xc.bookauthordemo.provider.service.AuthorService;
import cn.edu.hfut.xc.bookauthordemo.provider.service.LoginHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by sunwei on 2018/1/11 Time:10:02
 */
@Service
public class IDCardLogin extends LoginHandler {
    @Autowired
    private AuthorService authorService;

    /**
     * @param authorInfo
     * @return cn.edu.hfut.xc.bookauthordemo.common.util.Result
     * @description 根据身份证号查询作者信息
     * @method handler
     */
    @Override
    public Result handler(AuthorInfo authorInfo) {

        Author author = null;
        if (preHandler(authorInfo.getIdCode())) {
              author = authorService.selectByIDCard(authorInfo.getIdCode());
        }
        return getResult(author,authorInfo,null);
    }

    @Override
    public boolean preHandler(String authorName) {
        return true;
    }
}
