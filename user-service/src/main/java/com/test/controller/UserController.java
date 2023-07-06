package com.test.controller;

import com.test.model.po.DbUser;
import com.test.service.DbUserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserController {
    @Resource
    private DbUserService dbUserService;
    
    @GetMapping("user/{id}")
    public DbUser getUserByUid(@PathVariable("id") Integer id) {
        DbUser byId = dbUserService.getById(id);
        
        return byId;
    }
}
