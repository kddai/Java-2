# Java-2
#### Java课程项目2 学生管理系统   
计G202 代旭涵 2020322111
# 阅读程序

## 实验目的  
1.初步了解分析系统需求，从学生选课角度了解系统中的实体及其关系，学会定义类中的属性以及方法；   
2.掌握面向对象的类设计方法（属性、方法）；   
3.掌握类的继承用法，通过构造方法实例化对象；   
4.学会使用super()，用于实例化子类；   
5.掌握使用Object根类的toString（）方法,应用在相关对象的信息输出中。  

## 实验要求 
### 业务要求   
1.说明：学校有“人员”，分为“教师”和“学生”，教师教授“课程”，学生选择“课程”；   
2.从简化系统考虑，每名教师仅教授一门课程，每门课程的授课教师也仅有一位，每名学生选仅选一门课程。   
### 实验要求   
1.编写上述实体类以及测试主类（注意类之间继承关系的适用）;   
2.在测试主类中，实例化多个类实体，模拟学生选课操作、打印课程信息（信息包括：编号、课程名称、上课地点、时间、授课教师 等）；模拟学生退课操作，再打印课程信息;    
3.编写实验报告   
（要求有实验目的、要求、过程、流程图、核心代码、注释、系统运行截图、编程感想等，分章节罗列，不能在实验报告中粘帖大段代码）   

## 核心代码
#### Course类
1.首先将课程的各个类型定义创建出来。   
```
public class Course {   
	  public String CourseName;   
	  public String CourseID;    
	  public String Location;   
	  public String Time;   
	  public String CCourse; 
    public String setCourseName(String CourseName) {   
		  this.CourseName = CourseName;   
		  return CourseName;   
	  }   
```
2.将Select继承为Course的子类。   
```
class Select extends Course{}   
```
3.创建退课类别创建定义退课信息。      
```
class Drop{   
	String Dropname;   
	String Dropclass;   
	String Dropsex;   
	String Dropcourse;   
	String Dropcourseid;   
	String Droptime;   
	public String setDropname(String Dropname) {   
	this.Dropname = Dropname;   
	return Dropname;   
	}   
  ```   
  #### Person类
  1.Student类和Teacher类继承父类Person类。   
 ```
 class Student extends Person{}   
 class Teacher extends Person{}   
 ``` 
 #### Test类   
 1.创建Teacher1,stu1,course1,sel1,drop1声明教师学生信息以及学生选课退课信息。   
```
Teacher teacher1 = new Teacher();   
		teacher1.title();   
		teacher1.setName("陈征");   
		teacher1.setID("180260201");   
    Student stu1 = new Student();   
		stu1.title();   
		stu1.setName("吴迪一");   
		stu1.setID("180260226");   
    Course course1 = new Course();   
		course1.title();   
		course1.setCourseID("001");   
		course1.setLocation("教103")   
    Select sel = new Select();   
		sel.setCCourse("高等数学");   
		sel.setCourseID("001");   
    Drop dropstu1 = new Drop();   
		dropstu1.setDropname("李世鹏");   
		dropstu1.setDropclass("18网2");   
 ```
## 实验结果
 ```
 教师信息   
教师姓名:陈征教师编号:180260201性别:Male课程:数学   
学生信息   
课程   
课程号:001   
课程:数学地点:教103时间:周一8.00-10.00教师:陈征   
____________________________________________    
选择课程   
序号:001   
学生姓名:吴迪一性别:Male班级:18网2选择课程:高等数学时间:周一8.00-10.00讲课教师:陈征   
____________________________________________________________________________   
退课信息   
序号:002   
学生姓名:李世鹏性别:Female班级:18网2时间:周二13.00-15.00退课名称:计算机组成原理   
_________________________________________________________________________    
```
## 实验感想
通过学生管理系统了解了子类继承父类的用法。一开始拿到实验的时候不知道如何下手，查资料翻书问同学慢慢摸索了解用java语言编写学生管理系统。知道做学生管理系统首先先干些什么。从一个点做好开始逐渐
向学生管理系统的各个部分做好。也认识了自我可能对于java掌握的不是那么的好，一些语句命令还是有些疑惑掌握的不是很好。以后老师上课 听讲，掌握好知识点，给自己一个突破。   
    
  






