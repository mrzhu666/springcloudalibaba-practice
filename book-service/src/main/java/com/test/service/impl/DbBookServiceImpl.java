package com.test.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.test.model.po.DbBook;
import com.test.service.DbBookService;
import com.test.mapper.DbBookMapper;
import org.springframework.stereotype.Service;

/**
* @author mrzhu
* @description 针对表【DB_BOOK】的数据库操作Service实现
* @createDate 2023-06-30 17:02:57
*/
@Service
public class DbBookServiceImpl extends ServiceImpl<DbBookMapper, DbBook>
    implements DbBookService{

}




