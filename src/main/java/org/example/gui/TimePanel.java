package org.example.gui;

import org.example.section.Number;

import javax.swing.JPanel;
import java.awt.GridLayout;

/**
 * <p>Title: DigitalClock</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2003</p>
 * <p>Company: </p>
 * @author Smigura Antal
 * @version 1.0
 */

public class TimePanel extends JPanel implements Constants {

    private NumberPanel decimalPanel;
    private NumberPanel singlePanel;

    public TimePanel(int time) {
        this.setLayout(new GridLayout());
        add(decimalPanel = new NumberPanel());
        add(singlePanel = new NumberPanel());
        setTime(time);
    }

    public void setTime(int time) {
        if (time < 10) {
            decimalPanel.setNumber(Number.ZERO);
            singlePanel.setNumber(generateNumber(time));
        } else {
            decimalPanel.setNumber(generateNumber(((int) (time / 10)) % 10));
            singlePanel.setNumber(generateNumber(time % 10));
        }
    }

    private Number generateNumber(int value) {
        Number number = null;
        switch (value) {
            case 0:
                number = Number.ZERO;
                break;
            case 1:
                number = Number.ONE;
                break;
            case 2:
                number = Number.TWO;
                break;
            case 3:
                number = Number.THREE;
                break;
            case 4:
                number = Number.FOUR;
                break;
            case 5:
                number = Number.FIVE;
                break;
            case 6:
                number = Number.SIX;
                break;
            case 7:
                number = Number.SEVEN;
                break;
            case 8:
                number = Number.EIGHT;
                break;
            case 9:
                number = Number.NINE;
                break;
        }
        return number;
    }
}