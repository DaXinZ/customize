package org.mapper;

import com.github.pagehelper.PageInfo;
import org.Bo.CuisineBo;
import org.Cuisine.CuisineVo;
import org.pojo.Dishinformation;
import utils.PagedGridResult;

import java.util.List;

public interface DishinformationMapperCustom {
    /**
     * 查询菜系
     * @param cuisineBo
     * @return
     */
    public  List<CuisineVo> queryCuisine(CuisineBo cuisineBo);



}
