package ru.vsu.cs.kalashyan;

import javax.swing.*;

import java.awt.*;

public class Main {

    public static void main(String[] args) {

        GUI mainWindow = new GUI();
        mainWindow.setSize(new Dimension(1100, 600));
        mainWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainWindow.setVisible(true);
    }
}