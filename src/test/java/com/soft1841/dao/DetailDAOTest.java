package com.soft1841.dao;

import cn.hutool.db.Entity;
import com.soft1841.entity.Detail;
import com.soft1841.utils.DAOFactory;
import org.junit.Test;

import java.sql.SQLException;
import java.util.List;

import static org.junit.Assert.*;

public class DetailDAOTest {
    private DetailDAO detailDAO = DAOFactory.getDetailDAOInstance();
    @Test
    public void insertDetail () throws SQLException {
        Detail detail=new Detail();
        detail.setTicketId(7);
        detail.setGoodsId(230);
        detail.setNumber(2);
        System.out.println(detailDAO.insertDetail(detail));
    }

    @Test
    public void selectAllDetail () throws SQLException{
        List <Entity> detailList = detailDAO.selectAllDetail();
        detailList.forEach(entity -> System.out.println(entity.toString()));
    }

    @Test
    public void getDetailById () throws SQLException{
        Entity detail = detailDAO.getDetailById(3);
        System.out.println(detail);
    }

    @Test
    public void getDetailByTicketId() throws SQLException {
        List<Detail> detailList = detailDAO.getDetailByTicketId(28);
        detailList.forEach(entity -> System.out.println(entity.toString()));
    }
}