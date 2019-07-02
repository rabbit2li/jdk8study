package com.spring.ioc.two;

/**
 * 主机类
 */
public class Computer {

    private Idisplay idisplay;

    public void run() {
        System.out.println("====电脑启动====");
        if (idisplay == null) {
            System.out.println("显示器为空");
        } else {
            idisplay.show();
        }
        System.out.println("====电脑工作中====");
    }

    public void setIdisplay(Idisplay idisplay) {
        this.idisplay = idisplay;
    }
}
