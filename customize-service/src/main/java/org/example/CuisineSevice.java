package org.example;

import org.pojo.Cuisine;

import java.util.List;

public interface CuisineSevice {

    /**
     * 查询菜系列表
     */
    public List<Cuisine> queryCuisinename (String classify);

}
