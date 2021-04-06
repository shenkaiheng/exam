package com.skh.githubtest.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.skh.githubtest.entity.Log;
import com.skh.githubtest.service.LogService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 功能描述：
 *
 * @Author: SKH
 * @Date: 2021/4/2 19:20
 */
@RestController
@RequestMapping("/api/log")
@CrossOrigin
public class LogController {
    @Resource
    private LogService logService;

       @GetMapping("/findTime")
       public Log findLog(){
           QueryWrapper<Log> logQueryWrapper = new QueryWrapper<>();
           long l = System.currentTimeMillis();
           Log log = new Log();
           log.setTime(l);
           save(log);
           logQueryWrapper.setEntity(log);
           return logService.getOne(logQueryWrapper);
       }

       @PutMapping("/save")
       public boolean save(@RequestBody Log log){ ;
           return logService.save(log);
       }
}
