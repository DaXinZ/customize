package org.example.imp;

import org.Bo.UserBo;
import org.Bo.UserVo;
import org.Bo.UsernewBo;
import org.example.UsertableService;
import org.gather.UsertableVO;
import org.mapper.UsertableMapper;
import org.mapper.UsertableMapperCustom;
import org.pojo.Usertable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;
import utils.RandomN;

import java.util.Date;
import java.util.List;

@Service
public   class UsertableImp implements UsertableService {

    private static final Logger log = LoggerFactory.getLogger(UsertableImp.class);
    @Autowired
    private UsertableMapperCustom usertableMapperCustom;
    @Autowired
    private UsertableMapper usertableMapper;


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
     * 最新查询用户信息整合
     *
     * @param id
     * @return
     */
    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public List<UserVo> queryUser(UsernewBo usernewBo)

    {
        UserVo userVo = new UserVo();
        userVo.setAge(usernewBo.getAge());
        userVo.setId(usernewBo.getId());
        userVo.setNicknema(usernewBo.getNickname());
        userVo.setName(usernewBo.getName());
        List<UserVo> UserV1o =  usertableMapperCustom.queryUser(usernewBo);
        return UserV1o;
    }


    /**
     * 注册用户
     * @param userBo
     * @return
     */
    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public UserVo register(UserBo userBo){
        RandomN randomN = new RandomN();
        UserVo userVo = new UserVo();
        userVo.setId(randomN.ID());
        userVo.setName(userBo.getName());
        userVo.setNicknema(userBo.getNicknema());
        userVo.setPassword(userBo.getPassword());
        userVo.setGender(randomN.gender());
        userVo.setAge(randomN.age());
        userVo.setEmail(null);
        userVo.setpersonalizedSignature(randomN.RandompersonalizedSigna());
        userVo.setChatheads(randomN.chatheads());
        userVo.setSite(null);
        userVo.setPhone(null);
        userVo.setCreationTime(new Date());
        userVo.setUpdateTime(new Date());

        usertableMapperCustom.register(userVo);
        return userVo;
    }
    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public Usertable login(String name, String password) {
        Example userExample = new Example(Usertable.class);
        Example.Criteria userCriteria = userExample.createCriteria();

        userCriteria.andEqualTo("name", name);
        userCriteria.andEqualTo("password", password);
        Usertable result = usertableMapper.selectOneByExample(userExample);
        return result;
    }



}
