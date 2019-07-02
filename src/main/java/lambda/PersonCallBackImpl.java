package lambda;

public class PersonCallBackImpl implements PersonCallBack {
    @Override
    public void callback(Person person) {
        System.out.println("tahcuzidifu");
    }

    public static void main(String[] args) {
        PersonCallBackImpl back = new PersonCallBackImpl();
        back.testDefault();
    }
}
