import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.SoftBevelBorder;


public class AboutPanel extends JPanel{
    
    
	private static final long serialVersionUID = 1L;
	
	JLabel lbl1,lbl2,lbl3,lbl4,lbl5,lbl6;
    
    public AboutPanel(){
        
        this.setSize(390,500);
        this.setLayout(null);
        this.setBorder(new SoftBevelBorder(SoftBevelBorder.LOWERED));
        
        this.addLabel();
    }
    public void addLabel(){
        this.lbl1 = new JLabel("About");
        this.lbl2 = new JLabel("Tic Tac Toe");
        this.lbl3 = new JLabel("Version 1.0");
        this.lbl4 = new JLabel("Made by");
        this.lbl5 = new JLabel("Chumky, Suraiya Siddiqua");
        this.lbl6 = new JLabel("Hasan MD Zahid");
        
        lbl1.setBounds(155, 5, 100, 100);
        lbl1.setFont(new Font("Bold", Font.BOLD, 20));
        lbl2.setBounds(135, 40, 200, 100);
        lbl2.setFont(new Font("Bold", Font.BOLD, 17));
        lbl3.setBounds(150, 60, 100, 100);
        lbl4.setBounds(160, 130, 100, 100);
        lbl5.setBounds(100, 170, 300, 100);
        lbl6.setBounds(135, 200, 300, 100);
        
        this.add(lbl1);this.add(lbl2);this.add(lbl3);
        this.add(lbl4);this.add(lbl5);this.add(lbl6);
    }
}
