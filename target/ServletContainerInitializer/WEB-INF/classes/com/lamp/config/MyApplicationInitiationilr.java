package com.lamp.config;


import com.lamp.filter.filter;
import com.lamp.listener.listener;
import com.lamp.service.UserService;
import com.lamp.servlet.MyServlet;

import javax.servlet.*;
import javax.servlet.annotation.HandlesTypes;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;
@HandlesTypes(value = {UserService.class})
public class MyApplicationInitiationilr implements ServletContainerInitializer {
    public void onStartup(Set<Class<?>> set, ServletContext servletContext) throws ServletException {
//        System.out.println("对象servletContext="+servletContext);
        System.out.println("触发onStart方法");
        Iterator<Class<?>> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
//        System.out.println("关闭onStart方法");


        /*
        *
        * 将容器中装入  servlet
        *
        * */

        ServletRegistration.Dynamic servlet = servletContext.addServlet("servlet", MyServlet.class);
        System.out.println(servlet);
        servlet.addMapping("/hello");
        /**
         *
         * 将容器中装入 listener
         */
        servletContext.addListener(listener.class);

        /**
         *
         * 过滤器
         */

        FilterRegistration.Dynamic filter = servletContext.addFilter("filter", filter.class);
        filter.addMappingForUrlPatterns(EnumSet.of(DispatcherType.REQUEST),true,"/*");


    }
}
