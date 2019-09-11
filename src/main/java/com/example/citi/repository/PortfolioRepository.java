package com.example.citi.repository;

import com.example.citi.model.Portfolio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PortfolioRepository extends JpaRepository<Portfolio, Long> {

    /**
     * 根据portfolioName获取portfolio
     * @param portfolioName portfolioName
     * @return Portfolio
     */
    Portfolio findByPortfolioName(String portfolioName);
}
