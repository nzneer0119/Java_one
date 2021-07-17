package staticTest;

class Singleton {
    /*
	private Singleton() {
    }
    
    public static Singleton getInstance() {
        return new Singleton();
    }
}

public class SingletonTest {
    public static void main(String[] args) {
        //Singleton singleton = new Singleton();
    	Singleton singleton = Singleton.getInstance();
    	*/
	private static Singleton one;
    private Singleton() {
    }

    public static Singleton getInstance() {
        if(one==null) {
            one = new Singleton();
        }
        return one;
    }
}

public class SingletonTest {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1 == singleton2);
	
    }
}