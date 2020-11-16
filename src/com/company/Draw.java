package com.company;

import javax.swing.*;
import java.awt.*;

public class Draw extends JLabel {

    protected void paintComponent(Graphics g) {

        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);


        g.setColor(Color.BLACK);
        drawLines(g);
    }

    public void drawLines(Graphics g){
        g.setColor(Color.BLACK);

        // Vertikal
        g.drawLine( GUI.edge, GUI.edge, GUI.edge,GUI.FrameWidthHeight - GUI.edge);
        g.drawLine( GUI.offset + GUI.edge, GUI.edge,GUI.offset + GUI.edge,GUI.FrameWidthHeight - GUI.edge);
        g.drawLine( GUI.offset*2 + GUI.edge, GUI.edge,GUI.offset*2 + GUI.edge,GUI.FrameWidthHeight - GUI.edge);
        g.drawLine( GUI.FrameWidthHeight - GUI.edge, GUI.edge,GUI.FrameWidthHeight - GUI.edge,GUI.FrameWidthHeight - GUI.edge);


        // Horizontal
        g.drawLine(GUI.edge, GUI.edge, GUI.FrameWidthHeight - GUI.edge, GUI.edge);
        g.drawLine(GUI.edge,GUI.offset + GUI.edge,GUI.FrameWidthHeight - GUI.edge, GUI.offset + GUI.edge);
        g.drawLine(GUI.edge,GUI.offset*2 + GUI.edge,GUI.FrameWidthHeight - GUI.edge,GUI.offset*2 + GUI.edge);
        g.drawLine(GUI.edge,GUI.FrameWidthHeight - GUI.edge, GUI.FrameWidthHeight - GUI.edge ,GUI.FrameWidthHeight - GUI.edge);

    }



}
