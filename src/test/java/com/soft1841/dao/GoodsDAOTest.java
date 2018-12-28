package com.soft1841.dao;

import cn.hutool.db.Db;
import cn.hutool.db.Entity;
import com.soft1841.entity.Goods;
import com.soft1841.utils.DAOFactory;
import org.junit.Test;

import java.sql.SQLException;
import java.util.List;

public class GoodsDAOTest {
    private GoodsDAO goodsDAO = DAOFactory.getGoodsDAOInstance();

    @Test
    public void getAllGoods () {

    }

    @Test
    public void insertGoods ()  {
    }

    @Test
    public void deleteGoodsByID () {
    }

    @Test
    public void getGoodsById () {

    }

    @Test
    public void updateGoods () {
    }

    @Test
    public void deleteGoodsById () {
    }


    @Test
    public void selectAllGoods () throws SQLException {
        List<Goods> bookList = goodsDAO.selectAllGoods();
        bookList.forEach(book -> System.out.println(book.getName()));
    }
}