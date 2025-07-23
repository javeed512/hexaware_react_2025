package stream.api;

public class Employee {
	
	
	private  int eid;
	private String ename;
	private  double salary;
	private String job;
	public Employee(int eid, String ename, double salary, String job) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
		this.job = job;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + ", job=" + job + "]";
	}
	
	
	
	

}
