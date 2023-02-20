public class Main {

    public static void main(String[] args) {

        Person person = new Person();
        System.out.println(person);

        Student student = new Student("Victor","str.Bogdan Voievod","Informatica aplicata",1,13000);
        System.out.println("Student : " + student);

        Staff staff = new Staff("Mircea","str.Studentilor","UTM",8000);
        System.out.println("Staff: " + staff);


    }

}