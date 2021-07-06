import java.io.*;
import java.util.*;
public class VowWords {
    public static void main(String[] args) {
    
        int wo=0;
        int count = 0;
        Scanner myFile = null;
        try{
            Scanner file = new Scanner(new File("SRM_Training_Week3/W3Day1/NewFile.txt"));
            myFile = file;
            
        } catch(FileNotFoundException e)
        {
            System.out.println("File doesnot exist");
        }
        String myFile1 = myFile.nextLine();
        for (int i=0 ; i<myFile1.length(); i++){
            char chr = myFile1.charAt(i);
            if(chr == 'a'|| chr == 'e'|| chr == 'i' ||chr == 'o' ||chr == 'u'||chr == 'A'|| chr == 'E'|| chr == 'I' ||chr == 'O' ||chr == 'U'){
               count ++;
            }
        }
    
        while(myFile.hasNextLine())
        {
         String curline = myFile.nextLine();   
         int size = curline.length();
         boolean foundDiv = true;
         boolean foundCar = false;
         for(int j=0; j < size; j++)
         {
            
             if (foundCar && foundDiv)
             {
                 wo++;
                 foundDiv=false;
             }
         }
        }
        myFile.close();
        System.out.println("Number of words: "+wo);
        System.out.println("Number of vowels: "+count);

    }

}
