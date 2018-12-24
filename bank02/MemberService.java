package bank02;

public interface MemberService {

	public void join(String name,String id,String pass,String ssn) ;
	
	public MemberBean[] list();
	
	public MemberBean find(String id);
	
	public boolean login(String id,String pass);

	public void change(String id,String pass,String change);
}
