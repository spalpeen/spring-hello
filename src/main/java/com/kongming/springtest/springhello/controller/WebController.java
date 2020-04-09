package com.kongming.springtest.springhello.controller;


import com.kongming.springtest.springhello.domain.vo.WebVo;
import com.kongming.springtest.springhello.service.WebService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class WebController {

    @Resource
    private WebService webService;

    @ResponseBody
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello() {
        return webService.sayHelloByWebService();
    }

    @RequestMapping(value = "/webhello",method = RequestMethod.GET)
    public List<WebVo> webhello() {
        return webService.getwebVos();
    }
}
