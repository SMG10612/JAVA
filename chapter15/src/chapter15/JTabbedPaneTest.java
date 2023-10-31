package chapter15;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;

//1. 성별 판넬 클래스 만들기
class GenderPanel extends JPanel implements ActionListener {//JFrame아님 주의!
	// 성별을 나타내는 라디오 버튼 그룹 만들기
    ButtonGroup gb = new ButtonGroup();
    
    // 레이블 생성
    JLabel jl1 = new JLabel("당신의 성별은? ");
    JLabel jl2 = new JLabel("");
    
    // 라디오 버튼 생성
    JRadioButton[] jr = new JRadioButton[2];
    String[] gender = {"남자", "여자"};

    //생성자
    public GenderPanel() {
    	//성별 라디오버튼 객체를 배열 생성
        for (int i = 0; i < 2; i++) {
            jr[i] = new JRadioButton(gender[i]);
            add(jr[i]);//성별 판넬에 객체 추가
            //버튼을 그룹에 추가
            gb.add(jr[i]);
            
            //리스너 등록
            jr[i].addActionListener(this);
        }
        add(jl1);
        add(jl2);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();
        jl2.setText(s);
    }
}

//1. 혈액형 판넬 클래스 만들기
class BloodPanel extends JPanel implements ItemListener {
    JLabel jl1 = new JLabel("당신의 혈액형은? ");
    JLabel jl2 = new JLabel("");

    public BloodPanel() {
    	/*
    	 * //콤보 박스 객체 생성
		 *JComboBox<String> jcb = new JComboBox<String>();
		 *	jcb.addItem("A형");
		 *jcb.addItem("B형");
		 *jcb.addItem("C형");
		 *jcb.addItem("AB형");
		 *
		 *add(jl1);
		 *add(jl2);
		 *add(jcb);
		 * */
    	
    	//콤보 박스 객체 생성
        JComboBox<String> bloodCombo = new JComboBox<String>();
        
        //혈액형 배열 생성
        String[] bloodList = {"A", "B", "O", "AB"};
        
        //콤보박스에 과일 리스트 추가
        for (int i = 0; i < bloodList.length; i++) {
            bloodCombo.addItem(bloodList[i]);
        }
        //컨테이너에 콤보박스 추가
        add(jl1);
        add(jl2);
        add(bloodCombo);
        //콤보박스에 이벤트 리스너 등록
        bloodCombo.addItemListener(this);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        Object s = e.getItem();
        jl2.setText(s.toString());
    }
}

//GUI
class JTabPane extends JFrame {
    //생성자
	public JTabPane() {
        //컨테이너 생성
		Container ct = getContentPane();
        
		//2. JTabbedPane()객체 생성
		JTabbedPane jtp = new JTabbedPane();
        
		//라디오 판넬, 콤보 판넬 객체 생성
		GenderPanel genderPanel = new GenderPanel();
        BloodPanel bloodPanel = new BloodPanel();
        
        //3. JTabbedPane()에 판넬 추가
        jtp.add("성별", genderPanel);
        jtp.add("혈액형", bloodPanel);
        
        //4. 컨테이너에 추가
        ct.add(jtp);
        
        //출력
        setTitle("JTabbedPaneTest1");
        setSize(400, 150);
        setVisible(true);
    }
}

public class JTabbedPaneTest {
    public static void main(String[] args) {
        new JTabPane();
    }
}