package org.mapper;

import org.Bo.UserVo;
import org.Bo.UsernewBo;
import org.apache.ibatis.annotations.Mapper;
import org.gather.UsertableVO;

import java.util.List;

@Mapper

public interface UsertableMapperCustom {


    /**
     * 根据id查询用户信息
     * @param id
     * @return
     */
     public List<UsertableVO>  queryUserInfo(String id);


     /**
      * @param UsernewBo
      * @return
      */
     public List<UserVo> queryUser(UsernewBo UsernewBo);




    /**
     * 注册
     * @param userVo
     * @return
     */
    public UserVo  register(UserVo userVo);





}