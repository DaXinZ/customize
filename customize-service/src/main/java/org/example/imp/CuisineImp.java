package org.example.imp;

import org.example.CuisineSevice;
import org.mapper.CuisineMapper;
import org.mapper.CuisineMapperCustom;
import org.pojo.Cuisine;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CuisineImp implements CuisineSevice {

    private static final Logger log = LoggerFactory.getLogger(CuisineImp.class);

    @Autowired
    private CuisineMapperCustom cuisineMapperCustom;
    @Autowired
    private CuisineMapper cuisineMapper;


    @Override
    public List<Cuisine> queryCuisinename (String classify){
        List<Cuisine> cuisineVo = cuisineMapperCustom.queryCuisinename(classify);
        return   cuisineVo;
    }

}
