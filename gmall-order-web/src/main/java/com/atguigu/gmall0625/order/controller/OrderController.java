package com.atguigu.gmall0625.order.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gmall0625.bean.UserAddress;
import com.atguigu.gmall0625.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.oauth2.resource.UserInfoTokenServices;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class OrderController {

    @Reference
    private UserInfoService userInfoService;
    @RequestMapping("trade")
    @ResponseBody
    //1.返回json字符串
    //2.将控制器中的数据直接输入到一个空白页
    public List<UserAddress> trade(String userId){
        //得到用户的地址
        return userInfoService.findUserAddressListByUserId(userId);
    }

}

