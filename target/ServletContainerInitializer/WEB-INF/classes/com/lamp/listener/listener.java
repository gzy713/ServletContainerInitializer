package com.lamp.listener;

import com.lamp.servlet.MyHelloServlet;
import com.lamp.servlet.MyServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRegistration;

public class listener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {

        /**
         *
         *
         *
         */


        ServletContext servletContext = sce.getServletContext();
//        System.out.println("对象servletContext=" + servletContext);
//        ServletRegistration.Dynamic servlet = servletContext.addServlet("hhhh", new MyHelloServlet());
//        servlet.addMapping("/hel");


        System.out.println("web容器已经启动");


    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

        System.out.println("web容器已经销毁");

    }
}
