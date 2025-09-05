package org.example.imp;

import org.Bo.CuisineBo;
import org.Cuisine.CuisineVo;
import org.example.DishinformationService;
import org.mapper.DishinformationMapperCustom;
import org.pojo.Dishinformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utils.PagedGridResult;

import java.util.List;

/**
 *
 */
@Service
public class DishinformationImp implements DishinformationService {
    @Autowired
    private DishinformationMapperCustom dishinformationCustom;
    @Override
    public  List<CuisineVo> queryCuisine(CuisineBo cuisineBo) {
        List<CuisineVo>  cuisine =   dishinformationCustom.queryCuisine(cuisineBo);
        return cuisine;
    }
}
