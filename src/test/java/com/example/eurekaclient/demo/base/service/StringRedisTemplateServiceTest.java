package com.example.eurekaclient.demo.base.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @author lhx
 * @date 2018/12/12
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
public class StringRedisTemplateServiceTest {
    @Autowired
    private StringRedisTemplateService stringRedisTemplateService;

    @Test
    public void opsForAdd() {
        stringRedisTemplateService.opsForAdd("pinpin","0125");
    }

}