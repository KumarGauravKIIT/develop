package defaultInterface1;

public interface MyInter1 extends ParentInter{
    default void method(){
        System.out.println("MyInter1 method");
    }
}
