package cn.edu.hfut.xc.bookauthordemo.client.feign;

import cn.edu.hfut.xc.bookauthordemo.client.feign.hystrix.PublisherHystrix;
import cn.edu.hfut.xc.bookauthordemo.common.model.Publisher;
import cn.edu.hfut.xc.bookauthordemo.common.util.Result;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * Created by sunwei on 2018/1/4 Time:12:01
 */
@FeignClient(value = "book-author-demo-provider", fallback = PublisherHystrix.class)//通过Feign来绑定provider和client两个项目，还包括熔断处理，服务降级到AuthorHystrix类
public interface PublisherService {
    /**
     * 根据主键删除出版商信息
     * @param id
     * @return
     */
    @RequestMapping(value = "/publisher/deleteByPrimaryKey/{id}", method = RequestMethod.DELETE)
    Result deleteByPrimaryKey(@PathVariable(value = "id") String id);
    /**
     * 插入出版商信息
     * @param record
     * @return
     */
    @RequestMapping(value = "/publisher/insert", method = RequestMethod.POST)
    Result insert(@RequestBody Publisher record);

    /**
     * 有条件的插入出版商信息
     * @param record
     * @return
     */
    @RequestMapping(value = "/publisher/insertSelective", method = RequestMethod.POST)
    Result insertSelective(@RequestBody Publisher record);

    /**
     * 根据主键查询出版商信息
     * @param id
     * @return
     */
    @RequestMapping(value = "/publisher/selectByPrimaryKey/{id}", method = RequestMethod.GET)
    Result selectByPrimaryKey(@PathVariable(value = "id") String id);

    /**
     * 分页查询
     * @param publisherName
     * @param pageNum
     * @param pageSize
     * @return
     */
    @RequestMapping(value = "/publisher/selectPageQuery", method = RequestMethod.GET)
    Result selectPageQuery (@RequestParam(required = false, defaultValue = "", value = "publisherName") String publisherName ,
                            @RequestParam(defaultValue = "1", value = "pageNum") int pageNum,
                            @RequestParam(defaultValue = "10", value = "pageSize") int pageSize);

//    /**
//     * 有条件的更新出版商信息
//     * @param record
//     * @return
//     */
//
//    Result updateByPrimaryKeySelective(Publisher record);

    /**
     * 更新出版商信息
     * @param record
     * @return
     */
    @RequestMapping(value = "/publisher/updateByPrimaryKey", method = RequestMethod.PUT)
    Result updateByPrimaryKey(@RequestBody Publisher record);

}
