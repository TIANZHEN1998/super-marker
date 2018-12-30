package com.soft1841.entity;
import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 * 明细实体类
 */

public class Detail {
    private final SimpleLongProperty DetailId = new SimpleLongProperty();
    private final SimpleLongProperty TicketId = new SimpleLongProperty();
    private final SimpleStringProperty GoodsId = new SimpleStringProperty();
    private final SimpleLongProperty Number = new SimpleLongProperty();

    public Detail () {

    }

    public long getDetailId () {
        return DetailId.get();
    }

    public SimpleLongProperty detailIdProperty () {
        return DetailId;
    }

    public void setDetailId (long detailId) {
        this.DetailId.set(detailId);
    }

    public long getTicketId () {
        return TicketId.get();
    }

    public SimpleLongProperty ticketIdProperty () {
        return TicketId;
    }

    public void setTicketId (long ticketId) {
        this.TicketId.set(ticketId);
    }

    public String getGoodsId () {
        return GoodsId.get();
    }

    public SimpleStringProperty goodsIdProperty () {
        return GoodsId;
    }

    public void setGoodsId (String goodsId) {
        this.GoodsId.set(goodsId);
    }

    public long getNumber () {
        return Number.get();
    }

    public SimpleLongProperty numberProperty () {
        return Number;
    }

    public void setNumber (long number) {
        this.Number.set(number);
    }

    @Override
    public String toString () {
        return "Detail{" +
                "DetailId=" + DetailId +
                ", TicketId=" + TicketId +
                ", GoodsId=" + GoodsId +
                ", Number=" + Number +
                '}';
    }
}