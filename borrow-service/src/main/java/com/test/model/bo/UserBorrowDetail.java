package com.test.model.bo;

import com.test.model.po.DbBook;
import com.test.model.po.DbBorrow;
import com.test.model.po.DbUser;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

/**
 * 查询用户的借阅书籍的详细信息
 */
@Data
@AllArgsConstructor
public class UserBorrowDetail {
    private DbUser dbUser;
    private List<DbBook> dbBook;
}
