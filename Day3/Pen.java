package Day3;

abstract class Pen {
    abstract void write();
    abstract void refill();
}

class Fountainpen extends Pen {
    void write() {
        System.out.println("writing with the pen");
    }  
    void refill() {
        System.out.println("Refilling the pen");
    }
    void changeNib() {
        System.out.println("Changing the nib of the pen");
    }
}

class PenAction {
    public static void main(String[] args) {
        Fountainpen A = new Fountainpen();
        A.changeNib();
    }

}
