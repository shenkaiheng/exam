package com.skh.githubtest.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.skh.githubtest.entity.Log;
import com.skh.githubtest.mapper.LogMapper;
import com.skh.githubtest.service.LogService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 功能描述：
 *
 * @Author: SKH
 * @Date: 2021/4/2 19:22
 */
@Service
public class LogImpl extends ServiceImpl<LogMapper,Log> implements LogService {

    @Resource
    private LogMapper logMapper;


    @Override
    public boolean save(Log log) {
        int insert = logMapper.insert(log);
        if (insert > 0){
            return true;
        }
        return false;
    }

}
