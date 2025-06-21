package mvc;

public class Main {
    public static void main(String[] args) {

        Student student = new Student("Kavi", "S101", "A");


        StudentView view = new StudentView();


        StudentController controller = new StudentController(student, view);


        controller.updateView();


        controller.setStudentName("Priya");
        controller.setStudentGrade("B+");


        controller.updateView();
    }
}
