package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI{

    JFrame gameFrame;
    Draw draw;
    static int FrameWidthHeight;
    static int offset;
    static int edge;

     // can be 0, 1 or 2
     static int state[] = new int[9];
     static int player=0;
     static int winner=0;


    static JButton btns[] = new JButton[9];
    JButton btnReset;



    public  GUI(int fWidthHeight){
        FrameWidthHeight = fWidthHeight;
        offset = FrameWidthHeight /4;
        edge = offset/2;
        initFrame(fWidthHeight);
        //initResetBtn();
        initDraw();

       //

        gameFrame.setVisible(true);

    }

    public void initFrame(int fWidthHeight){

        gameFrame = new JFrame();
        gameFrame.setSize(FrameWidthHeight,FrameWidthHeight);
        gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameFrame.setLocationRelativeTo(null);
        gameFrame.setResizable(false);
        gameFrame.setTitle("Tic Tac Toe");
    }

    public void initDraw(){
        draw = new Draw();
        draw.setBounds(0,0,FrameWidthHeight,FrameWidthHeight);
        draw.setVisible(true);
        gameFrame.add(draw);
    }

    public void initResetBtn(){
        for(int i = 0; i < btns.length; i++){
            btns[i] = new JButton();
            btns[i].setVisible(true);
            btns[i].addActionListener(new PlayerActionHandler());
        }
        btnReset = new JButton("Reset");
        btnReset.setBounds(0,0,0,0);
        btnReset.setVisible(true);
        btnReset.setBackground(Color.BLACK);
        btnReset.setForeground(Color.WHITE);
        btnReset.setFocusPainted(false);
        btnReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GameActionHandler.reset();
            }
        });
    }


}
