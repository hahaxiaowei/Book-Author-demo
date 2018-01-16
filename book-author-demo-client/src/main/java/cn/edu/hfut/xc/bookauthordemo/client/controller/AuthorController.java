package cn.edu.hfut.xc.bookauthordemo.client.controller;

import cn.edu.hfut.xc.bookauthordemo.client.feign.AuthorService;
import cn.edu.hfut.xc.bookauthordemo.common.model.Author;
import cn.edu.hfut.xc.bookauthordemo.common.model.AuthorInfo;
import cn.edu.hfut.xc.bookauthordemo.common.util.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by sunwei on 2018/1/4 Time:13:40
 */
@RestController
@RequestMapping(value = "/author")
public class AuthorController {
    private static Logger logger = LoggerFactory.getLogger(AuthorController.class);
    @Autowired
    private AuthorService authorService;

    /**
     * @param author
     * @return cn.edu.hfut.xc.bookauthordemo.common.util.Result
     * @description 添加作者信息
     * @method insert
     */
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public Result insert(@RequestBody Author author) {
        Result result = new Result();
        try {
            result = authorService.insert(author);
            logger.info("插入作者信息成功,生成的id为" + result.getData());
        } catch (Exception e) {
            result.setErrMsg("insert方法执行异常");
            result.setRetCode(Result.RECODE_ERROR);
            logger.error("insert方法执行异常" + e.getMessage() + e);
            throw new RuntimeException(e);
        }
        return result;
    }

    /**
     * @param author
     * @return cn.edu.hfut.xc.bookauthordemo.common.util.Result
     * @description 有条件的添加作者信息
     * @method insert
     */
    @RequestMapping(value = "/insertSelective", method = RequestMethod.POST)
    public Result insertSelective(@RequestBody Author author) {
        Result result = new Result();
        try {
            result = authorService.insertSelective(author);
            logger.info("插入作者信息成功,生成的id为" + result.getData());
        } catch (Exception e) {
            result.setErrMsg("insertSelective方法执行异常");
            result.setRetCode(Result.RECODE_ERROR);
            logger.error("insertSelective方法执行异常" + e.getMessage() + e);
            throw new RuntimeException(e);
        }
        return result;
    }

    /**
     * @param id
     * @return cn.edu.hfut.xc.bookauthordemo.common.util.Result
     * @description
     * @method deleteByPrimaryKey
     */
    @RequestMapping(value = "/deleteByPrimaryKey/{id}", method = RequestMethod.DELETE)
    public Result deleteByPrimaryKey(@PathVariable String id) {
        Result result = new Result();
        try {
            result = authorService.deleteByPrimaryKey(id);
        } catch (Exception e) {
            result.setRetCode(Result.RECODE_ERROR);
            result.setErrMsg("deleteByPrimaryKey方法执行异常");
            logger.error("deleteByPrimaryKey方法执行异常" + e.getMessage() + e);
            throw new RuntimeException(e);
        }
        return result;
    }

    /**
     * @param author
     * @return cn.edu.hfut.xc.bookauthordemo.common.util.Result
     * @description 根据主键更新作者信息
     * @method updateByPrimaryKey
     */
    @RequestMapping(value = "/updateByPrimaryKey", method = RequestMethod.PUT)
    public Result updateByPrimaryKey(@RequestBody Author author) {

        Result result = new Result();
        try {
            result = authorService.updateByPrimaryKey(author);
        } catch (Exception e) {
            result.setRetCode(Result.RECODE_ERROR);
            result.setErrMsg("updateByPrimaryKey执行异常");
            logger.error("方法执行异常" + e.getMessage() + e);
            throw new RuntimeException(e);
        }
        return result;
    }

    /**
     * @param id
     * @return cn.edu.hfut.xc.bookauthordemo.common.util.Result
     * @description 根据主键查询作者信息
     * @method selectByPrimaryKey
     */
    @RequestMapping(value = "/selectByPrimaryKey/{id}", method = RequestMethod.GET)
    public Result selectByPrimaryKey(@PathVariable String id) {
        Result result = new Result();
        try {
            result = authorService.selectByPrimaryKey(id);
        } catch (Exception e) {
            result.setRetCode(Result.RECODE_ERROR);
            result.setErrMsg("方法执行异常");
            logger.error("方法执行异常" + e.getMessage() + e);
            throw new RuntimeException(e);
        }
        return result;
    }

    /**
     * @param authorName
     * @param pageNum
     * @param pageSize
     * @return cn.edu.hfut.xc.bookauthordemo.common.util.Result
     * @description 根据作者名字分页查询作者信息
     * @method selectPageQuery
     */
    @RequestMapping(value = "/selectPageQuery", method = RequestMethod.GET)
    public Result selectPageQuery(@RequestParam(required = false, defaultValue = "") String authorName,
                                  @RequestParam(defaultValue = "1") int pageNum,
                                  @RequestParam(defaultValue = "15") int pageSize) {
        Result result = new Result();
        try {
            result = authorService.selectPageQuery(authorName, pageNum, pageSize);
        } catch (Exception e) {
            result.setRetCode(Result.RECODE_ERROR);
            result.setErrMsg("selectPageQuery方法执行异常");
            logger.error("selectPageQuery方法执行异常" + e.getMessage() + e);
            throw new RuntimeException(e);
        }
        return result;
    }

