package com.atguigu.nacos.service;

import com.atguigu.nacos.bean.Movie;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "nacos-provider-movie")//绑定feign客户端和要远程访问的服务名称
public interface MovieFeignClient {
    @GetMapping("/getMovie")
    public Movie getMovie(@RequestParam("id") Integer id);
    @GetMapping("/getMovies")
    public List<Movie> getMovies();
    @PostMapping("/test")
    public String test();
}
