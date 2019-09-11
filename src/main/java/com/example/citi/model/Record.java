package com.example.citi.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "record", indexes = {
        @Index(name = "idx_user_id", columnList = "user_id"),
        @Index(name = "idx_fund_id", columnList = "fund_id")
})
@Entity
public class Record implements Serializable {
    private static final long serialVersionUID = 3018549455424545636L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "user_id")
    private Long userId;
    @Column(name = "fund_id")
    private Long fundId;
    @Column(name = "portfolio_name")
    private String portfolioName;
    @Column(name = "count")
    private int count;
    @Column(name = "price")
    private BigDecimal price;
    @Column(name = "date", columnDefinition = "date")
    private Date date;
    @Column(name = "status")
    private int status;  //1表示正在进行，2表示购买结束
    @Column(name = "type")
    private int type; //1表示买入，2表示卖出

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getFundId() {
        return fundId;
    }

    public void setFundId(Long fundId) {
        this.fundId = fundId;
    }

    public String getPortfolioName() {
        return portfolioName;
    }

    public void setPortfolioName(String portfolioName) {
        this.portfolioName = portfolioName;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Record{" +
                "id=" + id +
                ", userId=" + userId +
                ", fundId=" + fundId +
                ", portfolioName='" + portfolioName + '\'' +
                ", count=" + count +
                ", price=" + price +
                ", date=" + date +
                ", status=" + status +
                ", type=" + type +
                '}';
    }
}
