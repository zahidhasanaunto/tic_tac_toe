import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MainFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Container container;
    JMenuBar bar;
    JMenu fileMenu,helpMenu;
    JMenuItem newGameMenuItem,exitMenuItem,aboutMenuItem,rulesMenuItem;
    GamePanel gamePanel;
    
	public MainFrame(){
		
        this.setSize(390,550);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    
        gamePanel = new GamePanel();
        this.add(gamePanel);
        
        this.addMenuToFrame();
        this.addMenuListToFrame();
	}
	public void addMenuToFrame(){
        this.bar = new JMenuBar();
        this.fileMenu = new JMenu("File");
        this.helpMenu = new JMenu("Help");
        this.newGameMenuItem = new JMenuItem("New Game");
        this.exitMenuItem = new JMenuItem("Exit");
        this.aboutMenuItem = new JMenuItem("About");
        this.rulesMenuItem = new JMenuItem("Game Rules");
        
        this.setJMenuBar(this.bar);
        bar.setVisible(true);
        this.bar.add(this.fileMenu);this.bar.add(this.helpMenu);
        this.fileMenu.add(newGameMenuItem);this.fileMenu.add(exitMenuItem);
        this.helpMenu.add(rulesMenuItem);this.helpMenu.add(aboutMenuItem);
        
    }
    public void addMenuListToFrame(){
        this.newGameMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	container = getContentPane();
            	container.removeAll();          	
            	container.add(gamePanel);
            	
            	revalidate();
            	repaint();
            	
            }
        });
        this.exitMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        this.aboutMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	container = getContentPane();
                container.removeAll();
                
                AboutPanel aboutFrame = new AboutPanel();
                
                container.add(aboutFrame);
                invalidate();
                repaint();
            }
        });
        this.rulesMenuItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				container = getContentPane();
				container.removeAll();
				
				RulesPanel rulesPanel = new RulesPanel();
				
				container.add(rulesPanel);
				revalidate();
				repaint();
			}
		});
    }
}
