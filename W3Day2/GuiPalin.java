import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class GuiPalin implements ActionListener {

    TextField t1;

    Label ques, answer;

    Button b1;

    Frame f;

    GuiPalin() {
        f = new Frame(" Check for Palindrome");

        ques = new Label("Enter String:");

        ques.setBackground(Color.cyan);

        ques.setBounds(5, 50, 150, 30);

        f.add(ques);

        t1 = new TextField();

        t1.setBounds(180, 50, 150, 30);

        f.add(t1);

        answer = new Label("");

        answer.setBounds(90, 140, 200, 30);

        f.add(answer);

        b1 = new Button("CHECK");

        b1.setBounds(90, 200, 180, 30);

        f.add(b1);

        b1.addActionListener(this);

        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

        f.setLayout(null);
        f.setSize(500, 400);
        f.setVisible(true);

    }

    public static void main(String[] args) {
        GuiPalin pa = new GuiPalin();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String r = t1.getText();
        if (e.getSource().equals(b1))
            if (isPalindrome(r))
                answer.setText(t1.getText()+" is palindrome");
            else
                answer.setText(t1.getText()+" is NOT a palindrome");

    }

    boolean isPalindrome(String s) {
        int i, j;
        for (i = 0, j = s.length() - 1; i < j; i++, j--)
            if (s.charAt(i) != s.charAt(j))
                return false;
        return true;
    }

}
