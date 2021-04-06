package com.skh.githubtest.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.skh.githubtest.entity.Log;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 功能描述：
 *
 * @Author: SKH
 * @Date: 2021/4/2 19:22
 */
@Mapper
public interface LogMapper extends BaseMapper<Log> {

}
