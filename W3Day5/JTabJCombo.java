import javax.swing.*;  
public class JTabJCombo {  
JFrame f;  
JTabJCombo(){  
    f=new JFrame();  
    JTextArea ta=new JTextArea(200,200);  
    JPanel p1=new JPanel();  
    p1.add(ta);  
    JPanel p2=new JPanel();  
      
    JTabbedPane tp=new JTabbedPane();  
    tp.setBounds(50,50,200,200);  
    tp.add("Home",p1);  
    tp.add("Student Details",p2);  

    String Student[]={"Guna","Amal","Gokul"};        
    JComboBox cb=new JComboBox(Student);    
    cb.setBounds(30, 30,70,20);   
     
    f.add(tp);  
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true);  
    
    f.add(cb);        
    f.setLayout(null);    
    f.setSize(400,500);    
    f.setVisible(true); 
}  
public static void main(String[] args) {  
    new JTabJCombo();  
}} 
