package com.example.eurekaclient.demo.base.controller;

import com.example.eurekaclient.demo.base.service.JedisService;
import com.example.eurekaclient.demo.base.vo.JedisRequestVO;
import com.example.eurekaclient.demo.base.vo.JedisReturnVO;
import com.example.eurekaclient.demo.base.vo.ReturnVO;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lhx
 * @date 2018/12/12
 */
@RestController
@RequestMapping("jedisStr")
public class JedisController {
    private final static Logger logger = LoggerFactory.getLogger(JedisController.class);

    @Autowired
    private JedisService jedisService;

    /**
     * Jedis
     * @param jedisRequestVO
     */
    @ApiOperation(value = "Jedis新增key-value")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "paraKey", value = "key", required = true, dataType = "String"),
            @ApiImplicitParam(name = "paraValue", value = "value", required = true, dataType = "String")
    })
    @PostMapping(value = "/jedisForStringSet")
    public ReturnVO<JedisReturnVO> jedisForStringSet(@RequestBody JedisRequestVO jedisRequestVO){
        logger.info("jedisForStringSet请求参数:key["+jedisRequestVO.getKey()+"],value["+jedisRequestVO.getValue()+"]");
        ReturnVO<JedisReturnVO> returnVO = new ReturnVO<>();
        JedisReturnVO jedisReturnVO = jedisService.jedisForStringSet(jedisRequestVO.getKey(),jedisRequestVO.getValue());
        returnVO.setRetCode("1");
        returnVO.setRetMsg("Jedis新增key-value:成功");
        returnVO.setRetData(jedisReturnVO);
        return returnVO;
    }
}
