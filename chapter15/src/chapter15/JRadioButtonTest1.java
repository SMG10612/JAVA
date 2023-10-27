package chapter15;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;


//1.처리할 이벤트 종류 결정
//2. 이벤트에 적합한 이벤트 리스너 인터페이스를 사용하여 클래스 작성
class JRadioButton1 extends JFrame implements ActionListener{

	JLabel jl,jl1,jl2;
	JCheckBox[] jc = new JCheckBox[5];
	String[] hobby = {"걷기","등산","골프","스킨스쿠버","페러글라이딩"};
	
	JRadioButton[] jr = new JRadioButton[5];
	String[] age = {"20대","30대","40대","50대","60대"};
	
	public JRadioButton1() {
		jl = new JLabel();
		jl1 = new JLabel("당신의 취미는?");
		jl2 = new JLabel("당신의 나이는?");
		
		Container ct = getContentPane();
		ct.setLayout(new GridLayout(3,1));
		
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		
		JPanel hobbypanel = new JPanel();
		JPanel agepanel = new JPanel();
		//나이를 나타내는 체크박스 버튼을 그룹으로 설정
		ButtonGroup gb = new ButtonGroup();
		
		for(int i=0; i<5; i++) {
			//취미를 나타내는 체크박스 버튼 객체를 배열로 생성
			jc[i] = new JCheckBox(hobby[i]);
			//나이를 나타내는 라디오 객체를 배열로 생성
			jr[i] = new JRadioButton(age[i]);
			//취미 판넬에 객체 추가
			hobbypanel.add(jc[i]);
			//나이 판넬에 객체 추가
			agepanel.add(jr[i]);
			//3. 버튼으로 받아들일 각 컴포넌트에 리스너를 등록
			jr[i].addActionListener(this); //라디오 배열 객체에 리스너 등록
			gb.add(jr[i]); //버튼 그룹에 객체 추가
		}
		
		p1.add(jl1);
		p1.add(hobbypanel);
		
		p2.add(jl2);
		p2.add(agepanel);
		
		p3.add(jl);
		
		ct.add(p1);
		ct.add(p2);
		ct.add(p3);
		
		setTitle("JRadioButtonTest1");
		setSize(350,300);
		setVisible(true);
		
	}
	//4. 리스너 인터페이스 선언된 메소드를 오버라이딩 하여 이벤트 처리 루틴 작성.
	//이벤트 처리 메소드 작성 
	@Override
	public void actionPerformed(ActionEvent e) {
		String s = "당신의 취미 : ";
		for(int i=0; i<5; i++) {
			if(jc[i].isSelected()==true) {
				s=s+hobby[i]+" ";
			}
		}
		s=s+" 당신의 나이 : ";
		jl.setText(s+e.getActionCommand());
	}

}

public class JRadioButtonTest1 {

	public static void main(String[] args) {
		new JRadioButton1();
	}

}
