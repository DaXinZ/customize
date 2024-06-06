package org.example;

import org.Bo.UserBo;
import org.gather.UsertableVO;
import org.pojo.Usertable;

import java.util.List;


public interface Usertableservice {


    /**
     * 根据id查询用户信息
     *
     * @param id
     * @return
     */
    public List<UsertableVO>  queryUserInfo(String id);


    /**
     *
     * @param id
     * @return
     */
    public UsertableVO queryuser(String id);


    /**
     * 注册用户接口
     * @param userBo
     * @return
     */

    public Usertable register(UserBo userBo);


}
