package pack;

public class Test {

	public static void main(String[] args) {
		Teach teacher1 = new Teach();
		teacher1.title();
		teacher1.setName("����");
		teacher1.setID("180260201");
		teacher1.setSex("Male");
		teacher1.setCourse("��ѧ");
		teacher1.show();
		Stud stu1 = new Stud();
		stu1.title();
		stu1.setName("���һ");
		stu1.setID("180260226");
		stu1.setSex("Male");
		stu1.setCourse("�ߵ���ѧ");
		stu1.setClass("18��2");
		Course course1 = new Course();
		course1.title();
		course1.setCourseID("001");
		course1.setLocation("��103");
		course1.setTime("��һ8.00-10.00");
		System.out.println("�γ̺�:"+course1.CourseID+"\n"+
				"�γ�:"+teacher1.Course+
				"�ص�:"+course1.Location+
				"ʱ��:"+course1.Time+
				"��ʦ:"+teacher1.Name);
		System.out.println("______________________________________________________________");
		Select sel = new Select();
		sel.setCCourse("�ߵ���ѧ");
		sel.setCourseID("001");
		sel.title();
		System.out.println ("���:"+sel.CourseID+"\n"+
				"ѧ������:"+stu1.Name+
				"�Ա�:"+stu1.Sex+
				"�༶:"+stu1.Class+
				"ѡ��γ�:"+stu1.Course+
				"ʱ��:"+course1.Time+
				"���ν�ʦ:"+teacher1.Name);
		System.out.println("______________________________________________________________");
		Drop dropstu1 = new Drop();
		dropstu1.setDropname("������");
		dropstu1.setDropclass("18��2");
		dropstu1.setDropsex("Female");
		dropstu1.setDroptime("�ܶ�13.00-15.00");
		dropstu1.setDropcourse("��������ԭ��");
		dropstu1.setDropcourseid("002");
		dropstu1.title();
		System.out.println("���:"+dropstu1.Dropcourseid+"\n"+
						   "ѧ������:"+dropstu1.Dropname+
						   "�Ա�:"+dropstu1.Dropsex+
						   "�༶:"+dropstu1.Dropclass+
						   "ʱ��:"+dropstu1.Droptime+
						   "�˿�����:"+dropstu1.Dropcourse);
		System.out.println("______________________________________________________________");
	}

}
