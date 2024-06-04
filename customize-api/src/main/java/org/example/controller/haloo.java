package org.example.controller;

import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Conditional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import utils.JSONResult;

@RestController

public class haloo {
    final  static Logger logger = LoggerFactory.getLogger(haloo.class);
    @GetMapping("/halo")
   public Object hello(){
        String a = "asakdasd";
        logger.info(JSON.toJSONString(a));
        logger.error(JSON.toJSONString(a));
       return JSONResult.ok(a);
   }
}
