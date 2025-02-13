package service;

public abstract class ServiceAbstract implements ServiceInterface {
    @Override
    public abstract void m1();

    /*public void m1() {
        System.out.print("m1 from ServiceAbstract \n");
        System.out.println("ServiceAbstract m2() getting Called below");
        m2();
    }*/

    public void m2() {
        System.out.print("m2 from ServiceAbstract");
    }

    public void m2(String a, String b) {
        System.out.println(a+b);
    }

    public void m2(String a, String b, String c) {
        System.out.println(a+b+c);
    }
}
