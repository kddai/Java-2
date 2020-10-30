package pack;

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
	  public String setCourseID(String CourseID) {
		  this.CourseID = CourseID;
		  return CourseID;
	  }
	  public String setLocation(String Location) {
		  this.Location = Location;
		  return Location;
	  }	
	  public String setTime(String Time) {
		  this.Time = Time;
		  return Time;
	  }
	  public String setCCourse(String CCourse) {
		  this.Time = CCourse;
		  return CCourse;
	  }
	  
	public void title() {
		System.out.println("课程");
	}
}
class Select extends Course{
	Select(){}
	public String setCourseName(String CourseName) {
		this.CourseName = CourseName;
		return CourseName;
		}
	public String setCourseID(String CourseID) {
		this.CourseID = CourseID;
		return CourseID;
		}
	public String setCLocation(String Location) {
		this.Location = Location;
		return Location;
	}
	public String setCTime(String Time) {
		this.Time = Time;
		return Time;
	}
	public void title() {
		System.out.println("选择课程");
	}
}
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
	public String setDropclass(String Dropclass) {
		this.Dropclass = Dropclass;
		return Dropclass;
		}
	public String setDropcourse(String Dropcourse) {
		this.Dropcourse = Dropcourse;
		return Dropcourse;
		}
	public String setDropcourseid(String Dropcourseid) {
		this.Dropcourseid = Dropcourseid;
		return Dropcourseid;
		}
	public String setDropsex(String Dropsex) {
			this.Dropsex = Dropsex;
			return Dropsex;
			}
	public String setDroptime(String Droptime) {
		this.Droptime = Droptime;
		return Droptime;
		}
	public void title(){
		System.out.println("退课信息");
	}
}



