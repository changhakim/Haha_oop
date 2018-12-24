package bank01;

import java.nio.channels.ShutdownChannelGroupException;

import javax.swing.JOptionPane;

public class BankController {
	public static void main(String[] args) {
		MemberBean member = null;
		MemberService service = new MemberServiceImpl();
		MemberBean[] members = null;

		while(true) {
			switch(JOptionPane.showInputDialog("[은행시스템]\n"
					+ "0.정지"
					+ "1.회원가입\n"
					+ "2.회원리스트\n"
					+ "3.회원정보찾기\n"
					+ "4.로그인\n"
					+ "5.총가입자수\n"
					+ "6.정보수정\n"
					+ "7.회원탈퇴")) {

					case "0" : JOptionPane.showMessageDialog(null,"정지");return;
					case "1" :
						service.join(JOptionPane.showInputDialog("이름을 입력하세요"),
								JOptionPane.showInputDialog("아이디를 입력하세요"),
								JOptionPane.showInputDialog("비밀번호를 입력하세요"), 
								JOptionPane.showInputDialog("주민번호를 입력하세요"));
						break;
					case "2" :	
						members = service.list();
						JOptionPane.showMessageDialog(null,members);
						break;
					case "3" :

						JOptionPane.showMessageDialog(null,service.find(JOptionPane.showInputDialog("아이디를 입력하세요")));
						break;
					case "4" :



						if(service.login(JOptionPane.showInputDialog("아이디를 입력하세요"),
								JOptionPane.showInputDialog("비밀번호를 입력하세요"))) {
							JOptionPane.showMessageDialog(null,"로그인 성공");
						}else {
							JOptionPane.showMessageDialog(null,"로그인 실패");
						}
						break;
					case "5" :JOptionPane.showMessageDialog(null,service.count());	

					case "6" :
						
						service.change(JOptionPane.showInputDialog("현재아이디를 입력하세요"),
								JOptionPane.showInputDialog("현재비밀번호를 입력하세요"),
								JOptionPane.showInputDialog("바꾸실 비밀번호를 입력하세요"));
						break;
					case "7" :	


			}
		}
	}
}
