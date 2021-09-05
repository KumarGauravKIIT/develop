package defaultInterface1;

public interface MyInter2 extends ParentInter{
        default void method(){
            System.out.println("MyInter2 method");
        }
}
