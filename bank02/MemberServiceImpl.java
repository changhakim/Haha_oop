package bank02;

public class MemberServiceImpl implements MemberService {

	private MemberBean[] members;
	private int count;
	
	public MemberServiceImpl() {
		members = new MemberBean[10];
		count = 0;
	}
	
	@Override
	public void join(String name, String id, String pass, String ssn) {
		MemberBean member = new MemberBean();
		member.setId(id);
		member.setName(name);
		member.setPass(pass);
		member.SetSsn(ssn);
		members[count] = member;
		count ++;
		
	}

	@Override
	public MemberBean[] list() {
		// TODO Auto-generated method stub
		return members;
	}

	@Override
	public MemberBean find(String id) {
		MemberBean member = new MemberBean();
		for(int i = 0;i<count;i++) {
			if(members[i].getId().equals(id)) {
				member = members[i];
				break;
			}
		}
		return member;
	}

	@Override
	public boolean login(String id, String pass) {
		boolean ok = false;
		for(int i=0;i<count;i++) {
			if(members[i].getId().equals(id) && members[i].getPass().equals(pass)) {
				ok = true;
			}
		}
		return ok;
	}

	@Override
	public void change(String id, String pass, String change) {
		// TODO Auto-generated method stub
		for(int i = 0;i<count;i++) {
			if(members[i].getId().equals(id) && members[i].getPass().equals(pass)) {
				members[i].setPass(change);
				
			}
		}
		
	}

}
