package com.test.model.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName DB_BOOK
 */
@TableName(value ="DB_BOOK")
@Data
public class DbBook implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer bid;

    /**
     * 
     */
    private String title;

    /**
     * 
     */
    @TableField("`desc`")
    private String desc;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}