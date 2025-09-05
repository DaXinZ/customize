package org.example.imp;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.Bo.CuisineBo;
import org.Cuisine.CuisineVo;
import org.example.DishinformationService;
import org.mapper.DishinformationMapperCustom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utils.PageResult;
import utils.PagedGridResult;
import utils.SimplePageResult;

import java.util.List;

/**
 *
 */
@Service
public class DishinformationImp implements DishinformationService {
    @Autowired
    private DishinformationMapperCustom dishinformationCustom;

    @Override
    public SimplePageResult<CuisineVo> queryCuisine(CuisineBo cuisineBo) {
        int pageNum = (cuisineBo.getPage() == null || cuisineBo.getPage() <= 0) ? 1 : cuisineBo.getPage();
        int pageSize = (cuisineBo.getPageSize() == null || cuisineBo.getPageSize() <= 0) ? 10 : cuisineBo.getPageSize();
// 开启分页
        PageHelper.startPage(pageNum, pageSize);

        // 执行查询（动态SQL会自动处理空参数）
        List<CuisineVo> list = dishinformationCustom.queryCuisine(cuisineBo);
        PageInfo<CuisineVo> pageInfo = new PageInfo<>(list);

        // 包装分页结果
        return new SimplePageResult<>(
                pageInfo.getTotal(),    // 总记录数
                pageInfo.getList(),     // 当前页数据
                pageNum,                // 当前页码
                pageSize                // 每页条数
        );
    }


}
