import java.awt.Dimension;
import java.awt.Font;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class Us extends JPanel {

	 private JTextField text = new JTextField(); //write the number
     JLabel label = new JLabel(); //SET icon 
     JLabel label2 = new JLabel("$"); //pic of Currency
     Us (){

    	 
    	 
         Icon usa = new ImageIcon( getClass().getResource( "usa.jpg" ) );//SET icon
         label = new JLabel(); // JLabel constructor no arguments
         label.setIcon( usa ); // add icon to JLabel
         label.setVerticalTextPosition( SwingConstants.BOTTOM );
         add( label ); 
    	 
    	Font font1 = new Font("SansSerif", Font.BOLD, 20);//set font of txt
        setText(new JTextField("",30));
        getText().setFont(font1);
        getText().setHorizontalAlignment(JTextField.CENTER);
        add(getText());
        
        label2 = new JLabel("$"); // pic of Currency
        label2.setFont(font1);
        label2.setVerticalTextPosition( SwingConstants.BOTTOM );
        add( label2 ); 
        	
}
     
 	String getTextS ()//get text
 	{
 		String s = getText().getText();
 		return s;
 	}
 	
	void SetTextS (String s)//set text
	{
		getText().setText(s);
	
	}

	JTextField getText() {
		return text;
	}

	void setText(JTextField text) {
		this.text = text;
	}
}