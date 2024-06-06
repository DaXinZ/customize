package org.example.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.Bo.UserBo;
import org.example.Usertableservice;
import org.pojo.Usertable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import utils.JSONResult;

@Api(value = "用户接口", tags = {"用于用户注册更新等"})
@RestController
@RequestMapping("Users")
public class UserOperation {
    @Autowired
    private Usertableservice usertableservice;

    final  static Logger logger = LoggerFactory.getLogger(Usertableservice.class);


    @ApiOperation(value = "用户注册", notes = "用户注册", httpMethod = "POST")
    @PostMapping("/regist")
    public JSONResult regist(@RequestBody UserBo userBo)
    {
       String name = userBo.getName();
       String password = userBo.getPassword();
        logger.info("接受入参");


       Usertable usertable = usertableservice.register(userBo);
        return JSONResult.ok(usertable);

    }




}
