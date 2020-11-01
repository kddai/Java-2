package pack;

class Person {
	String Name;
	String ID;
	String Sex;
	String Course;
	String Class;
	
	protected Person(){
		
	}
	
	public Person(String name, String iD, String sex, String course, String class1) {
		this.Name = name;
		ID = iD;
		Sex = sex;
		Course = course;
		Class = class1;
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
}

	


		
	
		
		
