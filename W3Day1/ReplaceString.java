class Neww{
public static void find(String str, String A, String B){
    System.out.println("String is::"+str);
		 
    String replaced=str.replace(A, B);
    
    System.out.println("String Replaced::"+replaced);
}

}

public class ReplaceString {
    public static void main(String[] args) {
        Neww st=new Neww();
		String original= "Welcome world";
		String replace="world";
		String ReplaceWith="Guna";
		st.find(original,replace,ReplaceWith);
    }
}
