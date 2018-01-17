package cn.edu.hfut.xc.bookauthordemo.provider.controller;

import cn.edu.hfut.xc.bookauthordemo.common.model.Book;
import cn.edu.hfut.xc.bookauthordemo.common.model.Library;
import cn.edu.hfut.xc.bookauthordemo.common.util.Pagination;
import cn.edu.hfut.xc.bookauthordemo.common.util.Result;
import cn.edu.hfut.xc.bookauthordemo.common.util.StringUtil;
import cn.edu.hfut.xc.bookauthordemo.provider.service.LibraryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by sunwei on 2017/12/8 Time:9:46
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
            libraryService.insert(library);
            result.setData(library.getId());
            result.setRetCode(Result.RECODE_SUCCESS);
            logger.info("插入图书馆信息成功,生成的id为" + result.getData());
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
            libraryService.insertSelective(library);
            result.setData(library.getId());
            result.setRetCode(Result.RECODE_SUCCESS);
            logger.info("插入图书馆信息成功,生成的id为" + result.getData());
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
            if (StringUtil.isNullOrEmpty(id)) {
                result.setRetCode(Result.RECODE_VALIDATE_ERROR);
                result.setErrMsg("图书馆的id不能为空");
                return result;
            }
            libraryService.deleteByPrimaryKey(id);
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
     * @param library
     * @return cn.edu.hfut.xc.bookauthordemo.common.util.Result
     * @description 根据主键更新图书馆信息
     * @method updateByPrimaryKey
     */
    @RequestMapping(value = "/updateByPrimaryKey" ,method = RequestMethod.PUT)
    public Result updateByPrimaryKey(@RequestBody Library library){

        Result result = new Result();
        try {
            libraryService.updateByPrimaryKey(library);
            result.setRetCode(Result.RECODE_SUCCESS);
            result.setData(library.getId());
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
            if (StringUtil.isNullOrEmpty(id)) {
                result.setRetCode(Result.RECODE_VALIDATE_ERROR);
                result.setErrMsg("图书馆id不能为空");
                return result;
            }
            result.setData(libraryService.selectByPrimaryKey(id));
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
            Pagination<Library> pagination = libraryService.selectPageQuery(libraryName,pageNum,pageSize);
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
            List<Library> list = libraryService.selectAll();
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
