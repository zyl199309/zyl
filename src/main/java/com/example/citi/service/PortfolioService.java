package com.example.citi.service;

import com.example.citi.model.Portfolio;

public interface PortfolioService {

    Portfolio savePortfolio(String portfolioName) throws RuntimeException;
}
