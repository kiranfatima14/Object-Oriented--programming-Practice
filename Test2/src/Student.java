import javax.security.auth.Subject;

public class Student {

    String name ;
    int rollNo ;
    String subject ;
   double marks ;

    public void setStudentData(String n , int rN , String sb , double m){
        name = n ;
         rollNo = rN;
      subject = sb;
         marks = m;

    }
    public void printStudentData(){
        System.out.println("Name " + name );
        System.out.println("RollNo " + rollNo );
        System.out.println("Subject " + subject );
        System.out.println("CGPA " + marks );

    }


    public static void main(String[] args) {

        Student st = new Student();
        st.setStudentData("ali" , 10 , "Bs(cs)" , 3.26);
        st.printStudentData();
        System.out.println("--------------------------------------------");
        st.setStudentData("tt" ,  11 , "BBA" ,3.15 );
        st.printStudentData();
        System.out.println("--------------------------------------------");
        st.setStudentData("ss" ,  15 , "Bs(cs)" ,2.06 );
        st.printStudentData();

    }




}
