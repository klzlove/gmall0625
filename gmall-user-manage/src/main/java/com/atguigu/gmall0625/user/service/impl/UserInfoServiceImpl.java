package com.atguigu.gmall0625.user.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.atguigu.gmall0625.bean.UserAddress;
import com.atguigu.gmall0625.bean.UserInfo;
import com.atguigu.gmall0625.service.UserInfoService;
import com.atguigu.gmall0625.user.mapper.UserAddressMapper;
import com.atguigu.gmall0625.user.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;
    @Autowired
    private UserAddressMapper addressMapper;

    @Override
    public List<UserInfo> findAll() {

        return userInfoMapper.selectAll();
    }

    @Override
    public List<UserInfo> findUserInfo(UserInfo userInfo) {
        return null;
    }

    @Override
    public List<UserInfo> findByNickName(String nickName) {
        return null;
    }

    @Override
    public void addUser(UserInfo userInfo) {

    }

    @Override
    public void updUser(UserInfo userInfo) {

    }

    @Override
    public void delUser(UserInfo userInfo) {

    }

    @Override
    public List<UserAddress> findUserAddressListByUserId(String userId) {
        UserAddress userAddress = new UserAddress();
        userAddress.setUserId(userId);
        return addressMapper.select(userAddress);
    }

    @Override
    public List<UserAddress> findUserAddressListByUserId(UserAddress userAddress) {
        return addressMapper.select(userAddress);
    }
}
