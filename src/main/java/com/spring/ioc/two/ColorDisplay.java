package com.spring.ioc.two;

/**
 * 显示彩色器
 */
public class ColorDisplay implements Idisplay {

    private int width = 1024;
    private int height = 786;

    /**
     * 显示画面
     */
    @Override
    public void show() {
        System.out.println(width + "====显示器工作：显示彩色画面====" + height);
    }
}
