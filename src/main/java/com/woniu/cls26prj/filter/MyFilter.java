package com.woniu.cls26prj.filter;

import org.springframework.core.annotation.Order;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter(urlPatterns = "/*")
public class MyFilter implements Filter {
    public MyFilter(){
        System.out.println("init");
    }
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("into my super filter");
        HttpServletRequest r = (HttpServletRequest)servletRequest;
        MyRequest my = new MyRequest(r);
        filterChain.doFilter(my, servletResponse);
    }

    @Override
    public void destroy() {

    }
}
