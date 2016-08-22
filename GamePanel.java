import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

import javax.swing.JPanel;
import javax.swing.border.SoftBevelBorder;



public class GamePanel extends JPanel implements ActionListener{
    
    
	private static final long serialVersionUID = 1L;
	
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,resetBtn;
    GameArray GArr;
    boolean Player = false;
    int PlayerMark = 1;
    
    public GamePanel(){
        
        this.setSize(390,500);
        this.setLayout(null);
        this.setBorder(new SoftBevelBorder(SoftBevelBorder.LOWERED));
        
        
        this.addButtonToFrame();
        this.SetGame();
    }
    public void addButtonToFrame(){
        this.b1 = new JButton("");this.b2 = new JButton("");
        this.b3 = new JButton("");this.b4 = new JButton("");
        this.b5 = new JButton("");this.b6 = new JButton("");
        this.b7 = new JButton("");this.b8 = new JButton("");
        this.b9 = new JButton("");this.resetBtn = new JButton("Reset");
        
        this.b1.setBounds(20, 70, 100, 100);
        this.b2.setBounds(140, 70, 100, 100);
        this.b3.setBounds(260, 70, 100, 100);
        this.b4.setBounds(20, 190, 100, 100);
        this.b5.setBounds(140, 190, 100, 100);
        this.b6.setBounds(260, 190, 100, 100);
        this.b7.setBounds(20, 310, 100, 100);
        this.b8.setBounds(140, 310, 100, 100);
        this.b9.setBounds(260, 310, 100, 100);
        this.resetBtn.setBounds(150, 430, 80, 30);
        
        this.add(b1);this.add(b2);this.add(b3);
        this.add(b4);this.add(b5);this.add(b6);
        this.add(b7);this.add(b8);this.add(b9);
        this.add(resetBtn);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
    }
    public void SetGame(){
        GArr = new GameArray(this);
        DefaultText();
        DisableAll(true);
        Player = false;
        PlayerMark = 1;
    }
    public void Reset(){
        SetGame();
    }
    public int SwitchTurn(boolean last){
        if (last == true) {
            Player = false;
            return 1;
        } else if (last == false){
            Player = true;
            return 2;
        } else{
            return 3;
        }
    }
    public void ButtonDisabler(JButton b){
        b.setEnabled(false);
    }
    public void DisableAll(boolean Opp){
        b1.setEnabled(Opp);
        b2.setEnabled(Opp);
        b3.setEnabled(Opp);
        b4.setEnabled(Opp);
        b5.setEnabled(Opp);
        b6.setEnabled(Opp);
        b7.setEnabled(Opp);
        b8.setEnabled(Opp);
        b9.setEnabled(Opp);
    }
    public void SetTextOnButton(JButton b, boolean play){
        if(play == true){
            b.setText("O");
        } else if(play == false){
            b.setText("X");
        }
    }
    public void DefaultText(){
        b1.setText("");b2.setText("");b3.setText("");
        b4.setText("");b5.setText("");b6.setText("");
        b7.setText("");b8.setText("");b9.setText("");
    }
            

    @Override
    public void actionPerformed(ActionEvent e) {
        
        JButton Pressed = (JButton) e.getSource();
        
        if (Pressed == b1) {
            GArr.InitArray(0, 0, PlayerMark);
            SetTextOnButton(Pressed, Player);
            PlayerMark = SwitchTurn(Player);
            ButtonDisabler(b1);
        } else if (Pressed == b2) {
            GArr.InitArray(0, 1, PlayerMark);
            SetTextOnButton(Pressed, Player);
            PlayerMark = SwitchTurn(Player);
            ButtonDisabler(b2);
        } else if (Pressed == b3) {
            GArr.InitArray(0, 2, PlayerMark);
            SetTextOnButton(Pressed, Player);
            PlayerMark = SwitchTurn(Player);
            ButtonDisabler(b3);
        } else if (Pressed == b4) {
            GArr.InitArray(1, 0, PlayerMark);
            SetTextOnButton(Pressed, Player);
            PlayerMark = SwitchTurn(Player);
            ButtonDisabler(b4);
        } else if (Pressed == b5) {
            GArr.InitArray(1, 1, PlayerMark);
            SetTextOnButton(Pressed, Player);
            PlayerMark = SwitchTurn(Player);
            ButtonDisabler(b5);
        } else if (Pressed == b6) {
            GArr.InitArray(1, 2, PlayerMark);
            SetTextOnButton(Pressed, Player);
            PlayerMark = SwitchTurn(Player);
            ButtonDisabler(b6);
        } else if (Pressed == b7) {
            GArr.InitArray(2, 0, PlayerMark);
            SetTextOnButton(Pressed, Player);
            PlayerMark = SwitchTurn(Player);
            ButtonDisabler(b7);
        } else if (Pressed == b8) {
            GArr.InitArray(2, 1, PlayerMark);
            SetTextOnButton(Pressed, Player);
            PlayerMark = SwitchTurn(Player);
            ButtonDisabler(b8);
        } else if (Pressed == b9) {
            GArr.InitArray(2, 2, PlayerMark);
            SetTextOnButton(Pressed, Player);
            PlayerMark = SwitchTurn(Player);
            ButtonDisabler(b9);
        }
            
        this.resetBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Reset();
			}
		});
    }

}





















