package com.test.service;

import com.test.model.bo.UserBorrowDetail;
import com.test.model.po.DbBorrow;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author mrzhu
* @description 针对表【DB_BORROW】的数据库操作Service
* @createDate 2023-06-30 20:05:06
*/
public interface DbBorrowService extends IService<DbBorrow> {
    
    public UserBorrowDetail getUserBorrowDetailByUid(int uid);
}
