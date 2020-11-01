package pack;

class Teach extends Person{
	public Teach(){
		}
	public Teach(String name,String iD,String sex,String course,String class1) {
		super(name,iD,sex,course,class1);
		}
public void title() {
	System.out.println("学生管理系统");
	System.out.println("______________________________________________________________");
	System.out.println("教师信息");
}
public void show() {
	System.out.println("教师姓名:"+Name+"教师编号:"+ID+"性别:"+Sex+"课程:"+Course);
	System.out.println("______________________________________________________________");
	}
}