package chapter14;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

class JPanel2 extends JFrame{
	public JPanel2() {
		// 프레임으로부터 컨테이너 생성
		Container ct = getContentPane();
		
		// 배치 관리자 설정, BorderLayout
		ct.setLayout(new BorderLayout(5, 5));
		
		// 판넬1 객체 생성
		JPanel jp1 = new JPanel();
		
		// 판넬1에 GridLayout배치 관리자 설정
		jp1.setLayout(new GridLayout(5, 1));
		
		// 판넬1에 라디오 버튼 추가
		jp1.add(new JRadioButton("자바"));
		jp1.add(new JRadioButton("C언어"));
		jp1.add(new JRadioButton("자바 스크립트"));
		jp1.add(new JRadioButton("JSP"));
		jp1.add(new JRadioButton("C#"));
		
		// 판넬2 객체 생성
		JPanel jp2 = new JPanel();
				
		// 판넬2에 GridLayout배치 관리자 설정
		jp2.setLayout(new GridLayout(5, 1));
		
		// 판넬2에 버튼 추가
		jp2.add(new JButton("자바"));
		jp2.add(new JButton("C언어"));
		jp2.add(new JButton("자바 스크립트"));
		jp2.add(new JButton("JSP"));
		jp2.add(new JButton("C#"));
		
		// 판넬3 객체 생성
		JPanel jp3 = new JPanel();
						
		// 판넬3에 GridLayout배치 관리자 설정
		jp3.setLayout(new GridLayout(1, 1));
		
		// 판넬3에 레이블 추가
		jp3.add(new JLabel("좋아하는 프로그래밍 언어를 선택"));
		
		ct.add(jp1,BorderLayout.WEST);
		ct.add(jp2,BorderLayout.EAST);
		ct.add(jp3,BorderLayout.NORTH);
		
		setTitle("JPanel Test");
		
		setSize(500, 500);
		
		// 윈도우 창 종료시 프로세스 닫기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
								
		// 프레임을 화면에 출력
		setVisible(true);
	}
}


public class JPanelTest2 {

	public static void main(String[] args) {
		new JPanel2();

	}

}
