import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;


public class Display extends JFrame {
	
	public Display(){
		this.setTitle("Monopoly");
		this.setSize(1500,1000);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Instanciation d'un objet JPanel
	    JPanel pan = new JPanel();
	   
	    //Définition de sa couleur de fond
	    pan.setBackground(Color.ORANGE);        
	    
	    //On prévient notre JFrame que notre JPanel sera son content pane
	    this.setContentPane(new Panneau());              
	    this.setVisible(true);
		
		
		
	}
	
}
