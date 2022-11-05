package com.github.daniza1103;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {

    /* �������� ���� ���������, � ����� ���� ��� ����� ������, ��������� ������ � �������� ����������, �������
     * � ����������� ������ ���� ����� �������������� � �������� ���������� �������� */

    JTextArea display = new JTextArea();
    JPanel buttonPanel = new JPanel(new GridLayout(4, 3));
    JButton button2 = new JButton("2-�� ��");
    JButton button8 = new JButton("8-�� ��");
    JButton button16 = new JButton("16-�� ��");
    JButton buttonBack = new JButton("�������");
    int value;

    Calculator() {

        /* ��������� �������� ��������� � ������ ���� */

        super("����������� ������ ���������");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setBounds(300, 300, 400, 200);

        /* �������� ������� ������������ �������� ��� ������ ��������� ������� */

        button2.addActionListener(new ActionListener() {      //2-�� ��
            @Override
            public void actionPerformed(ActionEvent e) {
                value = Integer.parseInt(display.getText());
                display.setText(Integer.toBinaryString(value));
            }
        });

        button8.addActionListener(new ActionListener() {      //8-�� ��
            @Override
            public void actionPerformed(ActionEvent e) {
                value = Integer.parseInt(display.getText());
                display.setText(Integer.toOctalString(value));
            }
        });

        button16.addActionListener(new ActionListener() {     //16-�� ��
            @Override
            public void actionPerformed(ActionEvent e) {
                value = Integer.parseInt(display.getText());
                display.setText(Integer.toHexString(value));
            }
        });

        buttonBack.addActionListener(new ActionListener() {   //��� �������� ������
            @Override
            public void actionPerformed(ActionEvent e) {
                String temp = display.getText();
                display.setText(temp.substring(0, temp.length() - 1));
            }
        });

        /*������� ������ � ���� */

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