package cn.edu.hfut.xc.bookauthordemo.client.feign.hystrix;


import cn.edu.hfut.xc.bookauthordemo.client.feign.LibraryService;
import cn.edu.hfut.xc.bookauthordemo.common.model.Library;
import cn.edu.hfut.xc.bookauthordemo.common.util.Pagination;
import cn.edu.hfut.xc.bookauthordemo.common.util.Result;
import org.springframework.stereotype.Component;

/**
 * Created by sunwei on 2018/1/4 Time:13:37
 */
@Component
public class LibraryHystrix implements LibraryService {
    @Override
    public Result deleteByPrimaryKey(String id) {
        Result result = new Result();
        result.setRetCode(Result.RECODE_ERROR);
        result.setErrMsg("调用服务降级处理逻辑！");
        return result;
    }

    @Override
    public Result insert(Library record) {
        Result result = new Result();
        result.setRetCode(Result.RECODE_ERROR);
        result.setErrMsg("调用服务降级处理逻辑！");
        return result;
    }

    @Override
    public Result insertSelective(Library record) {
        Result result = new Result();
        result.setRetCode(Result.RECODE_ERROR);
        result.setErrMsg("调用服务降级处理逻辑！");
        return result;
    }

    @Override
    public Result selectByPrimaryKey(String id) {
        return null;
    }

    @Override
    public Result selectPageQuery(String libraryName, int pageNum, int pageSize) {
        Result result = new Result();
        result.setRetCode(Result.RECODE_ERROR);
        result.setErrMsg("调用服务降级处理逻辑！");
        return result;
    }

//    @Override
//    public Result updateByPrimaryKeySelective(Library record) {
//        Result result = new Result();
//        result.setRetCode(Result.RECODE_ERROR);
//        result.setErrMsg("调用服务降级处理逻辑！");
//        return result;
//    }

    @Override
    public Result updateByPrimaryKey(Library record) {
        Result result = new Result();
        result.setRetCode(Result.RECODE_ERROR);
        result.setErrMsg("调用服务降级处理逻辑！");
        return result;
    }
}
