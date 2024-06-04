package org.example;

import org.gather.UsertableVO;

import java.util.List;


public interface Usertableservice {


    /**
     * 根据id查询用户信息
     *
     * @param id
     * @return
     */
    public List<UsertableVO>  queryUserInfo(String id);
}
