package com.example.citi.service.impl;

import com.example.citi.model.Portfolio;
import com.example.citi.repository.PortfolioRepository;
import com.example.citi.service.PortfolioService;
import com.example.citi.util.CommonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class PortfolioServiceImpl implements PortfolioService {

    @Autowired
    PortfolioRepository portfolioRepository;

    @Override
    @Transactional
    public Portfolio savePortfolio(String portfolioName) throws RuntimeException {
        Long userId = CommonUtil.getId();
        Portfolio portfolio = new Portfolio();
        portfolio.setPortfolioName(portfolioName);
        portfolio.setUserId(userId);
        Portfolio newPortfolio = portfolioRepository.save(portfolio);
        return newPortfolio;
    }
}
