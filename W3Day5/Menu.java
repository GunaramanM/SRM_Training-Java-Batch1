
import javax.swing.*;    
import java.awt.event.*; 

public class Menu implements ActionListener{    
   JFrame f;    
   JMenuBar mb;    
   JMenu file,edit,help;    
   JMenuItem cut,copy,paste,save,saveAs;   
   JTextArea ta;

  Menu(){   
	  
        f=new JFrame();    
         cut=new JMenuItem("cut");    
         copy=new JMenuItem("copy");    
         paste=new JMenuItem("paste");  
         save=new JMenuItem("save"); 
         saveAs=new JMenuItem("saveAs"); 
        
       
         cut.addActionListener(this);    
         copy.addActionListener(this);    
         paste.addActionListener(this); 
         save.addActionListener(this);
         saveAs.addActionListener(this);
        

        
        
        mb=new JMenuBar();    
        file=new JMenu("File");    
        edit=new JMenu("Edit");    
        help=new JMenu("Help");     
        edit.add(cut);edit.add(copy);edit.add(paste); 
       file.add(save);        file.add(saveAs);
        mb.add(file);mb.add(edit);mb.add(help); 
         
     ta=new JTextArea();    
    ta.setBounds(5,5,360,320);    
    f.add(mb);f.add(ta);    
      f.setJMenuBar(mb);  
     f.setLayout(null);    
      f.setSize(400,400);    
     f.setVisible(true);    
  }
     
public void actionPerformed(ActionEvent e) {    
          
          
      }     
public static void main(String[] args) {    
    new Menu();   
    
       }    
}    
