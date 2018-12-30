package com.soft1841.utils;

import com.soft1841.service.*;
import com.soft1841.service.impl.*;

public class ServiceFactory {
    public static CashierService getCashierServiceInstance () {
        return new CashierServiceImpl();
    }
    public static VIPService getVIPServiceInstance(){ return new VIPServiceImpl(); }
    public static TypeService getTypeServiceInstance(){ return new TypeServiceImpl();}
    public static GoodsService getGoodsServiceInstance(){ return new GoodsServiceImpl();}
    public static DetailService getDetailServiceInstance(){ return new DetailServiceImpl();}


}