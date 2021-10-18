package Modules;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow extends JFrame {

    public MyWindow() {
        //tempText String;

        setTitle("Chat View");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(700, 300, 400, 360);
        setLayout(null);

        JTextArea textArea = new JTextArea("Your messages:");
        textArea.setEditable(false);
        JScrollPane scrollText = new JScrollPane(textArea);
        scrollText.setBounds(5, 5, 376, 270);
        add(scrollText);

        JButton button = new JButton("Send");
        button.setBounds(260, 280, 120, 32);
        add(button);

        JTextField textField = new JTextField();
        textField.setBounds(5, 280, 250, 32);
        add(textField);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (!textField.getText().isEmpty()) {
                    textArea.append("\n");
                    textArea.append("- > " + textField.getText());
                    textField.setText("");
                }
            }
        });

        textField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (!textField.getText().isEmpty()) {
                    textArea.append("\n");
                    textArea.append("- > " + textField.getText());
                    textField.setText("");
                }

            }
        });
        setVisible(true);
    }
}