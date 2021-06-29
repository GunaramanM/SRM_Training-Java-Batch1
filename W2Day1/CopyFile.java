import java.io.*;  
import java.util.*;  
class CopyFile {  
 public static void main(String arg[]) throws Exception {  
  Scanner sc = new Scanner(System.in);  
  System.out.print("Provide source file name :");  
  String file1 = sc.next();  
  System.out.print("Provide destination file name :");  
  String file2 = sc.next();  
  FileReader A = new FileReader(file1);  
  FileWriter B = new FileWriter(file2, true);  
  int c;

  while ((c = A.read()) != -1) {  
   B.write(c);  
  }  
 
  A.close();  
  B.close();  
 }  
}