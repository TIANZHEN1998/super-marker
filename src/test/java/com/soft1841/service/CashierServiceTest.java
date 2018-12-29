package com.soft1841.service;

import com.soft1841.entity.Cashier;
import com.soft1841.utils.ServiceFactory;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;


public class CashierServiceTest {
    private CashierService CashierService = ServiceFactory.getCashierServiceInstance();

    @Test
    public void login () {
        boolean flag = CashierService.login("2624002","zx002");
        assertEquals(true,flag);
    }

    @Test
    public void getAllCashiers () {
        List<Cashier> cashierList = CashierService.getAllCashiers();
        cashierList.forEach(cashier -> System.out.println(cashier));
    }

    @Test
    public void deleteCashier () {
    }

    @Test
    public void insertCashier () {
    }
}