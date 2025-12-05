package com.sai.passwordgui;

import java.awt.*;
import java.awt.event.*;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.*;

public class PasswordGUI extends JFrame {

    private JTextField lengthField;
    private JTextField countField;
    private JCheckBox lowerBox, upperBox, numberBox, symbolBox;
    private JTextArea outputArea;
    private JProgressBar strengthBar;

    private JTextField userPasswordField;
    private JProgressBar userStrengthBar;

    private PasswordGenerator generator = new PasswordGenerator();
    private PasswordStrengthChecker strengthChecker = new PasswordStrengthChecker();

    public PasswordGUI() {
        setTitle("Sai Password Pro");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        // ------------------ Password Generator ------------------
        add(new JLabel("Password Length:"));
        lengthField = new JTextField(10);
        add(lengthField);

        add(new JLabel("How Many Passwords?"));
        countField = new JTextField(10);
        add(countField);

        lowerBox = new JCheckBox("Lowercase");
        upperBox = new JCheckBox("Uppercase");
        numberBox = new JCheckBox("Numbers");
        symbolBox = new JCheckBox("Symbols");

        add(lowerBox);
        add(upperBox);
        add(numberBox);
        add(symbolBox);

        // Strength meter for generated passwords
        strengthBar = new JProgressBar(0, 100);
        strengthBar.setPreferredSize(new Dimension(500, 20));
        strengthBar.setStringPainted(true);
        add(strengthBar);

        JButton genBtn = new JButton("Generate Passwords");
        genBtn.addActionListener(new GenerateAction());
        add(genBtn);

        JButton saveBtn = new JButton("Save to File");
        saveBtn.addActionListener(new SaveAction());
        add(saveBtn);

        outputArea = new JTextArea(12, 50);
        outputArea.setEditable(false);
        add(new JScrollPane(outputArea));

        // ------------------ User Password Strength Checker ------------------
        add(new JSeparator(SwingConstants.HORIZONTAL));
        add(new JLabel("Check Your Own Password:"));

        userPasswordField = new JTextField(20);
        add(userPasswordField);

        JButton checkBtn = new JButton("Check Strength");
        add(checkBtn);

        userStrengthBar = new JProgressBar(0, 100);
        userStrengthBar.setPreferredSize(new Dimension(500, 20));
        userStrengthBar.setStringPainted(true);
        add(userStrengthBar);

        checkBtn.addActionListener(e -> checkUserPassword());

        setVisible(true);
    }

    // ------------------ Generated Passwords ------------------
    class GenerateAction implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                int length = Integer.parseInt(lengthField.getText());
                int count = Integer.parseInt(countField.getText());

                boolean lower = lowerBox.isSelected();
                boolean upper = upperBox.isSelected();
                boolean num = numberBox.isSelected();
                boolean sym = symbolBox.isSelected();

                outputArea.setText("");

                for (int i = 1; i <= count; i++) {
                    String p = generator.generate(lower, upper, num, sym, length);
                    outputArea.append(i + ". " + p + "\n");
                }

                updateStrength(length, lower, upper, num, sym);

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Invalid Input");
            }
        }
    }

    private void updateStrength(int len, boolean l, boolean u, boolean n, boolean s) {
        int score = 0;
        if (len >= 8) score += 20;
        if (l) score += 20;
        if (u) score += 20;
        if (n) score += 20;
        if (s) score += 20;

        strengthBar.setValue(score);

        // Color change logic
        if (score < 40) {
            strengthBar.setString("Weak");
            strengthBar.setForeground(Color.RED);
        } else if (score < 70) {
            strengthBar.setString("Medium");
            strengthBar.setForeground(new Color(255, 140, 0));
        } else if (score < 90) {
            strengthBar.setString("Strong");
            strengthBar.setForeground(new Color(30, 144, 255));
        } else {
            strengthBar.setString("Ultra Strong");
            strengthBar.setForeground(new Color(0, 180, 0));
        }
    }

    class SaveAction implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                FileWriter fw = new FileWriter("passwords.txt");
                fw.write(outputArea.getText());
                fw.close();
                JOptionPane.showMessageDialog(null, "Saved to passwords.txt");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Error Saving File");
            }
        }
    }

    // ------------------ User Password Strength ------------------
    private void checkUserPassword() {
        String pwd = userPasswordField.getText().trim();
        if (pwd.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter a password to check!");
            return;
        }

        String strength = strengthChecker.checkStrength(pwd);
        int score = 0;
        switch (strength) {
            case "Weak": score = 25; break;
            case "Moderate": score = 50; break;
            case "Strong": score = 75; break;
            case "Very Strong 💪": score = 100; break;
        }

        userStrengthBar.setValue(score);
        userStrengthBar.setString(strength);

        if (score < 40) userStrengthBar.setForeground(Color.RED);
        else if (score < 70) userStrengthBar.setForeground(new Color(255,140,0));
        else if (score < 90) userStrengthBar.setForeground(new Color(30,144,255));
        else userStrengthBar.setForeground(new Color(0,180,0));
    }
}
