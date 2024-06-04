package org.example.imp;

import org.example.Usertableservice;
import org.gather.UsertableVO;
import org.mapper.UsertableMapperCustom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UsertableImp implements Usertableservice {

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





}
