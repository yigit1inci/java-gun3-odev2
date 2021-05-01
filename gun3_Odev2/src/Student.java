public class Student extends User {
   private int studentNumber;

   public Student(int id, String firstName, String lastName, String email, String address,
                  String password, String courseName, String mobileNumber, int studentNumber, double coursePercent) {
      super(id, firstName, lastName, email, address, password, courseName, mobileNumber);
      this.studentNumber = studentNumber;
      this.coursePercent = coursePercent;
   }

   private double coursePercent;



   public int getStudentNumber() {
      return studentNumber;
   }

   public void setStudentNumber(int studentNumber) {
      this.studentNumber = studentNumber;
   }

   public double getCoursePercent() {
      return coursePercent;
   }

   public void setCoursePercent(double coursePercent) {
      this.coursePercent = coursePercent;
   }


}
