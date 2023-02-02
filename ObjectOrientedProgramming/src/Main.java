public class Main {
    public static void main(String[] args) {

        MyFirstClass cl = new MyFirstClass();

        System.out.println("value of a is " + cl.a);
        System.out.println("value of b is " + cl.b);

        cl.add();

        cl.setA(20);

        cl.add();

        cl.setB(10);

        cl.subtract();
    }
}