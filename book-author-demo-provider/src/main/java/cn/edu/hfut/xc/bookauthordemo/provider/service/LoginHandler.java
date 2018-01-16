package cn.edu.hfut.xc.bookauthordemo.provider.service;

import cn.edu.hfut.xc.bookauthordemo.common.model.Author;
import cn.edu.hfut.xc.bookauthordemo.common.model.AuthorInfo;
import cn.edu.hfut.xc.bookauthordemo.common.util.Result;
import cn.edu.hfut.xc.bookauthordemo.common.util.StringUtil;

/**
 * Created by sunwei on 2018/1/10 Time:17:37
 * 这个类负责登录处理，包括手机号登录，邮箱登录，身份证号登录，其他账号登录
 */
public abstract class LoginHandler {

    private LoginHandler nextHandler;

    public LoginHandler getNextHandler() {
        return nextHandler;
    }

    public void setNextHandler(LoginHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    /**
     * 具体的登录方式处理函数，是手机号、邮箱、身份账号、其他账号，由子类根据需要实现此方法
     * @param authorInfo
     * @return
     */
    public abstract Result handler(AuthorInfo authorInfo);


    /**
     * 登录失败返回结果函数
     * @return Result
     */
    public Result getUnSuccess() {
        Result result = new Result();
        result.setRetCode(Result.RECODE_VALIDATE_ERROR);
        result.setErrMsg("用户名或密码不正确！");
        return result;
    }

    /**
     * 登录成功返回登录成功的作者信息
     * @param author
     * @return Result
     */
    public Result getSuccess(Author author) {
        Result result = new Result();
        result.setData(author);
        return result;
    }

    /**
     * 获取结果
     * @param author
     * @param authorInfo
     * @param handler
     * @return Result
     */
    public Result getResult(Author author, AuthorInfo authorInfo,LoginHandler handler) {
        if (StringUtil.isNullOrEmpty(author)) {
            //如果四种登录方式都没有选择，则返回未登录
            if (StringUtil.isNullOrEmpty(handler)) {
                return getUnSuccess();
            }
            //则提供四种方式让用户登录
            return handler.handler(authorInfo);
            //如果author信息不是空的，也就是说作者信息已经填入了，那么则会验证密码是否正确
        } else if (author.getPassword().equals(authorInfo.getPassword())) {
            return getSuccess(author);
        } else {
            return getUnSuccess();
        }
    }

    /**
     * 用户名格式校验 是否属于属于当前处理类
     *
     * @param authorName 手机号、邮箱、身份证、锐信号
     * @return
     */
    public abstract boolean preHandler(String authorName);
}
