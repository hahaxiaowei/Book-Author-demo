package cn.edu.hfut.xc.bookauthordemo.provider.controller;

import cn.edu.hfut.xc.bookauthordemo.common.model.*;
import cn.edu.hfut.xc.bookauthordemo.common.util.*;
import cn.edu.hfut.xc.bookauthordemo.provider.config.RedisUtils;
import cn.edu.hfut.xc.bookauthordemo.provider.config.SessionUtils;
import cn.edu.hfut.xc.bookauthordemo.provider.service.AuthorService;
import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static cn.edu.hfut.xc.bookauthordemo.common.util.JwtUtil.JWT_ID;
import static cn.edu.hfut.xc.bookauthordemo.common.util.JwtUtil.JWT_TTL;

/**
 * Created by sunwei on 2017/12/8 Time:9:46
 */
@RestController
@RequestMapping(value = "/author")
public class AuthorController {

    private static Logger logger = LoggerFactory.getLogger(AuthorController.class);
    @Autowired
    private AuthorService authorService;

    @Value("${redisTimeoutSeconds}")
    private String redisTimeoutSeconds;

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
            authorService.insert(author);
            result.setData(author.getId());
            result.setRetCode(Result.RECODE_SUCCESS);
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
            authorService.insertSelective(author);
            result.setData(author.getId());
            result.setRetCode(Result.RECODE_SUCCESS);
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
            if (StringUtil.isNullOrEmpty(id)) {
                result.setRetCode(Result.RECODE_VALIDATE_ERROR);
                result.setErrMsg("作者的id不能为空");
                return result;
            }
            authorService.deleteByPrimaryKey(id);
            result.setRetCode(Result.RECODE_SUCCESS);
            result.setData(id);
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
            authorService.updateByPrimaryKey(author);
            result.setRetCode(Result.RECODE_SUCCESS);
            result.setData(author.getId());
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
            if (StringUtil.isNullOrEmpty(id)) {
                result.setRetCode(Result.RECODE_VALIDATE_ERROR);
                result.setErrMsg("作者id不能为空");
                return result;
            }
            result.setData(authorService.selectByPrimaryKey(id));
            result.setRetCode(Result.RECODE_SUCCESS);
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
            Pagination<Author> pagination = authorService.selectPageQuery(authorName, pageNum, pageSize);
            result.setRetCode(Result.RECODE_SUCCESS);
            result.setData(pagination);
        } catch (Exception e) {
            result.setRetCode(Result.RECODE_ERROR);
            result.setErrMsg("selectPageQuery方法执行异常");
            logger.error("selectPageQuery方法执行异常" + e.getMessage() + e);
            throw new RuntimeException(e);
        }
        return result;
    }

    /**
     * @param phoneNumber
     * @return cn.edu.hfut.xc.bookauthordemo.common.util.Result
     * @description 判断手机号是否存在
     * @method isPhoneNumberExist
     */
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
            Result login = authorService.login(authorInfo);
            if (!Result.RECODE_SUCCESS.equals(login)) {
                return login;
            }
            Author author = (Author) login.getData();

            //既然登录成功则将登录的作者信息传给前台
            authorInfo.setUserName(author.getUserName());
            JSONObject subject = JwtUtil.generalSubject(author);
            String token = JwtUtil.createJWT(JWT_ID, subject, JWT_TTL);
            JSONObject jo = new JSONObject();
            jo.put("token", token);
            //更新redis中session数据
            updateSystemSession(author, token);
            result.setData(jo);
            result.setRetCode(Result.RECODE_SUCCESS);
            logger.info(author.getId() + " 登录成功！");
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

        String tokenKey = EncryptUtil.getTokenKey(request);
        RedisUtils.getInstance().delete(tokenKey.getBytes());
        logger.info("登出成功：" + tokenKey);
        Result result = new Result();
        result.setRetCode(Result.RECODE_SUCCESS);
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
        SystemSession systemSession = SessionUtils.getSession(request);
        if (StringUtil.isNullOrEmpty(systemSession)) {
            result.setRetCode(Result.RECODE_UNLOGIN);
            logger.info("请重新登录");
            return result;
        }
        result.setRetCode(Result.RECODE_SUCCESS);
        result.setData(systemSession);
        logger.info("成功获取SystemSession信息！");
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

        logger.info("开始清除");
        //从前端获取请求信息
        SystemSession systemSession = SessionUtils.getSession(request);
        systemSession.setCurrentStatus(null);
        String tokenKey = EncryptUtil.getTokenKey(request);
        logger.info("tokenKey：" + tokenKey);
        String redisTimeOut[] = redisTimeoutSeconds.split(" ");
        RedisUtils.getInstance().setValue(tokenKey.getBytes(), SerializeUtils.serialize(systemSession), Integer.parseInt(redisTimeOut[0]) * Integer.parseInt(redisTimeOut[1])
                * Integer.parseInt(redisTimeOut[2]) * Integer.parseInt(redisTimeOut[3]));
        Result result = new Result();
        result.setRetCode(Result.RECODE_SUCCESS);
        result.setData(systemSession);
        logger.info("清除成功");
        return result;
    }

    /**
     * @param authorInfo
     * @param token
     * @return void
     * @description 更新session信息
     * @method updateSystemSession
     */
    public void updateSystemSession(Author authorInfo, String token) {

        logger.info("开始更新SystemSession");
        //构建SystemSession
        SystemSession systemSession = new SystemSession();
        systemSession.setSessionHost("");
        systemSession.setSessionCode(SessionUtils.getSessionCode());
        systemSession.setLanguage(SessionUtils.getLanguage());
        systemSession.setSessionStyle(SessionUtils.getSessionStyle());
        Author author = new Author();
        //id
        author.setId(authorInfo.getId());
        //手机号
        author.setPhoneNumber(authorInfo.getPhoneNumber());
        //作者名
        author.setAuthorName(authorInfo.getAuthorName());
        //邮箱号
        author.setEmailNumber(authorInfo.getEmailNumber());
        //身份证号
        author.setIdCode(authorInfo.getIdCode());
        //QQ号
        author.setQqNumber(authorInfo.getQqNumber());
        //微信号
        author.setWechatNumber(authorInfo.getWechatNumber());
        //新浪微博号
        author.setSinaMicroblogNumber(authorInfo.getSinaMicroblogNumber());
        //民族
        author.setNation(authorInfo.getNation());

        CurrentStatus currentStatus = new CurrentStatus(author);
        String tokenKey = EncryptUtil.encryptPassWord(token);
        Map<String, SessionObjectSet> map = new HashMap<String, SessionObjectSet>();
        SessionObjectSet sessionObjectSet = new SessionObjectSet(new HashMap<String, Object>(), new Date());
        map.put(tokenKey, sessionObjectSet);
        systemSession.setSessionnObjectSet(map);
        String redisTimeOut[] = redisTimeoutSeconds.split(" ");
        RedisUtils.getInstance().setValue(tokenKey.getBytes(), SerializeUtils.serialize(systemSession), Integer.valueOf(redisTimeOut[0]));
        logger.info("更新完毕");
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
    public Boolean isVerificatCorrect(@RequestParam String verificationCode, @RequestParam String phoneNum) {

        Result result = new Result();
        Boolean tag;
        try {
            tag = authorService.isVerificatCorrect(verificationCode, phoneNum);
        } catch (Exception e) {
            logger.error("方法执行出错", e);
            throw new RuntimeException(e);
        }
        return tag;
    }

    /**
     * @param
     * @return cn.edu.hfut.xc.bookauthordemo.common.util.Result
     * @description 查询所有作者信息
     * @method selectAll
     */
    @RequestMapping(value ="/selectAll",method = RequestMethod.GET)
    public Result selectAll() {

        Result result = new Result();
        try {
            List<Author> list = authorService.selectAll();
            result.setData(list);
        } catch (Exception e) {
            result.setRetCode(Result.RECODE_ERROR);
            result.setErrMsg("方法执行出错" + e);
            logger.error("方法执行出错", e);
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
    @RequestMapping(value = "/selectAuthorBook/{id}", method = RequestMethod.GET)
    public Result selectAuthorBook(@PathVariable String id) {
        Result result = new Result();
        try {
            if (StringUtil.isNullOrEmpty(id)) {
                result.setRetCode(Result.RECODE_VALIDATE_ERROR);
                result.setErrMsg("作者id不能为空");
                return result;
            }
            result.setData(authorService.selectAuthorBook(id));
            result.setRetCode(Result.RECODE_SUCCESS);
        } catch (Exception e) {
            result.setRetCode(Result.RECODE_ERROR);
            result.setErrMsg("方法执行异常");
            logger.error("方法执行异常" + e.getMessage() + e);
            throw new RuntimeException(e);
        }
        return result;
    }


}
