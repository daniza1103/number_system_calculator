package com.github.daniza1103;

import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame {

    /* создадим окно программы, а также поля для ввода данных, обозначим кнопки и создадим переменную, которая
     * в последующей работе кода будет обрабатываться в качестве введенного значения */

    JTextArea display = new JTextArea();
    JPanel buttonPanel = new JPanel(new GridLayout(4, 3));
    JButton button2 = new JButton("2-ая СС");
    JButton button8 = new JButton("8-ая СС");
    JButton button16 = new JButton("16-ая СС");
    JButton buttonBack = new JButton("Удалить");
    int value;

    Calculator() {

        /* обозначим название программы и размер окна */

        super("Калькулятор систем счисления");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setBounds(300, 300, 400, 200);

        /* привяжем кнопкам определенные действия при помощи следующих методов */

        //2-ая СС
        button2.addActionListener(e -> {
            value = Integer.parseInt(display.getText());
            display.setText(Integer.toBinaryString(value));
        });

        //8-ая СС
        button8.addActionListener(e -> {
            value = Integer.parseInt(display.getText());
            display.setText(Integer.toOctalString(value));
        });

        //16-ая СС
        button16.addActionListener(e -> {
            value = Integer.parseInt(display.getText());
            display.setText(Integer.toHexString(value));
        });

        //для удаления данных
        buttonBack.addActionListener(e -> {
            String temp = display.getText();
            display.setText(temp.substring(0, temp.length() - 1));
        });

        /*добавим кнопки в окно */

        setLayout(new BorderLayout());
        add(display, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);
        buttonPanel.add(button2);
        buttonPanel.add(button8);
        buttonPanel.add(button16);
        buttonPanel.add(buttonBack);
        setVisible(true);
    }
}