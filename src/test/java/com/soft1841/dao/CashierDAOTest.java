package com.soft1841.dao;
import cn.hutool.db.Db;
import cn.hutool.db.Entity;
import com.soft1841.entity.Cashier;
import com.soft1841.utils.DAOFactory;
import org.junit.Test;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
 * Created by 田震 on 2018/12/29 9:58
 */

public class CashierDAOTest {
    private CashierDAO CashierDAO = DAOFactory.getCashierDAOInstance();
    @Test
    public void getCashierByNumber () throws SQLException {
        Cashier cashier =CashierDAO.getCashierByNumber("2624001");
        System.out.println(cashier);
    }
    @Test
    public void insertCashier () throws SQLException {
        Cashier cashier = new Cashier();
        cashier.setId(15);
        cashier.setName("田震");
        cashier.setNumber("19981106");
        cashier.setPassword("tz123");
        cashier.setPicture("http://img0.imgtn.bdimg.com/it/u=3388621441,2293360191&fm=26&gp=0.jpg");
        System.out.println(CashierDAO.insertCashier(cashier));
    }
    @Test
    public List <Cashier> selectCashiers ()throws SQLException{
        List <cn.hutool.db.Entity> entityList = Db.use().query("SELECT * FROM t_cashier ");
        List<Cashier> cashierList = new ArrayList<>();
        for (Entity entity : entityList) {
            cashierList.add(convertCashier(entity));
        }
        return cashierList;
    }
    private Cashier convertCashier (Entity entity) {
        Cashier cashier = new Cashier();
        cashier.setId(entity.getLong("id"));
        cashier.setName(entity.getStr("name"));
        cashier.setNumber(entity.getStr("number"));
        cashier.setPassword(entity.getStr("password"));
        cashier.setPicture(entity.getStr("picture"));
        return cashier;
    }
    }
