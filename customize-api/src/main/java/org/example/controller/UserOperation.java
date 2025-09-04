package org.example.controller;


import com.alibaba.fastjson.JSON;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.Bo.UserBo;
import org.Bo.UserVo;
import org.apache.commons.lang3.StringUtils;
import org.example.UsertableService;
import org.pojo.Usertable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import utils.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Api(value = "用户接口", tags = {"用于用户注册更新等"})
@RestController
@RequestMapping("Users")
public class UserOperation {
    @Autowired
    private UsertableService usertableservice;

    final  static Logger log = LoggerFactory.getLogger(UserOperation.class);


    @ApiOperation(value = "用户注册", notes = "用户注册", httpMethod = "POST")
    @PostMapping("/regist.json")
    public JSONResult regist(@RequestBody UserBo userBo)
    {
       String name = userBo.getName();
       String password = userBo.getPassword();
       String nicknema = userBo.getNicknema();
       String confirmpassword = userBo.getConfirmpassword();

        RandomN nickname = new RandomN();
       log.info("接受入参"+JSON.toJSONString(userBo));
       if (name == null || name.equals("")){
           log.info("用户名为空");
           return JSONResult.errorMsg("用户名不能为空");
       }
       if (password.length() < 6 || password.length() > 20){
           return JSONResult.errorMsg("密码长度在6-20之间");
       }
       if (password == null || password.equals("")){
           return JSONResult.errorMsg("密码不能为空");
       } else if (!password.equals(confirmpassword)){
           return JSONResult.errorMsg("两次输入密码不一致");
       }
       if (!isAlphaNumeric.isAlphaNumeric(name)){
           return JSONResult.errorMsg("用户名只能包含字母和数字");
       }

       try {
           userBo.setPassword(MD5Utils.getMD5Str(password));
       } catch (Exception e) {
           e.printStackTrace();
       }

       if (nicknema == null || nicknema.equals("")){
           log.info("昵称为空，随机填入昵称");
           userBo.setNicknema(nickname.Nickname());
       }



       UserVo userVo = usertableservice.register(userBo);
       log.info(JSON.toJSONString(userVo));
        return JSONResult.ok(userVo);

    }

    /**
     *
     * @param userBo
     * @param request
     * @param response
     * @return  用户登录接口
     * @throws Exception
     */
    @ApiOperation(value = "用户登录", notes = "用户登录", httpMethod = "POST")
    @PostMapping("/login.json")
    public JSONResult login(@RequestBody UserBo userBo ,
                                 HttpServletRequest request,
                                 HttpServletResponse response) throws Exception {

        String username = userBo.getName();
        String password = userBo.getPassword();
        log.info("接受入参"+JSON.toJSONString(userBo));
        // 1. 判断用户名不能为空
        if (StringUtils.isBlank(username)) {
            log.info( username +  JSON.toJSONString("用户名不能为空"));
            return JSONResult.errorMsg("用户名不能为空");
        }
        //判断密码不能为空
        if (StringUtils.isBlank(password)){
            log.info(  password + " 密码不能为空");
            return JSONResult.errorMsg("密码不能为空");
        }
        //密码长度不能少于6位
        if (password.length() < 6){
            log.info("密码长度少于6位");
            return JSONResult.errorMsg("密码长度少于6位");
        }


        //实现登录
        Usertable userResult = usertableservice.login(username, MD5Utils.getMD5Str(password));
        //判断用户名和密码是否正确
        if(userResult == null ){
            log.info(  "用户名或密码不正确");
            return JSONResult.errorMsg("用户名或密码不正确");
        }

        userResult.setPassword(null);
        userResult.setPersonalizedsignature(null);
        userResult.setEmail(null);
        userResult.setUpdateTime(null);
        userResult.setCreationTime(null);
        userResult.setPhone(null);
        userResult.setId(userResult.getId());

        userResult = setNullProperty(userResult);
        CookieUtils.setCookie(request, response, "user",
                JsonUtils.objectToJson(userResult), true);
        // 3. 登录成功
        log.info( "登录成功");
        log.info( JSON.toJSONString(userResult));
        log.info(JSON.toJSONString(userResult.getId()));
        return JSONResult.ok(userResult.getId());
    }

    private Usertable setNullProperty(Usertable userResult){
        // TODO 设置那些字段不让前端知道，并且设置为空
        userResult.setPassword(null);
        userResult.setEmail(null);
        userResult.setEmail(null);
        userResult.setCreationTime(null);
        userResult.setUpdateTime(null);
        userResult.setChatheads(null);
        return userResult;
    }


}
