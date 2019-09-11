package com.example.citi.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Table(name = "portfolio_item", indexes = {
        @Index(name = "idx_portfolio_id", columnList = "portfolio_id"),
        @Index(name = "idx_fund_id", columnList = "fund_id")
})
@Entity
public class PortfolioItem implements Serializable {
    private static final long serialVersionUID = 2176655425324057222L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "portfolio_id")
    private Long portfolioId;
    @Column(name = "fund_id")
    private Long fundId;
    @Column(name = "count")
    private int count;
    @Column(name = "price")
    private BigDecimal price;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(Long portfolioId) {
        this.portfolioId = portfolioId;
    }

    public Long getFundId() {
        return fundId;
    }

    public void setFundId(Long fundId) {
        this.fundId = fundId;
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

    @Override
    public String toString() {
        return "PortfolioItem{" +
                "id=" + id +
                ", portfolioId=" + portfolioId +
                ", foudId=" + fundId +
                ", count=" + count +
                ", price=" + price +
                '}';
    }
}
