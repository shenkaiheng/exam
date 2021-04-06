package com.skh.githubtest.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 功能描述：
 *
 * @Author: SKH
 * @Date: 2021/4/2 19:22
 */
@Data
@TableName("tb_log")
public class Log {

    @TableId(type = IdType.AUTO )
    private Integer id;

    @TableField("time")
    private Long time;

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}
