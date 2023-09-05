package array;
import java.util.ArrayList;

public class StudentArrayList {

	public static void main(String[] args) {
		ArrayList<Student> people=new ArrayList<Student>();
		people.add(new Student(1001,"James"));
		people.add(new Student(1002, "Tomas"));
		people.add(new Student(1003, "Edward"));
		for(Student student:people) {
			student.showStudentInfo();
	}
	}}


