package org.mapper;

import org.Bo.UserBo;
import org.Bo.UserVo;
import org.apache.ibatis.annotations.Mapper;
import org.gather.UsertableVO;
import org.my.mapper.MyMapper;
import org.pojo.Usertable;
import org.springframework.context.annotation.Bean;

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
     * 注册
     * @param userVo
     * @return
     */
    public UserVo  register(UserVo userVo);





}