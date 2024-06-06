package com.peachcake.service.impl;

import com.peachcake.service.PeachCake;
import com.peachcake.vo.PeachCakeVO;
import org.springframework.stereotype.Service;

@Service
public class PeachCakeImpl implements PeachCake {
    @Override
    public String fallInLove() {
        return "this is a beautiful day";
    }

    @Override
    public PeachCakeVO married(String name) {
        PeachCakeVO vo =new PeachCakeVO();
        vo.setAddress("深圳桂花小学309宿舍");
        vo.setAge("20");
        vo.setName("张仲涛");
        return vo;
    }
}
