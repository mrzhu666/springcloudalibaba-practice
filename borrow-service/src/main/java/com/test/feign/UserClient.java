package com.test.feign;

import com.test.model.po.DbUser;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("userservice")
public interface UserClient {
    @GetMapping("user/{id}")
    public DbUser getUserByUid(@PathVariable("id") Integer id);
}
