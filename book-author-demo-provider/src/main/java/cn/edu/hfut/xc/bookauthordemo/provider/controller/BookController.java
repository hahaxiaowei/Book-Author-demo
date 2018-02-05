package cn.edu.hfut.xc.bookauthordemo.provider.controller;

import cn.edu.hfut.xc.bookauthordemo.common.entity.BookVo;
import cn.edu.hfut.xc.bookauthordemo.common.model.Book;
import cn.edu.hfut.xc.bookauthordemo.common.model.BookClass;
import cn.edu.hfut.xc.bookauthordemo.common.util.Pagination;
import cn.edu.hfut.xc.bookauthordemo.common.util.Result;
import cn.edu.hfut.xc.bookauthordemo.common.util.StringUtil;
import cn.edu.hfut.xc.bookauthordemo.provider.service.BookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
     * @param id
     * @return cn.edu.hfut.xc.bookauthordemo.common.util.Result
     * @description 根据主键查询图书和图书的作者信息
     * @method selectByPrimaryKey
     */
    @RequestMapping(value ="/selectBookAuthorByPrimaryKey/{id}",method = RequestMethod.GET)
    public Result selectBookAuthorByPrimaryKey(@PathVariable String id){
        Result result = new Result();
        try {
            if (StringUtil.isNullOrEmpty(id)) {
                result.setRetCode(Result.RECODE_VALIDATE_ERROR);
                result.setErrMsg("图书id不能为空");
                return result;
            }
            result.setData(bookService.selectBookAuthorByPrimaryKey(id));
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
     * @param id
     * @return cn.edu.hfut.xc.bookauthordemo.common.util.Result
     * @description 根据主键查询图书和图书的所在的图书馆信息
     * @method selectByPrimaryKey
     */
    @RequestMapping(value ="/selectBookLibraryByPrimaryKey/{id}",method = RequestMethod.GET)
    public Result selectBookLibraryByPrimaryKey(@PathVariable String id){
        Result result = new Result();
        try {
            if (StringUtil.isNullOrEmpty(id)) {
                result.setRetCode(Result.RECODE_VALIDATE_ERROR);
                result.setErrMsg("图书id不能为空");
                return result;
            }
            result.setData(bookService.selectBookLibraryByPrimaryKey(id));
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
            Pagination<BookVo> pagination = bookService.selectPageQuery(bookName,pageNum,pageSize);
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
            List<Book> list = bookService.selectAll();
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
     * @param authorId
     * @return cn.edu.hfut.xc.bookauthordemo.common.util.Result
     * @description 根据作者id查询该作者所写的图书信息
     * @method selectByPrimaryKey
     */
    @RequestMapping(value ="/selectBooksByAuthorId/{authorId}",method = RequestMethod.GET)
    public Result selectBooksByAuthorId(@PathVariable String authorId){
        Result result = new Result();
        try {
            if (StringUtil.isNullOrEmpty(authorId)) {
                result.setRetCode(Result.RECODE_VALIDATE_ERROR);
                result.setErrMsg("作者id不能为空");
                return result;
            }
            result.setData(bookService.selectBooksByAuthorId(authorId));
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
     * @param libraryId
     * @return cn.edu.hfut.xc.bookauthordemo.common.util.Result
     * @description 根据图书馆id查询该图书馆所包含的图书信息
     * @method selectByPrimaryKey
     */
    @RequestMapping(value ="/selectBooksByLibraryId/{libraryId}",method = RequestMethod.GET)
    public Result selectBooksByLibraryId(@PathVariable String libraryId){
        Result result = new Result();
        try {
            if (StringUtil.isNullOrEmpty(libraryId)) {
                result.setRetCode(Result.RECODE_VALIDATE_ERROR);
                result.setErrMsg("作者id不能为空");
                return result;
            }
            result.setData(bookService.selectBooksByLibraryId(libraryId));
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
     * @param shopId
     * @return cn.edu.hfut.xc.bookauthordemo.common.util.Result
     * @description 根据商店id查询该商店所售卖的图书信息
     * @method selectByPrimaryKey
     */
    @RequestMapping(value ="/selectBooksByShopId/{shopId}",method = RequestMethod.GET)
    public Result selectBooksByShopId(@PathVariable String shopId){
        Result result = new Result();
        try {
            if (StringUtil.isNullOrEmpty(shopId)) {
                result.setRetCode(Result.RECODE_VALIDATE_ERROR);
                result.setErrMsg("作者id不能为空");
                return result;
            }
            result.setData(bookService.selectBooksByShopId(shopId));
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
     * @param nationalityId
     * @return cn.edu.hfut.xc.bookauthordemo.common.util.Result
     * @description 根据商店id查询该商店所售卖的图书信息
     * @method selectByPrimaryKey
     */
    @RequestMapping(value ="/selectBooksByNationalityId/{nationalityId}",method = RequestMethod.GET)
    public Result selectBooksByNationalityId(@PathVariable String nationalityId){
        Result result = new Result();
        try {
            if (StringUtil.isNullOrEmpty(nationalityId)) {
                result.setRetCode(Result.RECODE_VALIDATE_ERROR);
                result.setErrMsg("作者id不能为空");
                return result;
            }
            result.setData(bookService.selectBooksByNationalityId(nationalityId));
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
     * @param
     * @return cn.edu.hfut.xc.bookauthordemo.common.util.Result
     * @description 查询所有图书信息和包括该图书的作者信息
     * @method selectAll
     */
    @RequestMapping(value ="/selectBookWithAuthor",method = RequestMethod.GET)
    public Result selectBookWithAuthor() {

        Result result = new Result();
        try {
            List<Book> list = bookService.selectBookWithAuthor();
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
     * @param
     * @return cn.edu.hfut.xc.bookauthordemo.common.util.Result
     * @description 查询所有图书图书信息包括图书所在的图书馆信息
     * @method selectAll
     */
    @RequestMapping(value ="/selectBookWithLibrary",method = RequestMethod.GET)
    public Result selectBookWithLibrary() {

        Result result = new Result();
        try {
            List<Book> list = bookService.selectBookWithLibrary();
            result.setData(list);
        } catch (Exception e) {
            result.setRetCode(Result.RECODE_ERROR);
            result.setErrMsg("方法执行出错" + e);
            logger.error("方法执行出错", e);
            throw new RuntimeException(e);
        }
        return result;
    }


}
