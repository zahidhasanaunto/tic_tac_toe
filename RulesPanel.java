import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.SoftBevelBorder;

public class RulesPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JLabel lbl1,lbl2,lbl3;
	
	public RulesPanel(){
	
		this.setSize(390,500);
        this.setLayout(null);
        this.setBorder(new SoftBevelBorder(SoftBevelBorder.LOWERED));
        
        this.lbl1 = new JLabel("Game Rules");
        this.lbl2 = new JLabel("Player 1 = ' X '");
        this.lbl3 = new JLabel("Player 2 = ' O '");
        
        lbl1.setBounds(125, 20, 300, 100);
        lbl1.setFont(new Font("Bold", Font.BOLD, 20));
        lbl2.setBounds(145, 90, 300, 100);
        lbl3.setBounds(145, 120, 300, 100);
        
        
        
        this.add(lbl1);this.add(lbl2);this.add(lbl3);
	}
}
