package Day6;
interface Mathematics<T extends Number> {
    
    int powerOf(T t);
}

class PowerOfThree<T extends Number> implements Mathematics<T>{
    
    public int powerOf(T i){
        
        return i.intValue()*i.intValue()*i.intValue();
    }
}

public class InterfaceGen {

    public static void main(String[] args) {
        
        PowerOfThree<Float> power = new PowerOfThree<Float>();
        System.out.println("5^3 -> "+power.powerOf(5f));
    }
}
