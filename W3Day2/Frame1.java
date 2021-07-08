import javax.swing.*;
public class Frame1
{
    JFrame frame;

    Frame1()
    {
        frame=new JFrame("Simple Frame");

        JButton button = new JButton("Click Me");

        button.setBounds(200, 150, 90, 50);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(button);

        frame.setSize(500, 600);

        frame.setLayout(null);
        frame.setVisible(true);
    }

    public static void main(String[] args)
    {
        new Frame1();
    }
}
