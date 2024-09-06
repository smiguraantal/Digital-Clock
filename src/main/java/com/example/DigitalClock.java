package com.example;

import com.example.gui.MainFrame;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 * <p>Title: DigitalClock</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2003</p>
 * <p>Company: </p>
 * @author Smigura Antal
 * @version 1.0
 */

public class DigitalClock {

    public DigitalClock() {
        MainFrame mainFrame = new MainFrame();
        mainFrame.pack();

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize = mainFrame.getSize();

        mainFrame.setLocation((screenSize.width - frameSize.width) / 2, (screenSize.height - frameSize.height) / 2);
        mainFrame.setAlwaysOnTop(true);
        mainFrame.setVisible(true);
    }

    public static void main(String[] args) {
        new DigitalClock();
    }
}