    @RequestMapping(value = "/isPhoneNumberExist/{phoneNumber}", method = RequestMethod.GET)
    public Result isPhoneNumberExist(@PathVariable String phoneNumber) {
        Result result = new Result();
        try {
            result = authorService.isPhoneNumberExist(phoneNumber);
            logger.info("判断结果为" + result.getData());
        } catch (Exception e) {
            result.setRetCode(Result.RECODE_ERROR);
            result.setErrMsg("方法执行出错");
            logger.error("方法执行出错", e);
            throw new RuntimeException(e);
        }
        return result;
    }

    /**
     * @param authorInfo
     * @return cn.edu.hfut.xc.bookauthordemo.common.util.Result
     * @description 用户登录
     * @method login
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Result login(@RequestBody AuthorInfo authorInfo) {

        Result result = new Result();
        try {
            result = authorService.login(authorInfo);
        } catch (Exception e) {
            result.setRetCode(Result.RECODE_ERROR);
            result.setErrMsg(e.getMessage());
            logger.error("登录失败，请重试！" + e);
            throw new RuntimeException(e);
        }
        return result;
    }

    /**
     * @param request
     * @return cn.edu.hfut.xc.bookauthordemo.common.util.Result
     * @description 用户登出
     * @method loginOut
     */
    @RequestMapping(value = "/loginOut", method = RequestMethod.GET)
    public Result loginOut(HttpServletRequest request) {
        Result result = new Result();
        try {
            result = authorService.loginOut(request);
        } catch (Exception e) {
            result.setRetCode(Result.RECODE_ERROR);
            result.setErrMsg("登出出错" + e);
            logger.error("方法执行出错", e);
            throw new RuntimeException(e);
        }
        return result;
    }

    /**
     * @param request
     * @return cn.edu.hfut.xc.bookauthordemo.common.util.Result
     * @description 获取SystemSession信息
     * @method getSystemSession
     */
    @RequestMapping(value = "/getSystemSession", method = RequestMethod.GET)
    public Result getSystemSession(ServletRequest request) {

        Result result = new Result();
        try {
            result = authorService.getSystemSession(request);
        } catch (Exception e) {
            result.setRetCode(Result.RECODE_SUCCESS);
            result.setErrMsg("获取session信息出错" + e);
            logger.error("方法执行出错", e);
            throw new RuntimeException(e);
        }
        return result;
    }

    /**
     * @param request
     * @return cn.edu.hfut.xc.bookauthordemo.common.util.Result
     * @description 清除session信息
     * @method clearSystemSession
     */
    @RequestMapping(value = "/clearSystemSession", method = RequestMethod.GET)
    public Result clearSystemSession(ServletRequest request) {
        Result result = new Result();
        try {
            result = authorService.clearSystemSession(request);
        } catch (Exception e) {
            result.setRetCode(Result.RECODE_SUCCESS);
            result.setErrMsg("清除session信息出错" + e);
            logger.error("方法执行出错", e);
            throw new RuntimeException(e);
        }
        return result;
    }

    /**
     * @param phoneNum
     * @return cn.edu.hfut.xc.bookauthordemo.common.util.Result
     * @description
     * @method getVerificatCode
     */
    @RequestMapping(value = "/getVerificatCode/{phoneNum}", method = RequestMethod.GET)
    public Result getVerificatCode(@PathVariable String phoneNum) {

        Result result = new Result();
        try {
            result = authorService.getVerificatCode(phoneNum);
        } catch (Exception e) {
            result.setRetCode(Result.RECODE_ERROR);
            result.setErrMsg("获取验证码出错" + e);
            logger.error("方法执行出错", e);
            throw new RuntimeException(e);
        }
        return result;
    }

    /**
     * @param verificationCode
     * @param phoneNum
     * @return java.lang.Boolean
     * @description 判断输入验证码是否正确
     * @method isVerificatCorrect
     */
    @RequestMapping(value = "/isVerificatCorrect", method = RequestMethod.GET)
    public Result isVerificatCorrect(@RequestParam String verificationCode, @RequestParam String phoneNum) {
        Result result = new Result();
       Boolean tag;
        try {
          tag = authorService.isVerificatCorrect(verificationCode, phoneNum);
          result.setData(tag);
        } catch (Exception e) {
            result.setRetCode(Result.RECODE_ERROR);
            result.setErrMsg("方法执行错误");
            logger.error("方法执行出错", e);
            throw new RuntimeException(e);
        }
        return result;
    }
}
