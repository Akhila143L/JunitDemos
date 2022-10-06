package MavenProject.JunitDemos;
public class Employ {
	private int Empno;
	private String name;
	private Gender gender;
	private String dept;
	private String desig;
	private double basic;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	public double getBasic() {
		return basic;
	}
	public void setBasic(double basic) {
		this.basic = basic;
	}
	public void setEmpno(int empno) {
		Empno = empno;
	}
	public Employ() {
		super();
		
	}
	public Employ(int empno, String name, Gender gender, String dept, String desig, double basic) {
		super();
		Empno = empno;
		this.name = name;
		this.gender = gender;
		this.dept = dept;
		this.desig = desig;
		this.basic = basic;
	}
	public int getEmpno(){
		return Empno;
	}

}
