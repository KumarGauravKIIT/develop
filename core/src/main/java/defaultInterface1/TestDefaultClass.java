package defaultInterface1;

public class TestDefaultClass implements MyInter2{
//
//    public void method(){
////        MyInter1.super.method();
////        MyInter2.super.method();
//        System.out.println("Class method");
//    }

    public static void main(String[] args) {
        TestDefaultClass obj = new TestDefaultClass();
        obj.method();
    }
}
