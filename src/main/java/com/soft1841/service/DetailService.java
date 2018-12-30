package com.soft1841.service;

import com.soft1841.entity.Detail;

import java.util.List;

public interface DetailService {


    /**
     *查询所有读者信息
     * @return
     */
    List<Detail> getAllDetails();


    long insertDetail (Detail detail);
}
