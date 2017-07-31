@FunctionalInterface
public interface LambdaInterface<F,T> {
//    public int add(int... a);

    T valueOfInteger(F f);

    default void test(){
        System.out.println("Testing");
    }
}
