/*
 * 2023년 11월 03일
 * 202095047송민규
 * */

package chapter15;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextField;

class JMenu1 extends JFrame implements ActionListener{
	JTextField jtf; //선택한 메뉴 출력
	
	public JMenu1(){
		//컨테이너 생성
		Container ct = getContentPane();
		//레이아웃 - border
		ct.setLayout(new BorderLayout());
	
		//1. JMenuBar()객체 생성
		JMenuBar jmb = new JMenuBar();
		
		//2. JMenu 객체 생성
		JMenu menu1 = new JMenu("파일");
		JMenu menu2 = new JMenu("편집");
		
		//3. 서브 메뉴 JMenuItem 객체로 생성.
		JMenuItem jmi = new JMenuItem("새 파일");
		jmi.addActionListener(this); //이벤트 리스너 추가
		menu1.add(jmi); //menu1 메뉴에 추가
		
		jmi = new JMenuItem("저장하기");
		jmi.addActionListener(this);
		menu1.add(jmi); //menu1 메뉴에 추가
		
		
		
		jmi = new JMenuItem("열기");
		jmi.addActionListener(this);
		menu2.add(jmi); //menu2 메뉴에 추가
		
		jmi = new JMenuItem("잘라내기");
		jmi.addActionListener(this);
		menu2.add(jmi); //menu2 메뉴에 추가
		
		jmi = new JMenuItem("복사");
		jmi.addActionListener(this);
		menu2.add(jmi); //menu2 메뉴에 추가
		
		jmi = new JMenuItem("눈금자");
		jmi.addActionListener(this);
		menu2.add(jmi); //menu2 메뉴에 추가
		
		jmi = new JMenuItem("수정가능상태");
		jmi.addActionListener(this);
		menu2.add(jmi); //menu2 메뉴에 추가
		
		
		
		//3. 서브 메뉴 JCheckBoxMenuItem() 객체 생성
		JCheckBoxMenuItem jmci = new JCheckBoxMenuItem("열기");
		jmci.addActionListener(this); //이벤트 리스너 등록
		menu2.add(jmci); //menu2 메뉴에 추가
		
		JRadioButtonMenuItem jrbmi = new JRadioButtonMenuItem("수정가능상태");
		jrbmi.addActionListener(this);
		menu2.add(jrbmi); //menu2 메뉴에 추가
		
		
		
		//5, menu1, menu2 를 jmb(jMenuBar)에 추가
		jmb.add(menu1);
		jmb.add(menu2);
		
		//6.setMenuBar()메서드를 이용하여 메뉴바를 프레임에 추가
		setJMenuBar(jmb);
		
		jtf= new JTextField();
		ct.add(jtf,BorderLayout.SOUTH); //textfield 위치 설정
		//텍스트 필드는 수정 불가 설정
		jtf.setEditable(false);
		//화면에 보여주기
		setTitle("JMenuTest1");
		setSize(300,200);
		//윈도우 창 종료시 프로세스 닫기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//화면에 출력
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		jtf.setText(e.getActionCommand());
	}
 	
}


public class JMenuTest1 {

	public static void main(String[] args) {
		new JMenu1();
	}

}
