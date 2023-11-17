package chapter16;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.StringTokenizer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class MyTime extends JFrame implements ActionListener{
	
	JLabel jl;
	JTextField jf;
	JTextArea ja1;
	JTextArea ja2;
	JButton jb1;
	JButton jb2;
	
	public MyTime() {
		jl = new JLabel("당신의 생일을 공백으로 구분하여 입력(예:2020 01 01)");
		jf = new JTextField(10);
		jb1 = new JButton("현재");
		jb2 = new JButton("100일");
		ja1 = new JTextArea(4,30);
		ja2 = new JTextArea(3,30);
		
		ja1.setEditable(false);
		ja2.setEditable(false);
		//컨테이너 생성
		Container ct = getContentPane();	
		//FlowLayout 설정
		ct.setLayout(new FlowLayout());
		
		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		JPanel jp3 = new JPanel();
		
		jp1.add(jl);
		jp1.add(jf);
		
		jp2.add(jb1);
		jp2.add(ja1);
		
		jp3.add(jb2);
		jp3.add(ja2);
		
		ct.add(jp1);
		ct.add(jp2);
		ct.add(jp3);
		
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		
		//화면에 보이도록... 사이즈:500,300
		setTitle("MyTime");
		setSize(500,300);
		//윈도우 창 종료시 프로세스 닫기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//화면에 출력
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String birth = jf.getText(); //jf에 입력한 값을 가져오는것
		StringTokenizer st1 = new StringTokenizer(birth); //birth의 값을 StringTokenizer로 객체 생성
		
		int year = Integer.parseInt(st1.nextToken()); //공백의 기준으로 자른 문자열을 정수형으로 변환해서 변수에 저장
		int month = Integer.parseInt(st1.nextToken());
		int day = Integer.parseInt(st1.nextToken());
		
		LocalDate my_birth = LocalDate.of(year, month, day);
		LocalDate current = LocalDate.now();
		LocalDate hundred = my_birth.plusYears(100);
		
		
		//LocalDate day2 = current.plusWeeks();
		//LocalDate year2 = current.plusDays();
		
		if(e.getActionCommand() == "현재") {
			
			ja1.append("당신의 생일 : " + toString(my_birth)+"\n");
			ja1.append("오늘 날짜는 : " + toString(current) + "\n");
			ja1.append("생일부터 오늘까지의 일 : "+ my_birth.until(current, ChronoUnit.DAYS)+"\n");
			ja1.append("생일부터 오늘까지의 일 : "+ my_birth.until(current, ChronoUnit.YEARS));
		}
		
		else {
			ja2.append("당신이 100이 되는 날은 : "+ toString(hundred)+"\n");
			ja2.append("100살까지 남은 수(week) 수 : " + current.until(hundred, ChronoUnit.WEEKS)+"\n");
			ja2.append("100살까지 남은 일 수 : " + current.until(hundred, ChronoUnit.DAYS));
		}
		
	}

	private String toString(LocalDate d) {
		return d.getYear()+"년 " + d.getMonthValue()+"월 " + d.getDayOfMonth() +"일";
	}
	
}

public class TimeTestGUI {

	public static void main(String[] args) {
		new MyTime();
	}

}
