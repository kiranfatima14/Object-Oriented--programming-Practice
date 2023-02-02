public class MyFirstClass {

    int a = 10 ;
    int b = 20 ;

    public void setA(int valA){
        a = valA;
        System.out.println("value of A is " + valA);
    }
    public void setB(int valB){
        b = valB;
        System.out.println("value of B is " + valB );
    }

    public void add(){
        System.out.println(a+b);
    }

    public void subtract(){

        System.out.println(a-b);
    }


}
