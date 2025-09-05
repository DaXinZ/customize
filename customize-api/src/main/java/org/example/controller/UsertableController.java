package org.example.controller;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.example.UsertableService;
import org.gather.UsertableVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import utils.JSONResult;

import java.util.List;

@Api(value = "用户接口", tags = {"用户相关信息的查询修改接口"})
@RestController
@RequestMapping("User")
public class UsertableController {
    @Autowired
    private UsertableService usertableservice;

    final  static Logger logger = LoggerFactory.getLogger(UsertableService.class);


    /**
     * 查询用户相关信息
     * @param id
     * @return
     */
    @ApiOperation(value = "查询用户相关信息", notes = "查询用户相关信息", httpMethod = "GET")
    @GetMapping("/queryUserInfo.json")
    public JSONResult queryUserInfo( @ApiParam(name = "id", value = "用户id", required = false
    ) @RequestParam String id )
    {
        logger.info("接受入参"+id);
        List<UsertableVO>  usertableVO = usertableservice.queryUserInfo(id);
        logger.info(JSON.toJSONString(usertableVO, SerializerFeature.WriteMapNullValue));
        return  JSONResult.ok(usertableVO);

    }


    }





