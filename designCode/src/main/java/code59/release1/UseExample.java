package code59.release1;

public class UseExample {
    public static void main(String[] args) {
        AClass aCallBack = new AClass();
        aCallBack.process(new ICallBack() {
            @Override
            public void callBackMethod() {
                System.out.println("call back me");
            }
        });
    }
}
