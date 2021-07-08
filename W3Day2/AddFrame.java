import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;

class AddFrame extends Frame implements ActionListener {
    Button b1, b2;
    Label l1, l2, l3;
    TextField tf1, tf2, tf3;

    AddFrame() {
        super("Add Frame");
        b1 = new Button("Add");
        b2 = new Button("Clear");
        b1.addActionListener(this);
        b2.addActionListener(this);
        l1 = new Label("First num");
        l2 = new Label("Second num");
        l3 = new Label("result");
        tf1 = new TextField();
        tf2 = new TextField();
        tf3 = new TextField();
        setLayout(new GridLayout(4, 2));
        add(l1);
        add(tf1);
        add(l2);
        add(tf2);
        add(l3);
        add(tf3);
        add(b1);
        add(b2);
        
    }

    public void actionPerformed(ActionEvent ae) {
        String s = ae.getActionCommand();
        if (s.equals("Add")) {
            int n1 = Integer.parseInt(tf1.getText());
            int n2 = Integer.parseInt(tf2.getText());
            tf3.setText(Integer.toString(n1 + n2));
        } else {
            tf1.setText("");
            tf2.setText("");
            tf3.setText("");
        }
    }

    public static void main(String[] args) {
        AddFrame af = new AddFrame();
        af.setSize(200, 200);
        af.setVisible(true);
    }

}
