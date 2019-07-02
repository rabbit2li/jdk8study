package lambda;

public interface PersonCallBack {

    public void callback(Person person);

    default void testDefault(){
        System.out.println("test default...");
    }
}
