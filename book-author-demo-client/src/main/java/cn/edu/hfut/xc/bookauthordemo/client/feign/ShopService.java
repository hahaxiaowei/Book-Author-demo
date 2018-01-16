package cn.edu.hfut.xc.bookauthordemo.client.feign;

import cn.edu.hfut.xc.bookauthordemo.client.feign.hystrix.NationalityHystrix;
import cn.edu.hfut.xc.bookauthordemo.client.feign.hystrix.ShopHystrix;
import cn.edu.hfut.xc.bookauthordemo.common.model.Shop;
import cn.edu.hfut.xc.bookauthordemo.common.util.Pagination;
import cn.edu.hfut.xc.bookauthordemo.common.util.Result;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * Created by sunwei on 2018/1/4 Time:13:35
 */
@FeignClient(value = "book-author-demo-provider", fallback = ShopHystrix.class)//通过Feign来绑定provider和client两个项目，还包括熔断处理，服务降级到AuthorHystrix类
public interface ShopService {
    /**
     * 根据主键删除商店信息
     * @param id
     * @return
     */
    @RequestMapping(value = "/shop/deleteByPrimaryKey/{id}", method = RequestMethod.DELETE)
    Result deleteByPrimaryKey(@PathVariable(value = "id") String id);

    /**
     * 插入商店信息
     * @param record
     * @return
     */
    @RequestMapping(value = "/shop/insert", method = RequestMethod.POST)
    Result insert(@RequestBody Shop record);

    /**
     * 有条件的插入商店信息
     * @param record
     * @return
     */
    @RequestMapping(value = "/shop/insert", method = RequestMethod.POST)
    Result insertSelective(@RequestBody Shop record);

    /**
     * 根据主键查询商店信息
     * @param id
     * @return
     */
    @RequestMapping(value = "/shop/selectByPrimaryKey/{id}", method = RequestMethod.GET)
    Result selectByPrimaryKey(@PathVariable(value = "id") String id);

    /**
     * 分页查询
     * @param shopName
     * @param pageNum
     * @param pageSize
     * @return
     */
    @RequestMapping(value = "/shop/selectPageQuery", method = RequestMethod.GET)
    Result selectPageQuery (@RequestParam(required = false, defaultValue = "", value = "shopName") String shopName ,
                                      @RequestParam(defaultValue = "1", value = "pageNum") int pageNum,
                                      @RequestParam(defaultValue = "10", value = "pageSize") int pageSize);

//    /**
//     * 有条件的更新商店信息
//     * @param record
//     * @return
//     */
//
//    Result updateByPrimaryKeySelective(Shop record);

    /**
     * 更新商店信息
     * @param record
     * @return
     */
    @RequestMapping(value = "/shop/updateByPrimaryKey", method = RequestMethod.PUT)
    Result updateByPrimaryKey(@RequestBody Shop record);
}
