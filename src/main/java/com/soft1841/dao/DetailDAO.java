package com.soft1841.dao;

import com.soft1841.entity.Detail;

import java.sql.SQLException;
import java.util.List;

public interface DetailDAO {
    /**
     * 增加明细
     * @param detail
     * @return
     * @throws SQLException
     */
    Long insertDetail(Detail detail) throws SQLException;

    /**
     * 根据id查明细
     * @param id
     * @return
     * @throws SQLException
     */
    Detail getDetailById(long id) throws SQLException;

    List<Detail> getAllDetails () throws SQLException;

}
