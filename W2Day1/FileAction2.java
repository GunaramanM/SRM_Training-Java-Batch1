import java.io.*;
import java.util.*;
public class FileAction2 {
    public static void main(String[] args) {
        int li=0;
        int wo=0;
        int ch=0;
        int count = 0;
        Scanner myFile = null;
        try{
            Scanner file = new Scanner(new File("SRM_Training_Week2/W2Day1/File1.txt"));
            myFile = file;
            
        } catch(FileNotFoundException e)
        {
            System.out.println("File doesnot exist");
        }
        String myFile1 = myFile.nextLine();
        for (int i=0 ; i<myFile1.length(); i++){
            char chr = myFile1.charAt(i);
            if(chr == 'a'|| chr == 'e'|| chr == 'i' ||chr == 'o' ||chr == 'u'||chr == ' '||chr == 'A'|| chr == 'E'|| chr == 'I' ||chr == 'O' ||chr == 'U'){
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
             if(curline.charAt(j )== ' ')
             {
                foundDiv = true;
                foundCar = false;
             }
             else{
                 foundCar=true;
                 ch++;
             }
             if (foundCar && foundDiv)
             {
                 wo++;
                 foundDiv=false;
             }
         }
         li++;
        }
        myFile.close();
        System.out.println();
        System.out.println();
        System.out.println("Number of words: "+wo);
        System.out.println("Number of lines: "+li);
        System.out.println("Number of characters: "+ch);
        System.out.println("Number of vowels: "+count);

    }

}
