import java.util.Collection;
import java.util.Collections;

public class ClassOne {

    public void num(int a , int b){

        System.out.println(a + " " + b);

        if(a>b){
            System.out.println("First number is greatest " + a);
        } else if (b>a) {
            System.out.println("Second number is greatest " +b);

        }
    }
    public void num(int a , int b , int c){

        System.out.println(a + " " + b + " " + c);

        if(a>b && a>c){
            System.out.println("First number is greatest " + a);
        } else if (b>a && b>c) {
            System.out.println("Second number is greatest " +b);

        }else if(c>a && c>b){
            System.out.println("Third number is greatest " + c);
        }


    }

    public void num(int a , int b  ,int c , int d){

        System.out.println(a + " " + b + " " + c + " " + d);

        if(a>b && a>c && a>d){
            System.out.println("First number is greatest " + a);
        } else if (b>a && b>c && b>d) {
            System.out.println("Second number is greatest " +b);

        }else if(c>a && c>b && c>d){
            System.out.println("Third number is greatest " + c);
        }
        else if(d>a && d>b && d>c){
            System.out.println("fourth number is greatest " + c);
        }
    }



    public static void main(String args[]){

        ClassOne c1 = new ClassOne();
        ClassOne c2 = new ClassOne();

        c1.num(10 , 5);
        c2.num(1 , 3 ,4 );
        c1.num(2 ,15 , 8, 9);



    }

}
