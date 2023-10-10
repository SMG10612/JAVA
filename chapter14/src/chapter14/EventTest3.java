/*
 * 독립한 이벤트 처리 클래스를 이용한 이벤트 처리.
 * */

package chapter14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//이벤트 처리 클래스
//이벤트를 처리할 클래스 생성
	//1. 처리할 이벤트 종류 결정 - ActionEvent
	//2. 이벤트에 적합한 이벤트 리스너 인터페이스를 사용하여 클래스 작성 - ActionListener
	//3. 이벤트를 받아들일 컴포넌트에 리스너 등록
class EventClass implements ActionListener {
	JLabel jl;
	
	public EventClass(JLabel jl) {
		this.jl = jl;
	}
	
	//4. 리스너 인터페이스에 선언된 메소드를 오버라이딩하여 이벤트 처리 루틴 작성.
	@Override
	public void actionPerformed(ActionEvent e) { //소스->오버라이딩->확인
		jl.setText(e.getActionCommand());
	}
}

// GUI 클래스 - 버튼 2개의 레이블 1개
class Event3 extends JFrame{
	// JLabel 객체를 속성으로 등록
	JLabel jl;
		
	// JButton 객체를 속성으로 2개 등록
	JButton jb1,jb2;
		
	//컨테이너 생성
	public Event3() {
			Container ct = getContentPane();
			//배치 관리자 생성, (FlowLayout())
			ct.setLayout(new FlowLayout());
			//버튼 생성
			jb1 = new JButton("안녕하세요.");
			jb2 = new JButton("행복한 하루입니다.");
			//레이블 생성
			jl = new JLabel("버튼을 눌러 주세요.");
			
			//컨테이너에 버튼과 레이블 등록
			ct.add(jb1);
			ct.add(jb2);
			ct.add(jl);
			
			//3. 이벤트를 받아들일 컴포넌트에 리스너 등록
			jb1.addActionListener(new EventClass(jl));
			jb2.addActionListener(new EventClass(jl));
			
		//화면에 보여주기
			setTitle("이벤트 테스트3");
			setSize(300,200);
			//윈도우 창 종료시 프로세스 닫기
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			//화면에 출력
			setVisible(true);
	}
}

//메인 클래스
public class EventTest3 {

	public static void main(String[] args) {
		new Event3();
	}

}
