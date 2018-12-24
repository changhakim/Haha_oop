package bank01;

public interface MemberService {

	//회원가입
	public void join(String name,String id,String pass,String ssn);
	//회원리스트
	public MemberBean[] list();
	//회원찾기
	public MemberBean find(String id);
	//로그인
	public boolean login(String id,String pass);
	//회원수
	public int count();
	//비밀번호변경
	public void change(String id,String pass,String change);
	//정보삭제
	public void delete(String id,String pass);
	
}
