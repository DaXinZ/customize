package org.mapper;

import org.Bo.UserVo;
import org.Bo.UsernewBo;
import org.apache.ibatis.annotations.Mapper;
import org.gather.UsertableVO;
import org.pojo.Cuisine;

import java.util.List;

@Mapper

public interface CuisineMapperCustom {


    /**
     * 根据id查询用户信息
     * @param id
     * @return
     */
     public List<Cuisine>    queryCuisinename(String classify);







}