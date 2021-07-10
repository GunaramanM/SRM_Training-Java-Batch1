
import javax.swing.JFrame;
import javax.swing.JTree;
import javax.swing.SwingUtilities;
import javax.swing.tree.DefaultMutableTreeNode;


public class JTreeP extends JFrame
{
    private JTree tree;
    public JTreeP()
    {
        DefaultMutableTreeNode school = new DefaultMutableTreeNode("School");
        DefaultMutableTreeNode studentsNode = new DefaultMutableTreeNode("Students");
        DefaultMutableTreeNode teachersNode = new DefaultMutableTreeNode("Teachers");
        DefaultMutableTreeNode officialsNode = new DefaultMutableTreeNode("Officials");
        school.add(studentsNode);
        school.add(teachersNode);
        school.add(officialsNode);
         
        tree = new JTree(school);
        add(tree);
         
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.setTitle("JTree Example");       
        this.pack();
        this.setVisible(true);
        this.setSize(300, 300);
      
    }
     
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JTreeP();
            }
        });
    }       
}