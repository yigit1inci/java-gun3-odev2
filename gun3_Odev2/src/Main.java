public class Main {
    public static void main(String[] args) {
        User user = new User(1, "Özgür", "Özdemir", "ozgurozdemir@gmail.com",
                "İstanbul", "12345", "Java + React", "5555555555");
        UserManager userManager = new UserManager();
        userManager.add(user);
        userManager.userInfo(user);
        userManager.login(user);
        System.out.println("---------------------------------------------------------------------------");

        Instructor instructor = new Instructor(2, "Engin", "Demiroğ", "engin@demirog.com",
                "Ankara", "78945", "C# + Angular", "5666666666", "147");
        InstructorManager instructorManager = new InstructorManager();
        instructorManager.add(instructor);
        instructorManager.userInfo(instructor);
        instructorManager.login(instructor);
        System.out.println("---------------------------------------------------------------------------");

        Student student = new Student(3, "İnci", "Yiğit", "nc.ygt.34@gmail.com",
                "İstanbul", "14785", "Java + React", "5064257137",
                111, 50);

        StudentManager studentManager = new StudentManager();
        studentManager.add(student);
        studentManager.userInfo(student);
        studentManager.login(student);

    }
}
