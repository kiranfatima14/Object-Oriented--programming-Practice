import java.net.PortUnreachableException;

public class NurseInfo extends HospitalData{

    public void setNurseData(String nurseName , String nurseTime , String nurseHosName){

        name = nurseName ;
        timing = nurseTime;
        hospital = nurseHosName;

    }

    public void printNurseData(){
        System.out.println("Nurse data");
        System.out.println("Name :" + name +  "  Time: " + timing + "  Hospital name: " + hospital);
    }

}
