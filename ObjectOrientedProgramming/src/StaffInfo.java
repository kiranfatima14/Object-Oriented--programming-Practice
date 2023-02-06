public class StaffInfo extends HospitalData {

    public void setStaffData(String staffBoyName , String staffTime , String staffHosName){

        name = staffBoyName;
        timing = staffTime;
        hospital = staffHosName;

    }

    public void printStaffData(){
        System.out.println("Staff data");
      System.out.println("Name :" + name +  "  Time: " + timing + "  Hospital name: "  + hospital);
    }
}
