package pack;

public class Test {

	public static void main(String[] args) {
		Teacher teacher1 = new Teacher();
		teacher1.title();
		teacher1.setName("陈征");
		teacher1.setID("180260201");
		teacher1.setSex("Male");
		teacher1.setCorse("数学");
		teacher1.show();
		Student stu1 = new Student();
		stu1.title();
		stu1.setName("吴迪一");
		stu1.setID("180260226");
		stu1.setSex("Male");
		stu1.setCourse("高等数学");
		stu1.setClass("18网2");
		Course course1 = new Course();
		course1.title();
		course1.setCourseID("001");
		course1.setLocation("教103");
		course1.setTime("周一8.00-10.00");
		System.out.println("课程号:"+course1.CourseID+"\n"+
				"课程:"+teacher1.Course+
				"地点:"+course1.Location+
				"时间:"+course1.Time+
				"教师:"+teacher1.Name);
		System.out.println("______________________________________");
		Select sel = new Select();
		sel.setCCourse("高等数学");
		sel.setCourseID("001");
		sel.title();
		System.out.println ("序号:"+sel.CourseID+"\n"+
				"学生姓名:"+stu1.Name+
				"性别:"+stu1.Sex+
				"班级:"+stu1.Class+
				"选择课程:"+stu1.Course+
				"时间:"+course1.Time+
				"讲课教师:"+teacher1.Name);
		System.out.println("______________________________________________________________");
		Drop dropstu1 = new Drop();
		dropstu1.setDropname("李世鹏");
		dropstu1.setDropclass("18网2");
		dropstu1.setDropsex("Female");
		dropstu1.setDroptime("周二13.00-15.00");
		dropstu1.setDropcourse("计算机组成原理");
		dropstu1.setDropcourseid("002");
		dropstu1.title();
		System.out.println("序号:"+dropstu1.Dropcourseid+"\n"+
						   "学生姓名:"+dropstu1.Dropname+
						   "性别:"+dropstu1.Dropsex+
						   "班级:"+dropstu1.Dropclass+
						   "时间:"+dropstu1.Droptime+
						   "退课名称:"+dropstu1.Dropcourse);
		System.out.println("____________________________________________________________");
	}

}
