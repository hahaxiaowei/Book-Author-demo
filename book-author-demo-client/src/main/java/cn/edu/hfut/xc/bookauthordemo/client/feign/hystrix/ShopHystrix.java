package cn.edu.hfut.xc.bookauthordemo.client.feign.hystrix;


import cn.edu.hfut.xc.bookauthordemo.client.feign.ShopService;
import cn.edu.hfut.xc.bookauthordemo.common.model.Shop;
import cn.edu.hfut.xc.bookauthordemo.common.util.Pagination;
import cn.edu.hfut.xc.bookauthordemo.common.util.Result;
import org.springframework.stereotype.Component;

/**
 * Created by sunwei on 2018/1/4 Time:13:37
 */
@Component
public class ShopHystrix implements ShopService {
    @Override
    public Result deleteByPrimaryKey(String id) {
        Result result = new Result();
        result.setRetCode(Result.RECODE_ERROR);
        result.setErrMsg("调用服务降级处理逻辑！");
        return result;
    }

    @Override
    public Result insert(Shop record) {
        Result result = new Result();
        result.setRetCode(Result.RECODE_ERROR);
        result.setErrMsg("调用服务降级处理逻辑！");
        return result;
    }

    @Override
    public Result insertSelective(Shop record) {
        Result result = new Result();
        result.setRetCode(Result.RECODE_ERROR);
        result.setErrMsg("调用服务降级处理逻辑！");
        return result;
    }

    @Override
    public Result selectByPrimaryKey(String id) {
        Result result = new Result();
        result.setRetCode(Result.RECODE_ERROR);
        result.setErrMsg("调用服务降级处理逻辑！");
        return result;
    }

    @Override
    public Result selectPageQuery(String shopName, int pageNum, int pageSize) {
        Result result = new Result();
        result.setRetCode(Result.RECODE_ERROR);
        result.setErrMsg("调用服务降级处理逻辑！");
        return result;
    }

//    @Override
//    public Result updateByPrimaryKeySelective(Shop record) {
//        Result result = new Result();
//        result.setRetCode(Result.RECODE_ERROR);
//        result.setErrMsg("调用服务降级处理逻辑！");
//        return result;
//    }

    @Override
    public Result updateByPrimaryKey(Shop record) {
        Result result = new Result();
        result.setRetCode(Result.RECODE_ERROR);
        result.setErrMsg("调用服务降级处理逻辑！");
        return result;
    }

    @Override
    public Result selectAll() {
        Result result = new Result();
        result.setRetCode(Result.RECODE_ERROR);
        result.setErrMsg("调用服务降级处理逻辑！");
        return result;
    }
}
