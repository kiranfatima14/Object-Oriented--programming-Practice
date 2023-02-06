public class MainClass {
    public static void main(String args[]){


       DoctorInfo di = new DoctorInfo();

       di.setDoctorData("abc" , "10:00" , "xyz");
       di.printDoc();

        NurseInfo ni = new NurseInfo();

        ni.setNurseData("rr" , "7:00" , "xyz");
        ni.printNurseData();

        StaffInfo si = new StaffInfo();

        si.setStaffData("www" , " 5:00" , "abc");
        si.printStaffData();

        PatientInfo pi = new PatientInfo();

        pi.setPatientData("xxx" , 26 , "abc " , "xyz");
        pi.printData();

    }
}
