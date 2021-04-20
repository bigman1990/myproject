package com.example.javase;

import com.example.demo.entity.UserInfo;
import org.junit.Test;

import java.util.*;

/**
 * @author 41127
 * 类加载顺序
 */
public class ClassLoaderTest {
    @Test
    public void test(){
        Son son = new Son();
    }
    static class Parent {
        private static int a=1;
        private static int b;
        private int c=init();
        static {
            b=1;
            System.out.println("1.父类静态代码块：赋值b成功");
            System.out.println("1.父类静态代码块：a的值"+a);
        }
        int init(){
            System.out.println("3.父类成员变量赋值：---> c的值"+c);
            this.c=12;
            System.out.println("3.父类成员变量赋值：---> c的值"+c);
            return c;
        }
        public Parent(){
            System.out.println("4.父类构造方式开始执行---> a:"+a+",b:"+b);
            System.out.println("4.父类构造方式开始执行---> c:"+c);
        }
    }
    static class Son extends Parent{
        private static int sa=1;
        private static int sb;
        private int sc=init();
        static {
            sb=1;
            System.out.println("2.子类静态代码块：赋值sb成功");
            System.out.println("2.子类静态代码块：sa的值"+sa);
        }
        @Override
        int init(){
            System.out.println("5.子类成员变量赋值--->：sc的值"+sc);
            this.sc=12;
            return sc;
        }
        public Son(){
            System.out.println("6.子类构造方式开始执行---> sa:"+sa+",sb:"+sb);
            System.out.println("6.子类构造方式开始执行---> sc:"+sc);
        }
    }
}
