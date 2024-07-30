// package Design Patterns.Singleton Pattern;


class Singelton {

    static Singelton s = null;
    private Singelton() {}

    public static Singelton getsingelton() {
        if(s == null) s = new Singelton();
        
        return s;
    }
}
  

class Pattern {
    void print() {
        Singelton s = Singelton.getsingelton();
        System.out.println("Pattern class " + s);
    }
}
    
public class SingletonPattern {
    public static void main(String[] args) {
        Singelton s1 = Singelton.getsingelton();
        Singelton s2 = Singelton.getsingelton();
        if(s1 == s2) {
            System.out.println("Main class " + s1 + " " + s2);
            Pattern p = new Pattern();    
            p.print();
        }
    }
}

