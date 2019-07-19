package singleton;

public class Singleton3 {
    private static Singleton3 singleton = null;

    //带同步锁
    public static Singleton4 getInstance(){
        return Singleton4.singleton4;
    }
    public  static class Singleton4{
        private final static Singleton4 singleton4 = new Singleton4();
    }
}
