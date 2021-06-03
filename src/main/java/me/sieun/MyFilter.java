package me.sieun;

import javax.servlet.*;
import java.io.IOException;

public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("Filter Init");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("Filter");
        chain.doFilter(request, response); //반드시 다음 필터로 chaining해주어야 한다.
        //맨 마지막 Filter인 경우 doFilter()가 서블릿으로 전달
    }

    @Override
    public void destroy() {
        System.out.println("Filter Destroy");
    }
}
