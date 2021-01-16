package ru.vsu.cs.kalashyan;

import javax.swing.*;

import java.awt.*;

public class GUI extends JFrame {
    public GUI() throws HeadlessException {
        MainPanel mainPanel = new MainPanel();
        mainPanel.setSize(this.getSize());
        this.add(mainPanel);
        this.pack();
    }
}