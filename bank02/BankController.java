package bank02;

import javax.swing.JOptionPane;

public class BankController {
	public static void main(String[] args) {
		MemberBean member = null;
		MemberBean[] members = null;
		MemberService service = new MemberServiceImpl();
		
		while(true) {
			
			
			switch(JOptionPane.showInputDialog("[은행서비스]\n"
					+ "0.정지\n"
					+ "1.회원가입\n"
					+ "2.회원리스트\n"
					+ "3.로그인\n"
					+ "4.회원찾기\n"
					+ "5.전체회원수\n"
					+ "6.회원 정보 변경")) {
			
			case "0" : JOptionPane.showMessageDialog(null,"정지");return;
			case "1" : 
				
				
						service.join(JOptionPane.showInputDialog("이름을 입력하세요"), 
						JOptionPane.showInputDialog("아이디를 입력하세요"), 
						JOptionPane.showInputDialog("비밀번호를 입력하세요"), 
						JOptionPane.showInputDialog("주민등록번호를 입력하세요"));
			break;
			case "2" :
				members = service.list();
				JOptionPane.showMessageDialog(null,members);
				break;
			case "3" :
				
				
				
				if(service.login(JOptionPane.showInputDialog("아이디를 입력해주세요"),
						JOptionPane.showInputDialog("비밀번호를 입력해주세요"))) {
					JOptionPane.showMessageDialog(null,"로그인성공");
				}else {
					JOptionPane.showMessageDialog(null,"로그인실패");
				}
				break;	
			case "4" :
				
				
				JOptionPane.showMessageDialog(null,service.find(JOptionPane.showInputDialog("아이디를 입력해주세요")));break;
			
			case "5" :
				
				
				
				service.change(JOptionPane.showInputDialog("아이디를 입력하세요"),
						JOptionPane.showInputDialog("현재 비밀번호를 입력하세요"), JOptionPane.showInputDialog("비밀번호를 입력하세요"));
			}
		}
	}
}
