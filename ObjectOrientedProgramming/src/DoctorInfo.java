public class DoctorInfo extends HospitalData {
    String name ;
    String specialization ;

    public void info(String n , String s){

        name = n ;
        specialization = s;

        System.out.println("Name :" + n);
        System.out.println("Specialization :" + s);
    }

}
