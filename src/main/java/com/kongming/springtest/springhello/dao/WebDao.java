package com.kongming.springtest.springhello.dao;

import com.kongming.springtest.springhello.domain.po.WebPo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface WebDao {

    List<WebPo> webList();
}
