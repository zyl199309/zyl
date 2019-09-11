package com.example.citi.controller;

import com.example.citi.model.Portfolio;
import com.example.citi.service.PortfolioService;
import com.example.citi.util.ResultUtil;
import com.example.citi.vo.ResultVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/portfolio")
@RestController
@Api("投资组合相关的API")
public class PortfolioController {

    @Autowired
    PortfolioService portfolioService;

    @PostMapping("/portfolio")
    @ApiOperation("增加一个投资组合")
    public ResultVO addPortfolio(@RequestParam(value = "name") String name) {
        try {
            Portfolio portfolio = portfolioService.savePortfolio(name);
            return ResultUtil.setResultVO("1", "succeed", portfolio);
        } catch (Exception e) {
            return ResultUtil.setResultVO("0", "failed", null);
        }
    }
}
