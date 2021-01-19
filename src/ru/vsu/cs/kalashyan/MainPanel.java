package ru.vsu.cs.kalashyan;

import javax.swing.*;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

public class MainPanel extends JPanel {
    private JTextField arrayField;
    private JButton accept;
    private JLabel result;
    private SumOfElements logic;

    public MainPanel() {
        this.setLayout(null);
        arrayField = new JTextField();
        accept = new JButton("Result");
        result = new JLabel();
        logic = new SumOfElements();
        arrayField.setBounds(50, 20, 300, 30);
        accept.setBounds(50, 50, 100, 30);
        result.setBounds(50, 80, 100, 30);
        this.add(arrayField);
        this.add(accept);
        this.add(result);
        accept.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String values = arrayField.getText().replaceAll(" ", "");
                String[] strValues = values.split(",");
                int[] intValues = new int[strValues.length];
                for (int i = 0; i < strValues.length; i++) {
                    try {
                        intValues[i] = Integer.parseInt(strValues[i]);
                    } catch (NumberFormatException nfe) {
                    }
                }
                result.setText(String.valueOf(logic.parityPosition(intValues)));
            }
        });
    }
}