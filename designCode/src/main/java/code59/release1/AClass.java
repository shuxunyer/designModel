package code59.release1;

public class AClass {
    public void process(ICallBack iCallBack){
        System.out.println("call back before");
        iCallBack.callBackMethod();
        System.out.println("call back after");
    }
}
