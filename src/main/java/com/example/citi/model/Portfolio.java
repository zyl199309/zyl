package com.example.citi.model;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "portfolio", indexes = {
        @Index(name = "idx_user_id", columnList = "user_id"),
        @Index(name = "idx_portfolio_name", columnList = "portfolio_name", unique = true)
})
@Entity
public class Portfolio implements Serializable {

    private static final long serialVersionUID = -2753868859042075889L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "user_id")
    private Long userId;
    @Column(name = "portfolio_name")
    private String portfolioName;

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

    public String getPortfolioName() {
        return portfolioName;
    }

    public void setPortfolioName(String portfolioName) {
        this.portfolioName = portfolioName;
    }

    @Override
    public String toString() {
        return "Portfolio{" +
                "id=" + id +
                ", userId=" + userId +
                ", portfolioName='" + portfolioName + '\'' +
                '}';
    }
}
