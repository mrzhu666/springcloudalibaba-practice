package com.test.feign;

import com.test.model.po.DbBook;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("bookservice")
public interface BookClient {
    @GetMapping("book/{id}")
    public DbBook getBook(@PathVariable("id") Integer id);
}
