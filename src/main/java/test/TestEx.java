package test;


public class TestEx {

    void readCard(int cardNo) throws Exception {
        System.out.println("readCard..");
    }

    void checkCard(int cardNo) throws RuntimeException {
        System.out.println("checkCard..");
    }

    public static void main(String[] args) {
        TestEx ex = new TestEx();
        int cardNo = 123;
//        ex.readCard(cardNo);
        ex.checkCard(cardNo);
    }
}
