package chapter15;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.FileInputStream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class GUI2 extends JFrame implements ActionListener{
	//속성으로 텍스트 에어리어와 텍스트 필드를 선언.
	private JTextArea jta;
	private JTextField jtf;
	//생성자
	public GUI2(){
		/*
		//여러줄 텍스트 객체 생성 - 글내용 입력
		JTextArea jta = new JTextArea("파일의 내용을 입력하세요.",10,20); //10,20넣어서 중간으로감
		//한줄 텍스트 객체 생성 - 파일 저장명 입력
		JTextField jtf = new JTextField("파일 이름을 입력하세요.",20); //20넣어서 중간으로감
		*/
		// 버튼 객체 생성 - 저장버튼
		JButton jb = new JButton("파일 불러오기");
		//여러줄 텍스트 객체 생성 - 글내용 출력
		jta = new JTextArea(10,20);
		jtf = new JTextField("파일 이름을 입력하세요.",20);
		
		//텍스트 에어리어 수정 불가.
		jta.setEditable(false);
		//컨테이너 생성
		Container ct = getContentPane();
		//FlowLayout 배치 관리자 생성
		ct.setLayout(new FlowLayout());
		//판넬 생성
		JPanel p1 = new JPanel();
		
		//판넬에 택스트 필드 추가
		p1.add(jtf);
		//판넬에 버튼 추가
		p1.add(jb);
		//컨터이너에 판넬 추가
		ct.add(p1); //순서도 상관있네?
		//컨테이너에 텍스트 에어리어
		ct.add(jta);
		
		
		//3. 이벤트 받아들일 버튼에 리스너 등록
		jb.addActionListener(this); //this가 뭔뜻인지 알아둘것
		
		
		//화면 크기, 보이기, 타이틀 ...
		//화면에 보이기 사이즈 500,400
		setTitle("GUI2 Test");
		setSize(500,400);
		//윈도우 창 종료시 프로세스 닫기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//화면에 출력
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent ae) {
		try {
			String s = jtf.getText();
			FileInputStream fis = new FileInputStream(s);
			DataInputStream dis = new DataInputStream(fis);
			
			//파일의 내용을 읽어와서 텍스트 에어리어의 내용으로 설정
			jta.setText(dis.readUTF());
			fis.close();
			System.out.println(s+"파일을 읽어 왔습니다.");
		} catch(Exception e){
			System.out.println("파일이 존재하지않습니다.");
		}
	}
}
public class GUITest2 {
	public static void main(String[] args) {
		new GUI2();
	}

}


