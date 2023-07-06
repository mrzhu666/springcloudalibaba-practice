package com.test.mapper;

import com.test.model.po.DbBorrow;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
* @author mrzhu
* @description 针对表【DB_BORROW】的数据库操作Mapper
* @createDate 2023-06-30 20:05:06
* @Entity com.test.model.po.DbBorrow
*/
public interface DbBorrowMapper extends BaseMapper<DbBorrow> {
    @Select("select * from DB_BORROW where uid = #{uid}")
    List<DbBorrow> getBorrowsByUid(int uid);
    
    @Select("select * from DB_BORROW where bid = #{bid}")
    List<DbBorrow> getBorrowsByBid(int bid);
    
    @Select("select * from DB_BORROW where bid = #{bid} and uid = #{uid}")
    DbBorrow getBorrow(int uid, int bid);
}




