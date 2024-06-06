package org.example.imp;

import org.Bo.UserBo;
import org.example.Usertableservice;
import org.gather.UsertableVO;
import org.mapper.UsertableMapperCustom;
import org.pojo.Usertable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import utils.RandomN;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Random;

@Service
public class UsertableImp implements Usertableservice {

    private static final Logger log = LoggerFactory.getLogger(UsertableImp.class);
    @Autowired
    private UsertableMapperCustom usertableMapperCustom;



    /**
     * 查询用户信息
     *
     * @param id
     * @return
     */
    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public List<UsertableVO> queryUserInfo(String id)
    {
        List<UsertableVO>   usertableVO =  usertableMapperCustom.queryUserInfo(id);
        return usertableVO;
    }


    /**
     *
     * @param id
     * @return
     */
    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public UsertableVO  queryuser(String id){
        UsertableVO usertableVO = usertableMapperCustom.queryuser(id);
        return usertableVO;
    }


    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public Usertable register(UserBo userBo){
        RandomN randomN = new RandomN();
        Usertable user = new Usertable();

        userBo.setId(randomN.ID());
        userBo.setName(userBo.getName());
        userBo.setNicknema(randomN.Nickname());
        userBo.setPassword(userBo.getPassword());
        userBo.setName(userBo.getName());
        userBo.setNicknema(randomN.Nickname());
        userBo.setPassword(userBo.getPassword());
        userBo.setGender(randomN.gender());
        userBo.setAge(randomN.age());
        userBo.setEmail(null);
        userBo.setpersonalizedSignature(randomN.RandompersonalizedSigna());
        userBo.setChatheads(randomN.chatheads());
        userBo.setSite(null);
        userBo.setPhone(null);
        userBo.setCreationTime(new Date());
        userBo.setUpdateTime(new Date());
        user.setId(userBo.getId());
        user.setName(userBo.getName());
        user.setNicknema(userBo.getNicknema());
        user.setPassword(userBo.getPassword());
        user.setGender(userBo.getGender());
        user.setAge(userBo.getAge());
        user.setEmail(userBo.getEmail());
        user.setPersonalizedsignature(userBo.getpersonalizedSignature());
        user.setChatheads(userBo.getChatheads());
        user.setSite(userBo.getSite());
        user.setPhone(userBo.getPhone());
        user.setCreationTime(userBo.getCreationTime());
        user.setUpdateTime(userBo.getUpdateTime());



        usertableMapperCustom.register(userBo);
        return user;
    }


}
