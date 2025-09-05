package org.example;

import com.github.pagehelper.PageInfo;
import org.Bo.CuisineBo;
import org.Cuisine.CuisineVo;
import org.pojo.Dishinformation;
import utils.PageResult;
import utils.PagedGridResult;
import utils.SimplePageResult;

import java.util.List;

public interface DishinformationService {

    /**
     * 查询菜系
     * @param cuisineBo
     * @return
     */
    public  SimplePageResult<CuisineVo> queryCuisine(CuisineBo cuisineBo );


}
