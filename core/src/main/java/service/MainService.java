package service;

public class MainService {

    public static void main(String[] args) {
        ServiceInterface a = new AService();
        ServiceInterface b = new BService();
        /*ServiceAbstract a1 = new AService();
        ServiceAbstract b1 = new BService();*/
        AService a2 = new AService();
        BService b2 = new BService();

        System.out.println("---------START--------------");
        System.out.println("\n\n------a.m1()-----");
        a.m1();
        System.out.println("\n\n------b.m1()-----");
        b.m1();
        /*System.out.println("\n\n------a1.m1()-----");
        a1.m1();
        System.out.println("\n\n------a1.m2()-----");
        a1.m2();
        System.out.println("\n\n------b1.m1()-----");
        b1.m1();
        System.out.println("\n\n------b1.m2()-----");
        b1.m2();
        System.out.println("\n\n------a1.m2(\"Two\", \"Param\")-----");
        a1.m2("Two", "Param");
        System.out.println("\n\n------b1.m2(\"Total\", \"Three\", \"Param\")-----");
        b1.m2("Total", "Three", "Param");
        System.out.println("---------END--------------");*/

        System.out.println("\n\n------a2.m1()-----");
        a2.m1();
        System.out.println("\n\n------b2.m1()-----");
        b2.m1();

    }
}
