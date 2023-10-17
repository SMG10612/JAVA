package chapter15;
//시험칠때 GUI만드는 부분과 이벤트 부분 따로 점수줌

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataOutputStream;
import java.io.FileOutputStream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

//전체 프레임 생성하고 컨테이너 생성하고 필요하면 판넬 만들고(2개 만들어서 텍스트 에어리어도 판넬에 올려도됨)
//1. 처리할 이벤트 종류 결정 - 버튼
//2. 이벤트에 적합한 이벤트 리스너 인터페이스를 사용하여 클래스 작성
class GUI1 extends JFrame implements ActionListener{
	//속성으로 텍스트 에어리어와 텍스트 필드를 선언.
	private JTextArea jta;
	private JTextField jtf;
	//생성자
	public GUI1(){
		/*
		//여러줄 텍스트 객체 생성 - 글내용 입력
		JTextArea jta = new JTextArea("파일의 내용을 입력하세요.",10,20); //10,20넣어서 중간으로감
		//한줄 텍스트 객체 생성 - 파일 저장명 입력
		JTextField jtf = new JTextField("파일 이름을 입력하세요.",20); //20넣어서 중간으로감
		*/
		// 버튼 객체 생성 - 저장버튼
		JButton jb = new JButton("파일로 저장");
		jta = new JTextArea("파일의 내용을 입력하세요.",10,20);
		jtf = new JTextField("파일 이름을 입력하세요.",20);
		
		
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
		//컨테이너에 텍스트 에어리어
		ct.add(jta);
		//컨터이너에 판넬 추가
		ct.add(p1); //순서도 상관있네?
		
		//3. 이벤트 받아들일 버튼에 리스너 등록
		jb.addActionListener(this); //this가 뭔뜻인지 알아둘것
		
		
		//화면 크기, 보이기, 타이틀 ...
		//화면에 보이기 사이즈 500,400
		setTitle("GUI1 Test");
		setSize(500,400);
		//윈도우 창 종료시 프로세스 닫기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//화면에 출력
		setVisible(true);
	}

	//4. 리스너 인터페이스에 선언된 메소드를 오버라이딩하여 이벤트 처리 루튼 작성.
	@Override
	public void actionPerformed(ActionEvent ae) {
		try {
			//입출력을 위한 예외처리
			//파일 이름으로 출력 객체 생성
			String s = jtf.getText();
			FileOutputStream fos = new FileOutputStream(s);
			DataOutputStream dos = new DataOutputStream(fos);
			
			//텍스트 에어리어의 내용을 파일로 출력
			dos.writeUTF(jta.getText());
			//파일 닫기
			fos.close();
			System.out.println(s+"파일이 생성되었습니다.");
		} catch(Exception e){
			System.out.println("예외 발생");
		}
	}
}

public class GUITest1 {

	public static void main(String[] args) {
		new GUI1();
	}

}
