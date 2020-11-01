package pack;

class Stud extends Person{
	public Stud(){
	}
	public Stud(String name,String iD,String sex,String course,String class1) {
		super(name,iD,sex,course,class1);
		
	}
	public void title() {
		System.out.println("学生信息");
	}
}
