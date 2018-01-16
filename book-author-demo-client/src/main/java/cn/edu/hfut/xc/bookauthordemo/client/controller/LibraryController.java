package cn.edu.hfut.xc.bookauthordemo.client.controller;

import cn.edu.hfut.xc.bookauthordemo.client.feign.LibraryService;
import cn.edu.hfut.xc.bookauthordemo.common.model.Library;
import cn.edu.hfut.xc.bookauthordemo.common.util.Pagination;
import cn.edu.hfut.xc.bookauthordemo.common.util.Result;
import cn.edu.hfut.xc.bookauthordemo.common.util.StringUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by sunwei on 2018/1/4 Time:13:41
 */
@RestController
@RequestMapping(value = "/library")
public class LibraryController {
    private static Logger logger = LoggerFactory.getLogger(BookController.class);
    @Autowired
    private LibraryService libraryService;

    /**
     * @param library
     * @return cn.edu.hfut.xc.bookauthordemo.common.util.Result
     * @description 添加图书馆信息
     * @method insert
     */
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public Result insert(@RequestBody Library library) {
        Result result = new Result();
        try {
            result = libraryService.insert(library);
        } catch (Exception e) {
            result.setErrMsg("insert方法执行异常");
            result.setRetCode(Result.RECODE_ERROR);
            logger.error("insert方法执行异常" + e.getMessage() + e);
            throw new RuntimeException(e);
        }
        return result;
    }

    /**
     * @param library
     * @return cn.edu.hfut.xc.bookauthordemo.common.util.Result
     * @description 添加图书馆信息
     * @method insert
     */
    @RequestMapping(value = "/insertSelective", method = RequestMethod.POST)
    public Result insertSelective(@RequestBody Library library) {
        Result result = new Result();
        try {
            result = libraryService.insertSelective(library);
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
     * @description
     * @method deleteByPrimaryKey
     */
    @RequestMapping(value = "/deleteByPrimaryKey/{id}", method = RequestMethod.DELETE)
    public Result deleteByPrimaryKey(@PathVariable String id) {
        Result result = new Result();
        try {
            result = libraryService.deleteByPrimaryKey(id);
        } catch (Exception e) {
            result.setRetCode(Result.RECODE_ERROR);
            result.setErrMsg("deleteByPrimaryKey方法执行异常");
            logger.error("deleteByPrimaryKey方法执行异常" + e.getMessage() + e);
            throw new RuntimeException(e);
        }
        return result;
    }

    /**
     * @param library
     * @return cn.edu.hfut.xc.bookauthordemo.common.util.Result
     * @description 根据主键更新图书馆信息
     * @method updateByPrimaryKey
     */
    @RequestMapping(value = "/updateByPrimaryKey" ,method = RequestMethod.PUT)
    public Result updateByPrimaryKey(@RequestBody Library library){

        Result result = new Result();
        try {
            result = libraryService.updateByPrimaryKey(library);
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
     * @description 根据主键查询图书馆的信息
     * @method selectByPrimaryKey
     */
    @RequestMapping(value ="/selectByPrimaryKey/{id}",method = RequestMethod.GET)
    public Result selectByPrimaryKey(@PathVariable String id){
        Result result = new Result();
        try {
            result = libraryService.selectByPrimaryKey(id);
        } catch (Exception e) {
            result.setRetCode(Result.RECODE_ERROR);
            result.setErrMsg("方法执行异常");
            logger.error("方法执行异常"+ e.getMessage() + e);
            throw new RuntimeException(e);
        }
        return result;
    }

    /**
     * @param libraryName
     * @param pageNum
     * @param pageSize
     * @return cn.edu.hfut.xc.bookauthordemo.common.util.Result
     * @description 根据图书图书馆名字
     * @method selectPageQuery
     */
    @RequestMapping(value = "/selectPageQuery",method = RequestMethod.GET)
    public Result selectPageQuery(@RequestParam(required = false,defaultValue = "") String libraryName,
                                  @RequestParam(defaultValue = "1") int pageNum ,
                                  @RequestParam(defaultValue = "15") int pageSize){
        Result result = new Result();
        try {
            result = libraryService.selectPageQuery(libraryName,pageNum,pageSize);
        } catch (Exception e) {
            result.setRetCode(Result.RECODE_ERROR);
            result.setErrMsg("selectPageQuery方法执行异常");
            logger.error("selectPageQuery方法执行异常"+ e.getMessage() + e);
            throw new RuntimeException(e);
        }
        return result;
    }
}
