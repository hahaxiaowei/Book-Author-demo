package cn.edu.hfut.xc.bookauthordemo.client.controller;

import cn.edu.hfut.xc.bookauthordemo.client.feign.BookClassService;
import cn.edu.hfut.xc.bookauthordemo.client.feign.BookService;
import cn.edu.hfut.xc.bookauthordemo.common.model.Book;
import cn.edu.hfut.xc.bookauthordemo.common.util.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by sunwei on 2018/1/4 Time:13:43
 */
@RestController
@RequestMapping(value = "/book")
public class BookController {
    private static Logger logger = LoggerFactory.getLogger(AuthorController.class);
    @Autowired
    private BookService bookService;

    /**
     * @param book
     * @return cn.edu.hfut.xc.bookauthordemo.common.util.Result
     * @description 添加图书信息
     * @method insert
     */
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public Result insert(@RequestBody Book book) {
        Result result = new Result();
        try {
            result = bookService.insert(book);
            logger.info("插入图书类别信息成功,生成的id为" + result.getData());
        } catch (Exception e) {
            result.setErrMsg("insert方法执行异常");
            result.setRetCode(Result.RECODE_ERROR);
            logger.error("insert方法执行异常" + e.getMessage() + e);
            throw new RuntimeException(e);
        }
        return result;
    }

    /**
     * @param book
     * @return cn.edu.hfut.xc.bookauthordemo.common.util.Result
     * @description 有条件的添加图书信息
     * @method insert
     */
    @RequestMapping(value = "/insertSelective", method = RequestMethod.POST)
    public Result insertSelective(@RequestBody Book book) {
        Result result = new Result();
        try {
            result = bookService.insertSelective(book);
            logger.info("插入图书类别信息成功,生成的id为" + result.getData());
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
            result = bookService.deleteByPrimaryKey(id);
        } catch (Exception e) {
            result.setRetCode(Result.RECODE_ERROR);
            result.setErrMsg("deleteByPrimaryKey方法执行异常");
            logger.error("deleteByPrimaryKey方法执行异常" + e.getMessage() + e);
            throw new RuntimeException(e);
        }
        return result;
    }

    /**
     * @param book
     * @return cn.edu.hfut.xc.bookauthordemo.common.util.Result
     * @description 根据主键更新图书信息
     * @method updateByPrimaryKey
     */
    @RequestMapping(value = "/updateByPrimaryKey", method = RequestMethod.PUT)
    public Result updateByPrimaryKey(@RequestBody Book book) {
        Result result = new Result();
        try {
            result = bookService.updateByPrimaryKey(book);
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
     * @description 根据主键查询图书信息
     * @method selectByPrimaryKey
     */
    @RequestMapping(value = "/selectByPrimaryKey/{id}", method = RequestMethod.GET)
    public Result selectByPrimaryKey(@PathVariable String id) {
        Result result = new Result();
        try {
            result = bookService.selectByPrimaryKey(id);
        } catch (Exception e) {
            result.setRetCode(Result.RECODE_ERROR);
            result.setErrMsg("方法执行异常");
            logger.error("方法执行异常" + e.getMessage() + e);
            throw new RuntimeException(e);
        }
        return result;
    }

    /**
     * @param bookClassName
     * @param pageNum
     * @param pageSize
     * @return cn.edu.hfut.xc.bookauthordemo.common.util.Result
     * @description 根据图书名分页查询图书信息
     * @method selectPageQuery
     */
    @RequestMapping(value = "/selectPageQuery", method = RequestMethod.GET)
    public Result selectPageQuery(@RequestParam(required = false, defaultValue = "") String bookClassName,
                                  @RequestParam(defaultValue = "1") int pageNum,
                                  @RequestParam(defaultValue = "15") int pageSize) {
        Result result = new Result();
        try {
            result = bookService.selectPageQuery(bookClassName, pageNum, pageSize);
        } catch (Exception e) {
            result.setRetCode(Result.RECODE_ERROR);
            result.setErrMsg("selectPageQuery方法执行异常");
            logger.error("selectPageQuery方法执行异常" + e.getMessage() + e);
            throw new RuntimeException(e);
        }
        return result;
    }

    /**
     * @param
     * @return cn.edu.hfut.xc.bookauthordemo.common.util.Result
     * @description 查询所有图书信息
     * @method selectAll
     */
    @RequestMapping(value ="/selectAll",method = RequestMethod.GET)
    public Result selectAll() {

        Result result = new Result();
        try {
            result = bookService.selectAll();
        } catch (Exception e) {
            result.setRetCode(Result.RECODE_ERROR);
            result.setErrMsg("方法执行出错" + e);
            logger.error("方法执行出错", e);
            throw new RuntimeException(e);
        }
        return result;
    }
}
