package bank02;

public class MemberBean {
	private String name, id, pass, ssn;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return id;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getPass() {
		return pass;
	}
	public void SetSsn(String ssn) {
		this.ssn = ssn;
	}
	public String  getSsn() {
		return ssn;
	}
	@Override
	public String toString() {
		
		return String.format("이름:%s\n"
				+ "아이디:%s\n"
				+ "비밀번호:%s\n"
				+ "주민번호%s",name,id,pass,ssn);
	}
	
}
