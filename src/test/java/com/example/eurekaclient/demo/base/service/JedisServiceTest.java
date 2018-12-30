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
public class JedisServiceTest {

    @Autowired
    private JedisService jedisService;

    @Test
    public void jedisForStringSet() {
        jedisService.jedisForStringSet("pinpin","1725");
    }
}