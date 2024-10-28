public class Student {
    //private instance variavles
    int studentId;
    String fName;
    String lName;

    //Explicit constructor
    public Student(int studentId, String fName, String lName){
        this.studentId = studentId;
        this.fName = fName;
        this.lName = lName;
    }

    public String toString(){
        return studentId + " " + fName + " " + lName;
    }

}
