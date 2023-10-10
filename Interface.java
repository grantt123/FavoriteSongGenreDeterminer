import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Interface extends JFrame {
    private Font mainFont = new Font ("Tahoma", Font.BOLD, 18);
    JTextField name;
    JLabel welcome;
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
        setSize(720,300);
        setMinimumSize(new Dimension(300,200));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
}