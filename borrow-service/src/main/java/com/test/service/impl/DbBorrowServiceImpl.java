package com.test.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.test.feign.BookClient;
import com.test.feign.UserClient;
import com.test.model.bo.UserBorrowDetail;
import com.test.model.po.DbBook;
import com.test.model.po.DbBorrow;
import com.test.model.po.DbUser;
import com.test.service.DbBorrowService;
import com.test.mapper.DbBorrowMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

/**
* @author mrzhu
* @description 针对表【DB_BORROW】的数据库操作Service实现
* @createDate 2023-06-30 20:05:06
*/
@Service
public class DbBorrowServiceImpl extends ServiceImpl<DbBorrowMapper, DbBorrow>
    implements DbBorrowService{
    
    @Resource
    private DbBorrowMapper dbBorrowMapper;
    @Resource
    private BookClient bookClient;
    @Resource
    private UserClient userClient;
    /**
     * 通过uid获取，用户借阅过的书籍的详细信息
     */
    @Override
    public UserBorrowDetail getUserBorrowDetailByUid(int uid) {
        List<DbBorrow> borrows = dbBorrowMapper.getBorrowsByUid(uid);
        //获取用户信息
        DbUser user = userClient.getUserByUid(uid);
        //获取书籍信息
        List<DbBook> bookList=borrows.stream()
            .map(b-> bookClient.getBook(b.getBid()))
            .collect(Collectors.toList());
        return new UserBorrowDetail(user,bookList);
    }
}




