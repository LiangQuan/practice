package singleton;

public class Singleton {
    private static Singleton singleton = null;

    //懒汉方式
    public static Singleton getInstance(){

        if (singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }
}
