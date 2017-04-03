import java.awt.Font;
import java.awt.event.*;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class Nis extends JPanel {
	
	 private JTextField text = new JTextField(); //write the number
	 private JLabel label1 = new JLabel(); //  //SET icon 
	 private JLabel label2 = new JLabel();//pic of Currency
	 private String s ; 
     Nis (){

    	 
    	 
         Icon israel = new ImageIcon( getClass().getResource( "israel.png" ) ); //SET icon 
         label1.setIcon( israel ); // add icon to JLabel
         label1.setVerticalTextPosition( SwingConstants.BOTTOM );
         add( label1 );  
    	 
    	 
    	 
     	Font font1 = new Font("SansSerif", Font.BOLD, 20); //set font of txt
        setText(new JTextField("",30));
        getText().setFont(font1);
        getText().setHorizontalAlignment(JTextField.CENTER);
        add(getText());
        
        label2 = new JLabel("¤"); // pic of Currency
        label2.setVerticalTextPosition( SwingConstants.BOTTOM );
        add( label2 ); 
        

}
     
    
  	String getTextS () //get text
  	{
  		String s = getText().getText();
  		return s;
  	}
	void SetTextS (String s) //set text
	{
		getText().setText(s);
	
	}


	private JTextField getText() {
		return text;
	}


	private void setText(JTextField text) {
		this.text = text;
	}   
     
}