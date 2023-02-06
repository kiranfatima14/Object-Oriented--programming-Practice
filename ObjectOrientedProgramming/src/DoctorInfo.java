public class DoctorInfo extends HospitalData {

    boolean isDegree = true ;
    public void setDoctorData( String docName , String docTime , String docHosName){

        name = docName;
        timing = docTime;
        hospital = docHosName;

    }
    public  void printDoc(){
        System.out.println("Doctor data");
        System.out.println( "MBBS :" + " "+ isDegree + "   Name :" + name +  "  Time: " + timing + "  Hospital name: "  + hospital);
    }
}
