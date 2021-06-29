import java.io.*;
import java.util.*;
public class UpperLower  {
	public static void main(String[] args) throws Exception
	{
		BufferedReader bufReader = new BufferedReader(new FileReader("SRM_Training_Week2/W2Day1/File3.txt"));
		ArrayList<String> listOfLines = new ArrayList<>();
		String line = bufReader.readLine(); 
		while (line != null) 
		{
			listOfLines.add(line); 
		line = bufReader.readLine();
		}
		bufReader.close();		
		System.out.println(listOfLines);

		File file = new File("SRM_Training_Week2/W2Day1/File1.txt");
		try(PrintWriter pw = new PrintWriter(new FileOutputStream(file))){
			listOfLines.stream().map(lines -> lines.toUpperCase()) .forEach(
					lines -> pw.println(lines)
					
					);

	           
	}
File file2 = new File("SRM_Training_Week2/W2Day1/File2.txt");
		
		
		try(PrintWriter pw = new PrintWriter(new FileOutputStream(file2))){
			listOfLines.stream().map(lines -> lines.toLowerCase()) .forEach(
					lines -> pw.println(lines)
					
					);
	           
	}
		System.out.println("Stored Files");

}
}