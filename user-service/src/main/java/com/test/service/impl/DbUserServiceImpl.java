package com.test.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.test.model.po.DbUser;
import com.test.service.DbUserService;
import com.test.mapper.DbUserMapper;
import org.springframework.stereotype.Service;

/**
* @author mrzhu
* @description 针对表【DB_USER】的数据库操作Service实现
* @createDate 2023-06-30 20:07:51
*/
@Service
public class DbUserServiceImpl extends ServiceImpl<DbUserMapper, DbUser>
    implements DbUserService{

}




