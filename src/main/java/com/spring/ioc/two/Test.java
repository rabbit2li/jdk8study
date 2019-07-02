package com.spring.ioc.two;

public class Test {

    public static void main(String[] args) {
        //实例化主机对象
        Computer computer = new Computer();
        //实例化草色显示器对象
        ColorDisplay display = new ColorDisplay();
        //把显示器对象注入到主机中
        computer.setIdisplay(display);
        //运行
        computer.run();

        //实例化一个黑白显示器
        GrayDisplay grayDisplay = new GrayDisplay();
        //把显示器对象注入到主机中
        computer.setIdisplay(grayDisplay);
        //运行
        computer.run();
    }
}
