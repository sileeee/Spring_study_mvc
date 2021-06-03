package me.sieun;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyListener implements ServletContextListener { //servlet의 life-cycle을 감지할 수 있는 인터페이스
    @Override
    public void contextInitialized(ServletContextEvent sce) { 
        System.out.println("Context Initialized");
        sce.getServletContext().setAttribute("name", "sieun"); //object에 임의의 객체를 넣을 수 있다
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("Context Destroyed");
    }
}
