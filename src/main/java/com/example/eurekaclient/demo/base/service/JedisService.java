package com.example.eurekaclient.demo.base.service;

import com.example.eurekaclient.demo.base.vo.JedisReturnVO;
import com.example.eurekaclient.demo.utills.JedisClientPoolUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author lhx
 * @date 2018/12/12
 * Jedis
 */
@Service
public class JedisService {
    private final static Logger logger = LoggerFactory.getLogger(JedisService.class);

    @Autowired
    private JedisClientPoolUtil jedisClientPoolUtil;

    /**
     *JedisForStringSet
     * @param key
     * @param value
     */
    public JedisReturnVO jedisForStringSet(String key,String value){
        JedisReturnVO jedisReturnVO = new JedisReturnVO();
        String returnValue = jedisClientPoolUtil.set(key,value);//返回处理状态
        logger.info("jedisForStringSet成功["+key+","+value+"],返回状态["+returnValue+"]");
        jedisReturnVO.setKey(key);
        jedisReturnVO.setValue(value);
        return jedisReturnVO;
    }
}
