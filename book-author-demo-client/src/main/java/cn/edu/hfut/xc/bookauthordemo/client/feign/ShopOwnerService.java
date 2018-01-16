package cn.edu.hfut.xc.bookauthordemo.client.feign;

import cn.edu.hfut.xc.bookauthordemo.client.feign.hystrix.NationalityHystrix;
import cn.edu.hfut.xc.bookauthordemo.client.feign.hystrix.ShopOwnerHystrix;
import cn.edu.hfut.xc.bookauthordemo.common.model.ShopOwner;
import cn.edu.hfut.xc.bookauthordemo.common.util.Pagination;
import cn.edu.hfut.xc.bookauthordemo.common.util.Result;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * Created by sunwei on 2018/1/4 Time:13:35
 */
@FeignClient(value = "book-author-demo-provider", fallback = ShopOwnerHystrix.class)//通过Feign来绑定provider和client两个项目，还包括熔断处理，服务降级到AuthorHystrix类
public interface ShopOwnerService {
    /**
     * 根据主键删除店主信息
     * @param id
     * @return
     */
    @RequestMapping(value = "/shopowner/deleteByPrimaryKey/{id}", method = RequestMethod.DELETE)
    Result deleteByPrimaryKey(@PathVariable(value = "id") String id);

    /**
     * 插入店主信息
     * @param record
     * @return
     */
    @RequestMapping(value = "/shopowner/insert", method = RequestMethod.POST)
    Result insert(@RequestBody ShopOwner record);

    /**
     * 有条件的插入店主信息
     * @param record
     * @return
     */
    @RequestMapping(value = "/shopowner/insertSelective", method = RequestMethod.POST)
    Result insertSelective(@RequestBody ShopOwner record);

    /**
     * 根据主键查询店主信息
     * @param id
     * @return
     */
    @RequestMapping(value = "/shopowner/selectByPrimaryKey/{id}", method = RequestMethod.GET)
    Result selectByPrimaryKey(@PathVariable(value = "id") String id);

    /**
     * 分页查询
     * @param shopOwnerName
     * @param pageNum
     * @param pageSize
     * @return
     */
    @RequestMapping(value = "/shopowner/selectPageQuery", method = RequestMethod.GET)
    Result selectPageQuery (@RequestParam(required = false, defaultValue = "", value = "shopOwnerName") String shopOwnerName ,
                                           @RequestParam(defaultValue = "1", value = "pageNum") int pageNum,
                                           @RequestParam(defaultValue = "10", value = "pageSize") int pageSize);

//    /**
//     * 有条件的更新店主信息
//     * @param record
//     * @return
//     */
//    Result updateByPrimaryKeySelective(@RequestBody ShopOwner record);

    /**
     * 更新店主信息
     * @param record
     * @return
     */
    @RequestMapping(value = "/shopowner/updateByPrimaryKey", method = RequestMethod.PUT)
    Result updateByPrimaryKey(@RequestBody ShopOwner record);
}
