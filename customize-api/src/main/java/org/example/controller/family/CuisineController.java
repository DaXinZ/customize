package org.example.controller.family;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.Cuisine.CuisineVo;
import org.example.CuisineSevice;
import org.pojo.Cuisine;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import utils.JSONResult;

import java.util.List;

@Api(value = "菜系接口", tags = {"查询菜系菜品相关接口"})
@RestController
@RequestMapping("Cuisine")
public class CuisineController {
    @Autowired
    private CuisineSevice CuisineSevice;

    final static Logger logger = LoggerFactory.getLogger(CuisineSevice.class);


    /**
     * 查询菜系
     * @param id
     * @return
     */
    @ApiOperation(value = "查询菜系", notes = "查询菜系", httpMethod = "GET")
    @GetMapping("/queryCuisinename.json")
    public JSONResult queryCuisinename(@ApiParam(name = "classify", value = "", required = false
    ) @RequestParam String classify )
    {
        logger.info("接受入参"+classify);
        List<Cuisine> cuisine = CuisineSevice.queryCuisinename(classify);
        logger.info(JSON.toJSONString(cuisine, SerializerFeature.WriteMapNullValue));
        return  JSONResult.ok(cuisine);

    }


}




