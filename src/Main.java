public class Main {

    public static void main(String[] args) {


        Student student = new Student();

        student.setName("Victor");
        student.setAddress("str. Bogdan Voievod");
        student.setProgram("Informatica aplicata");
        student.setYear(1);
        student.setFee(13000);

        System.out.println("Student : " + student.getName() + ", " + student.getAddress() + ", " + student.getProgram() + ", " + student.getYear() + ", " + student.getFee());

        Staff staff = new Staff("Mircea","str.Studentilor","UTM",8000);
        staff.setName("Mircea");
        staff.setAddress("str. Studentilor");
        staff.setSchool("UTM");
        staff.setPay(8000);
        System.out.println("Staff: " + staff.getName() + ", " + staff.getAddress() + ", " + staff.getSchool() + ", " + staff.getPay());


    }

}