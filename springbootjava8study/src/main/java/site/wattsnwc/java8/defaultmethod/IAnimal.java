package site.wattsnwc.java8.defaultmethod;

/**
 * TODO: 这里需要写注释
 */
public interface IAnimal {
    default void breath(){
        System.out.println("breath!");
    };
    static void run(){}
}
