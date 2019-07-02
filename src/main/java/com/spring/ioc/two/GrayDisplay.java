package com.spring.ioc.two;

public class GrayDisplay implements Idisplay {

    private int width = 1024;
    private int height = 786;

    /**
     * 显示画面
     */
    @Override
    public void show() {
        System.out.println(width + "====显示器工作：显示黑白画面====" + height);
    }
}
