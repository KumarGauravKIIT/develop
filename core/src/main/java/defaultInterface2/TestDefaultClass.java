package defaultInterface2;

public class TestDefaultClass extends AClass implements MyInter1, MyInter2 {

//    public void method(){
//        MyInter1.super.method();
//        MyInter2.super.method();
//    }

    public static void main(String[] args) {
        TestDefaultClass obj = new TestDefaultClass();
        obj.method();
    }
}
