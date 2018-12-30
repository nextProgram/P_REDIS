package com.example.eurekaclient.demo.base.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

/**
 * @author lhx
 * @date 2018/12/12
 * 使用redisTemple直连Redis
 */
@Service
public class StringRedisTemplateService {
    //使用日志，定义一个全局的记录器，通过LoggerFactory获取
    private final static Logger logger = LoggerFactory.getLogger(StringRedisTemplateService.class);
    @Autowired
    private StringRedisTemplate stringRedisTemplate;//spring boot默认提供的Redis接口

    /**
     * 新增
     * @param paraKey
     * @param paraValue
     * @return value
     */
    public void opsForAdd(String paraKey,String paraValue){
        stringRedisTemplate.opsForValue().set(paraKey,paraValue);
        String str = stringRedisTemplate.opsForValue().get(paraKey);
        logger.info("set成功：key["+paraKey+"],value["+str+"]");
    }
}
