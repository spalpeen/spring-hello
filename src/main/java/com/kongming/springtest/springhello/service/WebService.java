package com.kongming.springtest.springhello.service;

import com.kongming.springtest.springhello.dao.WebDao;
import com.kongming.springtest.springhello.domain.po.WebPo;
import com.kongming.springtest.springhello.domain.vo.WebVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class WebService {

    @Resource
    private WebDao webDao;

    public String sayHelloByWebService() {
        return "service say hello spring";
    }

    public List<WebVo> getwebVos() {
        List<WebPo> webPoList = webDao.webList();
        List<WebVo> webVoList = new ArrayList<>();
        for (WebPo webPo : webPoList) {
            WebVo webVo = new WebVo();
            webVo.setId(webPo.getId());
            webVo.setName(webPo.getName());
            webVoList.add(webVo);
        }
        return webVoList;
    }
}
