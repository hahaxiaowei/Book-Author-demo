package cn.edu.hfut.xc.bookauthordemo.provider.controller;

import cn.edu.hfut.xc.bookauthordemo.common.model.Book;
import cn.edu.hfut.xc.bookauthordemo.common.util.Pagination;
import cn.edu.hfut.xc.bookauthordemo.common.util.Result;
import cn.edu.hfut.xc.bookauthordemo.common.util.StringUtil;
import cn.edu.hfut.xc.bookauthordemo.provider.service.BookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by sunwei on 2017/12/8 Time:9:46
 */
@RestController
@RequestMapping(value = "/book")
public class BookController {

    private static Logger logger = LoggerFactory.getLogger(BookController.class);

    @Autowired
    private BookService bookService;

    /**
     * @param book
     * @return cn.edu.hfut.xc.bookauthordemo.common.util.Result
     * @description 添加图书类别信息
     * @method insert
     */
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public Result insert(@RequestBody Book book) {
        Result result = new Result();
        try {
            bookService.insert(book);
            result.setData(book.getId());
            result.setRetCode(Result.RECODE_SUCCESS);
            logger.info("插入图书信息成功,生成的id为" + result.getData());
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
     * @description 有条件的添加图书类别信息
     * @method insert
     */
    @RequestMapping(value = "/insertSelective", method = RequestMethod.POST)
    public Result insertSelective(@RequestBody Book book) {
        Result result = new Result();
        try {
            bookService.insertSelective(book);
            result.setData(book.getId());
            result.setRetCode(Result.RECODE_SUCCESS);
            logger.info("插入图书信息成功,生成的id为" + result.getData());
        } catch (Exception e) {
            result.setErrMsg("insert方法执行异常");
            result.setRetCode(Result.RECODE_ERROR);
            logger.error("insert方法执行异常" + e.getMessage() + e);
            throw new RuntimeException(e);
        }
        return result;
    }
    /**
     * @param id
     * @return cn.edu.hfut.xc.bookauthordemo.common.util.Result
     * @description 根据主键删除图书信息
     * @method deleteByPrimaryKey
     */
    @RequestMapping(value = "/deleteByPrimaryKey/{id}", method = RequestMethod.DELETE)
    public Result deleteByPrimaryKey(@PathVariable String id) {
        Result result = new Result();
        try {
            if (StringUtil.isNullOrEmpty(id)) {
                result.setRetCode(Result.RECODE_VALIDATE_ERROR);
                result.setErrMsg("图书的id不能为空");
                return result;
            }
            bookService.deleteByPrimaryKey(id);
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
     * @param book
     * @return cn.edu.hfut.xc.bookauthordemo.common.util.Result
     * @description 根据主键更新图书信息
     * @method updateByPrimaryKey
     */
    @RequestMapping(value = "/updateByPrimaryKey" ,method = RequestMethod.PUT)
    public Result updateByPrimaryKey(@RequestBody Book book){

        Result result = new Result();
        try {
            bookService.updateByPrimaryKey(book);
            result.setRetCode(Result.RECODE_SUCCESS);
            result.setData(book.getId());
        } catch (Exception e) {
            result.setRetCode(Result.RECODE_ERROR);
            result.setErrMsg("updateByPrimaryKey执行异常");
            logger.error("方法执行异常"+ e.getMessage() + e);
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
    @RequestMapping(value ="/selectByPrimaryKey/{id}",method = RequestMethod.GET)
    public Result selectByPrimaryKey(@PathVariable String id){
        Result result = new Result();
        try {
            if (StringUtil.isNullOrEmpty(id)) {
                result.setRetCode(Result.RECODE_VALIDATE_ERROR);
                result.setErrMsg("图书id不能为空");
                return result;
            }
            result.setData(bookService.selectByPrimaryKey(id));
            result.setRetCode(Result.RECODE_SUCCESS);
        } catch (Exception e) {
            result.setRetCode(Result.RECODE_ERROR);
            result.setErrMsg("方法执行异常");
            logger.error("方法执行异常"+ e.getMessage() + e);
            throw new RuntimeException(e);
        }
        return result;
    }

    /**
     * @param bookName
     * @param pageNum
     * @param pageSize
     * @return cn.edu.hfut.xc.bookauthordemo.common.util.Result
     * @description 根据图书名分页查询图书信息
     * @method selectPageQuery
     */
    @RequestMapping(value = "/selectPageQuery",method = RequestMethod.GET)
    public Result selectPageQuery(@RequestParam(required = false,defaultValue = "") String bookName,
                                  @RequestParam(defaultValue = "1") int pageNum ,
                                  @RequestParam(defaultValue = "15") int pageSize){
        Result result = new Result();
        try {
            Pagination<Book> pagination = bookService.selectPageQuery(bookName,pageNum,pageSize);
            result.setRetCode(Result.RECODE_SUCCESS);
            result.setData(pagination);
        } catch (Exception e) {
            result.setRetCode(Result.RECODE_ERROR);
            result.setErrMsg("selectPageQuery方法执行异常");
            logger.error("selectPageQuery方法执行异常"+ e.getMessage() + e);
            throw new RuntimeException(e);
        }
        return result;
    }
}
