public class PatientInfo extends HospitalData{

    public void setPatientData(String patientName , int patient_age , String docName , String hosName ){

        name = patientName;
        age = patient_age;
        doctorName = docName;
        hospital = hosName;

    }

    public void printData(){
        System.out.println("Patient data");
        System.out.println("Name : " +name + " Age : " + age + " Doctor Name : " + doctorName + " Hospital : " + hospital);
    }

}
