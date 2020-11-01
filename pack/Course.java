package pack;

public class Course {
	  public String CourseName;
	  public String CourseID; 
	  public String Location;
	  public String Time;
	  public String CCourse;
	  public String getCourseName() {
		  return CourseName;
	  }
	  public void setCourseName(String CourseName) {
		  this.CourseName = CourseName;
	  }
	  public String getCourseID() {
		  return CourseID;
	  }
	  public void setCourseID(String CourseID) {
		  this.CourseID = CourseID;
	  }
	  public String getLocation() {
		  return  Location;
	  }
	  public void setLocation(String Location) {
		  this.Location = Location;
	  }	
	  public  String getTime() {
		  return Time;
	  }
	  public void setTime(String Time) {
		  this.Time = Time;
	  }
	  public  String getCCourse() {
		  return  CCourse;
	  }
	  public void setCCourse(String CCourse) {
		  this.Time = CCourse;
	  }
	  
	public void title() {
		System.out.println("课程");
	}
}
class Select extends Course{
	Select(){}
	public String getCourseName() {
		return CourseName;
	}
	public void setCourseName(String CourseName) {
		this.CourseName = CourseName;
		}
	public String getCourseID() {
		return  CourseID;
	}
	public void setCourseID(String CourseID) {
		this.CourseID = CourseID;
		}
	public  String  getLocation() {
		return   Location;
	}
	public void setCLocation(String Location) {
		this.Location = Location;
	}
	public String getTime() {
		return Time;
	}
	public void setTime(String Time) {
		this.Time = Time;
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
	public String getDropname() {
		return Dropname;
		}
	public void setDropname(String Dropname) {
	this.Dropname = Dropname;
	}
	public String getDropclass() {
		return Dropclass;
		}
	public void setDropclass(String Dropclass) {
		this.Dropclass = Dropclass;
		}
	public String getDropcourse() {
		return Dropcourse;
		}
	public void setDropcourse(String Dropcourse) {
		this.Dropcourse = Dropcourse;
		}
	public String getDropcourseid() {
		return Dropcourseid;
		}
	public void setDropcourseid(String Dropcourseid) {
		this.Dropcourseid = Dropcourseid;
		}
	public String getDropsex() {
		return Dropsex;
		}
	public void setDropsex(String Dropsex) {
			this.Dropsex = Dropsex;
			}
	public String getDroptime() {
		return Droptime;
		}
	public void setDroptime(String Droptime) {
		this.Droptime = Droptime;
		}
	public void title(){
		System.out.println("退课信息");
	}
}



