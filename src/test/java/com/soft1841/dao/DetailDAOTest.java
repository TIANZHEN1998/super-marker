package com.soft1841.dao;
import com.soft1841.entity.Detail;
import com.soft1841.utils.DAOFactory;
import org.junit.Test;
import java.sql.SQLException;

/**
 * Created by 田震 on 2018/12/29 21:39
 */
public class DetailDAOTest {
    private DetailDAO detailDAO = DAOFactory.getDetailDAOInstance();
    @Test
    public void insertDetail () throws SQLException {
        Detail detail = new Detail();
      detail.setTicketId(34);
        detail.setGoodsId("109");
        detail.setNumber(6);
        System.out.println(detailDAO.insertDetail(detail));
    }
    @Test
    public void selectAllDetail () {

    }

    @Test
    public void getDetailById () throws SQLException {
        System.out.println(detailDAO.getDetailById(16));
    }
}
