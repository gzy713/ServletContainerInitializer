package com.lamp.config;


import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.HandlesTypes;
import java.util.Set;

public class MyApplicationInitiationilr implements ServletContainerInitializer {
    public void onStartup(Set<Class<?>> set, ServletContext servletContext) throws ServletException {
        System.out.println("fhasdlfhasjkdhfjkasdhjkhfdsajkfhjk");
        System.out.println("fhasdlfhasjkdhfjkasdhjkhfdsajkfhjk");
        System.out.println("fhasdlfhasjkdhfjkasdhjkhfdsajkfhjk");
        System.out.println("fhasdlfhasjkdhfjkasdhjkhfdsajkfhjk");
        System.out.println("fhasdlfhasjkdhfjkasdhjkhfdsajkfhjk");
        System.out.println("fhasdlfhasjkdhfjkasdhjkhfdsajkfhjk");
        System.out.println("fhasdlfhasjkdhfjkasdhjkhfdsajkfhjk");
        System.out.println("fhasdlfhasjkdhfjkasdhjkhfdsajkfhjk");
        System.out.println(servletContext);

    }
}
