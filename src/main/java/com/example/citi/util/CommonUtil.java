package com.example.citi.util;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class CommonUtil {

    /**
     * 设置userId
     * @param userId
     */
    public static void setId(Long userId) {
        ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
        HttpServletRequest request = requestAttributes.getRequest();
        HttpSession session = request.getSession();
        session.setAttribute("userId", userId);
    }

    /**
     * 获取userId
     * @return Long
     * @throws RuntimeException 运行时异常
     */
    public static Long getId() throws RuntimeException{
        ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
        HttpServletRequest request = requestAttributes.getRequest();
        HttpSession session = request.getSession();
        Long userId = (Long)session.getAttribute("userId");
        if (userId == null) {
            throw new RuntimeException("未登录");
        }
        return userId;
    }
}
