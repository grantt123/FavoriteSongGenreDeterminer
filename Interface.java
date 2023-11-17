//*********************************************
// Title: Favorite Song Genre Determiner
// Name: Grant Tran
// Course Section: CMIS202-ONL1 (Seidel) Fall 2023
// File: Interface.java
// Description: This file is the interface where the user can input their name
//*********************************************

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import javax.swing.*;

public class Interface extends JFrame {
    private Font mainFont = new Font ("Tahoma", Font.BOLD, 18);
    JTextField name;
    JLabel welcome;
    Deque<String> nameDeque = new ArrayDeque<>();
    LinkedList<String> linkedList = new LinkedList<>();
    HashTable hashTable = new HashTable();

    public void create() {

        JLabel userInput = new JLabel("Enter Your Name!");
        userInput.setFont(mainFont);
        userInput.setForeground(Color.WHITE);

        name = new JTextField();
        name.setFont(mainFont);

        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(4, 1, 5, 5));
        formPanel.setOpaque(false);
        formPanel.add(userInput);
        formPanel.add(name);

        welcome = new JLabel();
        welcome.setFont(mainFont);
        welcome.setForeground(Color.WHITE);

        JButton button = new JButton("Enter");
        button.setFont(mainFont);
        button.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                String input = name.getText();
                welcome.setText("Hi " + input + ", nice to meet you! Fill out the information in the console below.");
                nameDeque.add(input);
                linkedList.add(input);
                hashTable.put(input);
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1, 2, 5, 5));
        buttonPanel.setOpaque(false);
        buttonPanel.add(button);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(new Color(120, 120, 120));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        mainPanel.add(formPanel, BorderLayout.NORTH);
        mainPanel.add(welcome, BorderLayout.CENTER);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);
        add(mainPanel);

        setTitle("Welcome!");
        setSize(800,300);
        setMinimumSize(new Dimension(300,200));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
