import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

class Study {

	  
	  public void School() {
	    System.out.println("School");
	  }

	  private void College() {
	    System.out.println("College");
	  }
	}

public	class Reflex {
	  public static void main(String[] args) {
	    try {

            Study s = new Study();
	      Class obj = s.getClass();
	      Method[] methods = obj.getDeclaredMethods();
	      for (Method m : methods) {
	        System.out.println("Method Name: " + m.getName());
	        int modifier = m.getModifiers();
	        System.out.println("Modifier: " + Modifier.toString(modifier));
	        System.out.println("Return Type: " + m.getReturnType());
	        System.out.println(" ");
	      }
	    }
	    catch (Exception e) {
	      e.printStackTrace();
	    }
	  }
	}