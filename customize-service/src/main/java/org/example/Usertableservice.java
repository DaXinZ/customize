package org.example;

import org.Bo.UserBo;
import org.Bo.UserVo;
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
     * 注册用户接口
     *
     * @param userBo
     * @return
     */

    public UserVo register(UserBo userBo);


    /**
     * 用户登录接口
     *
     * @param name
     * @param password
     * @return
     */
    public Usertable login(String name, String password);


}
