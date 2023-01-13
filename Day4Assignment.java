package com.CodeWithHarry;

import javax.swing.*;
import java.awt.*;

public class Day4Assignment {
    public static void main(String[] args) {
        JFrame frame= new JFrame();
        frame.setSize(1000,250);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.yellow);
        String str = "Stop it, Get some help!";
        JLabel text  = new JLabel(str);
        text.setFont(new Font("Arial",Font.BOLD,60 ));
        frame.add(text);
        text.setForeground(Color.red);
        frame.setVisible(true);
    }
}
