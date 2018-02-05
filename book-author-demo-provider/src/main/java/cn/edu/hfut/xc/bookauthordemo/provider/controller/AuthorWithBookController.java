package cn.edu.hfut.xc.bookauthordemo.provider.controller;

import cn.edu.hfut.xc.bookauthordemo.common.model.AuthorWithBook;
import cn.edu.hfut.xc.bookauthordemo.common.util.Result;
import cn.edu.hfut.xc.bookauthordemo.common.util.StringUtil;
import cn.edu.hfut.xc.bookauthordemo.provider.service.AuthorWithBookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by sunwei on 2018/1/18 Time:15:47
 */
@RestController
@RequestMapping(value = "/authorwithbook")
public class AuthorWithBookController {

    private static Logger logger = LoggerFactory.getLogger(AuthorWithBookController.class);

    @Autowired
    private AuthorWithBookService authorWithBookService;

    /**
     * @param authorWithBook
     * @return cn.edu.hfut.xc.bookauthordemo.common.util.Result
     * @description 添加作者和图书关联信息
     * @method insert
     */
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public Result insert(@RequestBody AuthorWithBook authorWithBook) {
        Result result = new Result();
        try {
            authorWithBookService.insert(authorWithBook);
            result.setData(authorWithBook.getId());
            result.setRetCode(Result.RECODE_SUCCESS);
            logger.info("插入作者和图书关联信息成功,生成的id为" + result.getData());
        } catch (Exception e) {
            result.setErrMsg("insert方法执行异常");
            result.setRetCode(Result.RECODE_ERROR);
            logger.error("insert方法执行异常" + e.getMessage() + e);
            throw new RuntimeException(e);
        }
        return result;
    }

//    /**
//     * @param authorWithBook
//     * @return cn.edu.hfut.xc.bookauthordemo.common.util.Result
//     * @description 添加作者和图书关联信息
//     * @method insert
//     */
//    @RequestMapping(value = "/insertSelective", method = RequestMethod.POST)
//    public Result insertSelective(@RequestBody AuthorWithBook authorWithBook) {
//        Result result = new Result();
//        try {
//            authorWithBookService.insert(authorWithBook);
//            result.setData(authorWithBook.getId());
//            result.setRetCode(Result.RECODE_SUCCESS);
//            logger.info("插入作者和图书关联信息成功,生成的id为" + result.getData());
//        } catch (Exception e) {
//            result.setErrMsg("insert方法执行异常");
//            result.setRetCode(Result.RECODE_ERROR);
//            logger.error("insert方法执行异常" + e.getMessage() + e);
//            throw new RuntimeException(e);
//        }
//        return result;
//    }
    /**
     * @param id
     * @return cn.edu.hfut.xc.bookauthordemo.common.util.Result
     * @description 根据主键删除作者和图书关联信息
     * @method deleteByPrimaryKey
     */
    @RequestMapping(value = "/deleteByPrimaryKey/{id}", method = RequestMethod.DELETE)
    public Result deleteByPrimaryKey(@PathVariable String id) {
        Result result = new Result();
        try {
            if (StringUtil.isNullOrEmpty(id)) {
                result.setRetCode(Result.RECODE_VALIDATE_ERROR);
                result.setErrMsg("关联表的id不能为空");
                return result;
            }
            authorWithBookService.deleteByPrimaryKey(id);
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
     * @param authorWithBook
     * @return cn.edu.hfut.xc.bookauthordemo.common.util.Result
     * @description 根据主键更新作者和图书关联信息
     * @method updateByPrimaryKey
     */
    @RequestMapping(value = "/updateByPrimaryKey", method = RequestMethod.PUT)
    public Result updateByPrimaryKey(@RequestBody AuthorWithBook authorWithBook) {

        Result result = new Result();
        try {
            authorWithBookService.updateByPrimaryKey(authorWithBook);
            result.setRetCode(Result.RECODE_SUCCESS);
            result.setData(authorWithBook.getId());
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
     * @description 根据主键查询作者和图书关联信息
     * @method selectByPrimaryKey
     */
    @RequestMapping(value = "/selectByPrimaryKey/{id}", method = RequestMethod.GET)
    public Result selectByPrimaryKey(@PathVariable String id) {
        Result result = new Result();
        try {
            if (StringUtil.isNullOrEmpty(id)) {
                result.setRetCode(Result.RECODE_VALIDATE_ERROR);
                result.setErrMsg("作者和图书关联信息id不能为空");
                return result;
            }
            result.setData(authorWithBookService.selectByPrimaryKey(id));
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
     * @return cn.edu.hfut.xc.bookauthordemo.common.util.Result
     * @description 查询所有信息
     * @method selectByColumn
     */
    @RequestMapping(value = "/selectAll", method = RequestMethod.GET)
    public Result selectAll(){
        Result result = new Result();
        try {
            List<AuthorWithBook> list = authorWithBookService.selectAll();
            result.setData(list);
        } catch (Exception e) {
            result.setRetCode(Result.RECODE_ERROR);
            result.setErrMsg("方法执行出错");
            logger.error("方法执行出错", e);
            throw new RuntimeException(e);
        }
        return result;
    }
}
