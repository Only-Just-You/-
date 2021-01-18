package org.example.game;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestMyButton {
    public static void main(String[] args) {
        MyButton btn1 = new MyButton("你来抓我呀！");
        MyButton btn2 = new MyButton("你来抓我呀！");

        btn1.setFriend(btn2);
        btn2.setFriend(btn1);
        btn1.setVisible(false);

        Frame f = new Frame("捉迷藏游戏");
        f.add(btn1,"North");
        f.add(btn2,"South");

        f.setSize(300,300);
        f.setVisible(true);
        f.setLocation(350,350);
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });

        btn1.setVisible(false);
    }
}
