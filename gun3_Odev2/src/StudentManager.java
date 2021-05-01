public class StudentManager extends UserManager {

    public void add(Student student) {
        System.out.println("Öğrenci eklendi.");
    }

    public void login(Student student) {
        System.out.println(student.getFirstName()+" "+student.getLastName()+" tarafından giriş yapıldı.");
    }
    public void userInfo(Student student){

        System.out.println("Öğrenci Bilgileri:\n ID: " + student.getId() +
                "\n Öğrenci No: " + student.getStudentNumber()+
                "\n Adı Soyadı: " + student.getFirstName() + " " + student.getLastName() +
                "\n İletişim Bilgileri :\n E-mail: " + student.getEmail() +
                "\n Adres: " + student.getAddress() + "\n Telefon Numarası: " + student.getMobileNumber()+
                "\n Öğrencinin Kursları: " + student.getCourseName());


    }
}
