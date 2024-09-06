package com.example.gui;

import com.example.section.Number;

import com.example.section.Center;
import com.example.section.North;
import com.example.section.NorthEast;
import com.example.section.NorthWest;
import com.example.section.South;
import com.example.section.SouthEast;
import com.example.section.SouthWest;

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

public class NumberPanel extends JPanel implements Constants {

    private Number number;

    public NumberPanel() {
        setBackground(BACKGROUND_COLOR);
        setPreferredSize(new Dimension(NUMBER_WIDTH * UNIT, NUMBER_HEIGHT * UNIT));
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(BACKGROUND_COLOR);
        g.fillRect(0, 0, NUMBER_WIDTH * UNIT, NUMBER_HEIGHT * UNIT);

        if (number.isNorth())
            drawPoints(g, North.lightPoints, LIGHT_COLOR);
        else
            drawPoints(g, North.darkPoints, DARK_COLOR);

        if (number.isCenter())
            drawPoints(g, Center.lightPoints, LIGHT_COLOR);
        else
            drawPoints(g, Center.darkPoints, DARK_COLOR);

        if (number.isSouth())
            drawPoints(g, South.lightPoints, LIGHT_COLOR);
        else
            drawPoints(g, South.darkPoints, DARK_COLOR);

        if (number.isNorthWest())
            drawPoints(g, NorthWest.lightPoints, LIGHT_COLOR);
        else
            drawPoints(g, NorthWest.darkPoints, DARK_COLOR);

        if (number.isNorthEast())
            drawPoints(g, NorthEast.lightPoints, LIGHT_COLOR);
        else
            drawPoints(g, NorthEast.darkPoints, DARK_COLOR);

        if (number.isSouthWest())
            drawPoints(g, SouthWest.lightPoints, LIGHT_COLOR);
        else
            drawPoints(g, SouthWest.darkPoints, DARK_COLOR);

        if (number.isSouthEast())
            drawPoints(g, SouthEast.lightPoints, LIGHT_COLOR);
        else
            drawPoints(g, SouthEast.darkPoints, DARK_COLOR);
    }

    private void drawPoints(Graphics g, List<Point> points, Color color) {
        g.setColor(color);
        for (Point point : points) {
            g.fillRect(point.x * UNIT, point.y * UNIT, UNIT, UNIT);
        }
    }

    public void setNumber(Number number) {
        this.number = number;
        repaint();
    }
}