package com.test.controller;

import com.test.model.bo.UserBorrowDetail;
import com.test.model.po.DbBorrow;
import com.test.service.DbBorrowService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class BorrowController {
    @Resource
    private DbBorrowService dbBorrowService;

    @GetMapping("borrow/detail/{uid}")
    public UserBorrowDetail getUserBorrowDetailByUid(@PathVariable("uid") int uid) {
        return dbBorrowService.getUserBorrowDetailByUid(uid);
    }
}
