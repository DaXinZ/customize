package org.example;

import org.Bo.UserBo;
import org.Bo.UserVo;
import org.Bo.UsernewBo;
import org.gather.UsertableVO;
import org.pojo.Usertable;

import java.util.List;


public interface UsertableService {


    /**
     * 根据id查询用户信息
     *
     * @param id
     * @return
     */
    public List<UsertableVO>  queryUserInfo(String id);


   /**
     * 根据id查询用户信息
     *
     * @param id
     * @return
     */
    public  List<UserVo>  queryUser(UsernewBo UsernewBo);
    

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


    /**
     * 根据用户名查询用户信息
     *
     * @param id
     * @return
     */


}
