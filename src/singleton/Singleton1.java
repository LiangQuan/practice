package singleton;

public class Singleton1 {
    private static Singleton1 singleton = new Singleton1();

    //懒汉方式
    public static Singleton1 getInstance(){
        return singleton;
    }
}
