package org.example.game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;

public class MyButton extends JButton {
    private MyButton friend;

    public MyButton(String name) throws HeadlessException {
        super(name);
        enableEvents(AWTEvent.MOUSE_MOTION_EVENT_MASK);
    }

    @Override
    protected void processMouseMotionEvent(MouseEvent e){
        setVisible(false);
        friend.setVisible(true);
    }

    public void setFriend(MyButton friend) {
        this.friend = friend;
    }
}
