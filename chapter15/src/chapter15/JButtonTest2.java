package chapter15;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

class JButton2 extends JFrame implements ActionListener{
	JTextField jtf;
	public JButton2() {
		jtf = new JTextField(10);
		
		ImageIcon apple = new ImageIcon("image/apple.jpg");
		ImageIcon banana = new ImageIcon("image/banana.jpg");
		ImageIcon persimmon = new ImageIcon("image/persimmom.jpg");
		ImageIcon pear = new ImageIcon("image/pear.jpg");
		ImageIcon grape = new ImageIcon("image/grape.jpg");
		
		JButton apple1 = new JButton("사과",apple);
		JButton banana1 = new JButton("바나나",banana);
		JButton persimmon1 = new JButton("감",persimmon);
		JButton pear1 = new JButton("배",pear);
		JButton grape1 = new JButton("포도",grape);
		
		Container ct = getContentPane();
		
		ct.setLayout(new GridLayout(3,2)); //컨테이너를 Grid 배치 관리자로 설정
		
		ct.add(apple1);
		ct.add(banana1);
		ct.add(persimmon1);
		ct.add(pear1);
		ct.add(grape1);
		ct.add(jtf);
		
		apple1.addActionListener(this);
		banana1.addActionListener(this);
		persimmon1.addActionListener(this);
		pear1.addActionListener(this);
		grape1.addActionListener(this);
		
		setTitle("JButton Test2");
		setSize(250,300);
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		jtf.setText(e.getActionCommand());
	}
	
}

public class JButtonTest2 {

	public static void main(String[] args) {
		new JButton2();
	}

}
