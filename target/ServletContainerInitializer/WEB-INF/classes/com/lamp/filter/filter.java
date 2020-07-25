package com.lamp.filter;

import javax.servlet.*;
import java.io.IOException;

public class filter  implements   Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        System.out.println("过滤器 ----开始");
        chain.doFilter(request,response);
        System.out.println("过滤器 ----结束");

    }

    @Override
    public void destroy() {

    }
}
