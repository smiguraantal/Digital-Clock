package com.example.gui;


import com.example.section.Colon;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.util.List;

/**
 * <p>Title: DigitalClock</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2003</p>
 * <p>Company: </p>
 * @author Smigura Antal
 * @version 1.0
 */

public class ColonPanel extends JPanel implements Constants {

    public ColonPanel() {
        setPreferredSize(new Dimension(5 * UNIT, NUMBER_HEIGHT * UNIT));
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(BACKGROUND_COLOR);
        g.fillRect(0, 0, NUMBER_WIDTH * UNIT, NUMBER_HEIGHT * UNIT);

        drawPoints(g, Colon.lightPoints, LIGHT_COLOR);
    }

    private void drawPoints(Graphics g, List<Point> points, Color color) {
        g.setColor(color);
        for (Point point : points) {
            g.fillRect(point.x * UNIT, point.y * UNIT, UNIT, UNIT);
        }
    }
}