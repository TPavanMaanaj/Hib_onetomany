import java.util.List;
import java.util.Objects;

public class Dept {
	private int deptno;
	private String deptname;
	private String loc;
	private List<Emp> empList;
	public Dept() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Dept(int deptno, String deptname, String loc, List<Emp> empList) {
		super();
		this.deptno = deptno;
		this.deptname = deptname;
		this.loc = loc;
		this.empList = empList;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public List<Emp> getEmpList() {
		return empList;
	}
	public void setEmpList(List<Emp> empList) {
		this.empList = empList;
	}
	@Override
	public int hashCode() {
		return Objects.hash(deptname, deptno, empList, loc);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dept other = (Dept) obj;
		return Objects.equals(deptname, other.deptname) && deptno == other.deptno
				&& Objects.equals(empList, other.empList) && Objects.equals(loc, other.loc);
	}
	@Override
	public String toString() {
		return "Dept [deptno=" + deptno + ", deptname=" + deptname + ", loc=" + loc + ", empList=" + empList
				+ ", getDeptno()=" + getDeptno() + ", getDeptname()=" + getDeptname() + ", getLoc()=" + getLoc()
				+ ", getEmpList()=" + getEmpList() + ", hashCode()=" + hashCode() + ", getClass()=" + getClass()
				+ ", toString()=" + super.toString() + "]";
	}

}