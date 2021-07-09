import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Timer;

public class DigitalWatch {

    public static void main(String[] args) {
        ClockLabel timeLable = new ClockLabel("time");

        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame f = new JFrame("digital clock");
        f.setSize(300, 150);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new GridLayout(1, 1));

        f.add(timeLable);

        f.getContentPane().setBackground(Color.white);

        f.setVisible(true);

    }

}

class ClockLabel extends JLabel implements ActionListener {

    String type;

    SimpleDateFormat sdf;

    public ClockLabel(String type) {
        this.type = type;
        setForeground(Color.red);

        switch (type)

        {

            case "time":
                sdf = new SimpleDateFormat("hh:mm:ss a");
                setFont(new Font("sans-serif", Font.PLAIN, 40));
                setHorizontalAlignment(SwingConstants.CENTER);
                break;

            default:
                sdf = new SimpleDateFormat();
                break;
        }

        Timer t = new Timer(1000, this);
        t.start();
    }

    public void actionPerformed(ActionEvent ae) {
        Date d = new Date();
        setText(sdf.format(d));
    }
}
