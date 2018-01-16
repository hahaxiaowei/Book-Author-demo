package cn.edu.hfut.xc.bookauthordemo.client.feign;

import cn.edu.hfut.xc.bookauthordemo.client.feign.hystrix.BookHystrix;
import cn.edu.hfut.xc.bookauthordemo.common.model.Book;
import cn.edu.hfut.xc.bookauthordemo.common.util.Result;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * Created by sunwei on 2018/1/4 Time:11:59
 */
@FeignClient(value = "book-author-demo-provider", fallback = BookHystrix.class)//通过Feign来绑定provider和client两个项目，还包括熔断处理，服务降级到AuthorHystrix类
public interface BookService {
    /**
     * 根据主键删除图书
     * @param id
     * @return
     */
    @RequestMapping(value = "/deleteByPrimaryKey/{id}", method = RequestMethod.DELETE)
    Result deleteByPrimaryKey(@PathVariable(value = "id") String id);

    /**
     * 插入新的图书
     * @param record
     * @return
     */
    @RequestMapping(value = "/book/insert", method = RequestMethod.POST)
    Result insert(@RequestBody Book record);

    /**
     * 有条件的插入图书信息
     * @param record
     * @return
     */
    @RequestMapping(value = "/book/insertSelective", method = RequestMethod.POST)
    Result insertSelective(@RequestBody Book record);

    /**
     * 根据主键查询图书信息
     * @param id
     * @return
     */
    @RequestMapping(value ="/book/selectByPrimaryKey/{id}",method = RequestMethod.GET)
    Result selectByPrimaryKey(@PathVariable(value = "id") String id);

    /**
     * 分页查询
     * @param bookName
     * @param pageNum
     * @param pageSize
     * @return
     */
    @RequestMapping(value = "/book/selectPageQuery",method = RequestMethod.GET)
    Result selectPageQuery (@RequestParam(required = false, defaultValue = "", value = "bookName") String bookName,
                                      @RequestParam(defaultValue = "1", value = "pageNum") int pageNum,
                                      @RequestParam(defaultValue = "10", value = "pageSize") int pageSize);

//    /**
//     * 有条件的更新图书信息
//     * @param record
//     * @return
//     */
//    Result updateByPrimaryKeySelective(Book record);

    /**
     * 更新图书信息
     * @param record
     * @return
     */
    @RequestMapping(value = "/book/updateByPrimaryKey" ,method = RequestMethod.PUT)
    Result updateByPrimaryKey(@RequestBody Book record);
}
