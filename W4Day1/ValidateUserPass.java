import java.util.regex.*;
  
class ValidUserPass {
    public static boolean isValidUsername(String name)
    {
  
        String regex = "^[A-Za-z]\\w{5,29}$";
		
        Pattern p = Pattern.compile(regex);
        if (name == null) {
            return false;
        }
        Matcher m = p.matcher(name);
        return m.matches();
    }
	public static boolean isValidPassword(String name)
    {
  
        String regex = "^(?=.*[0-9])"
					+ "(?=.*[a-z])(?=.*[A-Z])"
					+ "(?=.*[@#$%^&+=])"
					+ "(?=\\S+$).{8,20}$";
		
        Pattern p = Pattern.compile(regex);
        if (name == null) {
            return false;
        }
        Matcher m = p.matcher(name);
        return m.matches();
    }
    public static void main(String[] args)
    {
  
        String str1 = "Gun";
        System.out.println(isValidUsername(str1));
		String str2 = "Guna@12345";
        System.out.println(isValidPassword(str2));
    }
}