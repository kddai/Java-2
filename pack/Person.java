package pack;

class Person {
	String Name;
	String ID;
	String Sex;
	String Course;
	String Class;
}
class Teacher extends Person{
	Teacher(){
	}
	public String setName(String Name) {
		this.Name = Name;
		return Name;
	}
	public String setID(String ID) {
		this.ID = ID;
		return ID;
	}	
	public String setSex(String Sex) {
		this.Sex= Sex;
		return Sex;
	}
	public String setCorse(String Course) {
		this.Course = Course;
		return Course;
	}
	public void title() {
		System.out.println("ѧ������ϵͳ");
		System.out.println("______________________________________________________________");
		System.out.println("��ʦ��Ϣ");
	}
	public void show() {
		System.out.println("��ʦ����:"+Name+"��ʦ���:"+ID+"�Ա�:"+Sex+"�γ�:"+Course);
		System.out.println("______________________________________________________________");
	}
}
	
class Student extends Person{
	Student(){
	}
	public String setName(String Name) {
		this.Name = Name;
		return Name;
	}
	public String setID(String ID) {
		this.ID = ID;
		return ID;
	}
	public String setSex(String Sex) {
		this.Sex = Sex;
		return Sex;
	}
	public String setCourse(String Course) {
		this.Course = Course;
		return Course;
	}
	public String setClass(String Class) {
		this.Class = Class;
		return Class;
	}
	public void title() {
		System.out.println("ѧ����Ϣ");
	}
}

		
	
		
		
