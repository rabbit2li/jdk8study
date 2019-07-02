package com.spring.ioc.one;

/**
 * 显示器
 */
public class GrayDisplay {

    private int width = 1024;
    private int height = 786;

    /**
     * 显示画面
     */
    public void show() {
        System.out.println(width + "===显示器工作：显示画面===" + height);
    }


}
