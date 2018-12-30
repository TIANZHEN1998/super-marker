package com.soft1841.service;

import com.soft1841.entity.Detail;
import com.soft1841.utils.ServiceFactory;
import org.junit.Test;
import java.util.List;


/**
 * Created by 田震 on 2018/12/30 10:49
 */

public class DetailServiceTest {
    private DetailService detailService = ServiceFactory.getDetailServiceInstance();

    @Test
    public void getAllDetails () {
        List<Detail> detailList = detailService.getAllDetails();
        detailList.forEach(detail -> System.out.println(detail));

    }
    @Test
    public void insertTicket(){
        Detail detail = new Detail();
        detail.setTicketId(2);
        detail.setGoodsId("16");
        detail.setNumber(5);
        detailService.insertDetail(detail);}
}
