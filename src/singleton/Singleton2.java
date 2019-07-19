package singleton;

public class Singleton2 {
    private static Singleton2 singleton = null;

    //带同步锁
    public static Singleton2 getInstance(){
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null){
                    singleton = new Singleton2();
                }
            }
        }
        return singleton;
    }
}
