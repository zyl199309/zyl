package com.example.citi.util;

import com.example.citi.vo.ResultVO;

public class ResultUtil {

    public static <T> ResultVO<T> setResultVO(String code, String msg, T result) {
        ResultVO<T> resultVO = new ResultVO(code, msg, result);
        return resultVO;
    }
}
