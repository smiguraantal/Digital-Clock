package com.example.gui;

/**
 * <p>Title: DigitalClock</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2003</p>
 * <p>Company: </p>
 * @author Smigura Antal
 * @version 1.0
 */

class TimeManager extends Thread implements Runnable {

    private MainFrame mainFrame;

    public TimeManager(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
    }

    public void run() {
        try {
            while (true) {
                Thread.sleep(1000);
                mainFrame.refreshTime();
            }
        }
        catch (InterruptedException ex) {
        }
    }
}