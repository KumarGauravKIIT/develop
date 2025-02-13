package service;

public class AService extends ServiceAbstract {

    @Override
    public void m1() {

        System.out.println("m1 from AService");
        m2();
    }

   /* private void m2() {
        System.out.println("m2 from AService");
    }*/



}
