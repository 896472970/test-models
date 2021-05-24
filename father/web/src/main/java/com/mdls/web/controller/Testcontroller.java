package com.mdls.web.controller;

import org.apache.ibatis.annotations.ResultType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.ServiceTest;

@RestController
@RequestMapping("test")
public class Testcontroller {
    @RequestMapping("showall")
    public String showall(){
        ServiceTest serviceTest=new ServiceTest();
        return  serviceTest.showService()+"show all!";
    }

}
