public class UserManager {
    public void add(User user) {
        System.out.println("Kullanıcı eklendi.");
    }

    public void userInfo(User user) {
        System.out.println("Kullanıcı Bilgileri:\n ID: " + user.getId() +
                "\n Adı Soyadı:" + user.getFirstName() + " " + user.getLastName() +
                "\n İletişim Bilgileri :\n E-mail: " + user.getEmail() +
                "\n Adres: " + user.getAddress() + "\n Telefon Numarası: " + user.getMobileNumber());
    }

    public void login(User user) {
        System.out.println( user.getFirstName()+" "+ user.getLastName()+ " tarafından giriş yapıldı.");

    }



}
