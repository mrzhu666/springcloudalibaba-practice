package com.test.controller;

import com.test.model.po.DbBook;
import com.test.service.DbBookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class BookController {
    @Resource
    private DbBookService dbBookService;
    
    @GetMapping("book/{id}")
    public DbBook getBook(@PathVariable("id") Integer id) {
        DbBook byId = dbBookService.getById(id);
        
        return byId;
    }
}
