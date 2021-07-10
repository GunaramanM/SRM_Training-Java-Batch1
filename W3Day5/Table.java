import javax.swing.*; 

public class Table {    
    JFrame f;    
    Table(){    
    f=new JFrame();    
    String name[][]={ {"Guna","001","AMD","No"},    
                       {"Derec","002","Intel","yes"}};    
    String column[]={"Name","id","Preference","Availability"};         
    JTable jt=new JTable(name,column);    
    jt.setBounds(30,40,200,300);          
    JScrollPane sp=new JScrollPane(jt);    
    f.add(sp);          
    f.setSize(300,400);    
    f.setVisible(true);    
}     
public static void main(String[] args) {    
    new Table();    
}    
}
