package com.spring.ioc.one;

/**
 * 主机类
 */
public class Computer {

    private GrayDisplay display = new GrayDisplay();

    public void run(){
        System.out.println("===电脑启动===");
        display.show();
        System.out.println("===电脑工作中...===");
    }
}
