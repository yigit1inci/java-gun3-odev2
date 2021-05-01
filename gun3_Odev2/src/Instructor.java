public class Instructor extends User {
    private String instructorNumber;

    public Instructor(int id, String firstName, String lastName, String email, String address,
                      String password, String courseName, String mobileNumber, String instructorNumber) {
        super(id, firstName, lastName, email, address, password, courseName, mobileNumber);
        this.instructorNumber = instructorNumber;
    }

    public String getInstructorNumber() {
        return instructorNumber;
    }

    public void setInstructorNumber(String instructorNumber) {
        this.instructorNumber = instructorNumber;
    }


}

