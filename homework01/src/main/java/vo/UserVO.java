package vo;

public class UserVO {
	//field
	private String name;
	private String sex;
	private String year;
	private String month;
	private String day;
	private String education;
	private String job;
	private boolean active;
	
	
	
	//setter
	public void setName(String name) {this.name = name;}
	public void setSex(String sex) {this.sex = sex;}
	public void setYear(String year) {this.year = year;}
	public void setMonth(String month) {this.month = month;}
	public void setDay(String day) {this.day = day;}
	public void setEducation(String education) {this.education = education;}
	public void setJob(String job) {this.job = job;	}
	public void setActive(boolean active) {this.active = active;}
	//getter
	public String getName() {return name;}
	public String getSex() {return sex;}
	public String getYear() {return year;}
	public String getMonth() {return month;}
	public String getDay() {return day;}
	public String getEducation() {return education;}
	public String getJob() {return job;}
	public boolean isActive() {return active;}
	
	//method 
	@Override
	public String toString() {
		return "UserVO [name=" + name + ", sex=" + sex + ", year=" + year + ", month=" + month + ", day=" + day
				+ ", education=" + education + ", job=" + job + "]";
	}
}
