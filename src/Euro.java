import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class Euro extends JPanel {

	 private JTextField text = new JTextField();//write the number
     JLabel label = new JLabel();//SET icon
     JLabel label2 = new JLabel();//pic of Currency
     String s = new String();
	Euro(){
		
		 Icon euro = new ImageIcon( getClass().getResource( "euro.png") );//SET icon
        label.setIcon( euro); // add icon to JLabel

        label.setVerticalTextPosition( SwingConstants.BOTTOM );
        add( label ); 	
		
    	Font font1 = new Font("SansSerif", Font.BOLD, 20);//set font of txt
        setText(new JTextField("",30));
        getText().setFont(font1);
        getText().setHorizontalAlignment(JTextField.CENTER);
        add(getText());
        
        label2 = new JLabel("€");// pic of Currency
        Font font2 = new Font("SansSerif", Font.BOLD, 25);
        label2.setFont(font2);
        label2.setVerticalTextPosition( SwingConstants.BOTTOM );
        add( label2 ); 
        
		
	}
	
	
	String getTextS ()//get text
	{
		s=getText().getText();
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
