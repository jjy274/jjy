
public class ClassExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student kim = new Student();
		Student lee = new Student();
		kim.name = "������";
		kim.grade = 3;
		lee.name = "�̹ο�";
		lee.grade = 2;
		System.out.println("�л��� �̸��� " + kim.name + "�̰� " + kim.grade + "�г��Դϴ�");
		System.out.println("�л��� �̸��� " + lee.name + "�̰� " + lee.grade + "�г��Դϴ�");
	}

}
class Student{
	String name;
	int grade;
}