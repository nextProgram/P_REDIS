package com.example.eurekaclient.demo.base.controller;

import com.example.eurekaclient.demo.base.service.StringRedisTemplateService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lhx
 * @date 2018/12/12
 */
@RestController
@RequestMapping("/redisStr")
public class StringRedisTemplateController {
    @Autowired
    private StringRedisTemplateService stringRedisTemplateService;

    /**
     * 新增
     * @param paraKey
     * @param paraValue
     * @return
     */
    @ApiOperation(value = "stringRedisTemplate新增key-value")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "paraKey", value = "key", required = true, dataType = "String"),
            @ApiImplicitParam(name = "paraValue", value = "value", required = true, dataType = "String")
    })
    @PostMapping(value = "opsForAdd")
    public void opsForAdd(String paraKey,String paraValue){
        stringRedisTemplateService.opsForAdd(paraKey,paraValue);
    }

}
