package pack;

class Teach extends Person{
	public Teach(){
		}
	public Teach(String name,String iD,String sex,String course,String class1) {
		super(name,iD,sex,course,class1);
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