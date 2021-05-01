public class InstructorManager extends UserManager {
    @Override
    public void add(User user) {
        System.out.println("Eğitmen eklendi.");

    }

    public void login(User user){
        System.out.println(user.getFirstName() + " " + user.getLastName() +
                " tarafından giriş yapıldı. ");
    }
    public void userInfo (Instructor instructor) {
        System.out.println("Eğitmen Bilgileri:\n ID: " + instructor.getId() +
                "\n Eğitmen No: " + instructor.getInstructorNumber()+
                "\n Adı Soyadı: " + instructor.getFirstName() + " " + instructor.getLastName() +
                "\n İletişim Bilgileri :\n E-mail: " + instructor.getEmail() +
                "\n Adres: " + instructor.getAddress() + "\n Telefon Numarası: " + instructor.getMobileNumber()+
                "\n Eğitmenin Kursları: " + instructor.getCourseName());


    }




}

