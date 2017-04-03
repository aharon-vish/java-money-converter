import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class MainMoneyConverter {

	public static void main(String[] args) {
	   
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();  // size of a screen
	    double height = screenSize.getHeight();
	    double width = screenSize.getWidth();
	    
		JFrame frame = new JFrame("Money Converter");
		
		frame.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize((int)width,(int)height);
	
		JPanel container = new JPanel();
		container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS)); //container all of jpanel from the top to the bottom
				
		frame.setResizable(false);  //can not be resizable
		Euro eu=new Euro();
		Nis n=new Nis();
		Us u =new Us();
		container.add(eu);// add to container
		container.add(n);
		container.add(u);
		
		JButton convertButton=new JButton("Convert Me!!"); //convert Button 
		convertButton.setPreferredSize(new Dimension(0, 50));
		
		container.add(convertButton, BorderLayout.SOUTH);
		frame.add(container);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		converteME ConMe =new converteME();
		
		convertButton.addActionListener(new ActionListener(){ //Execute when button is pressed	
        public void actionPerformed(ActionEvent e)
        {
        	//check if the field are empty , need to be onky one field that numric  
         if(ConMe.isNumeric(eu.getTextS()) && ConMe.isNumeric(n.getTextS()) && ConMe.isNumeric(u.getTextS()) ||
        		 ConMe.isNumeric(eu.getTextS()) && ConMe.isNumeric(u.getTextS()) ||
        		 ConMe.isNumeric(eu.getTextS()) && ConMe.isNumeric(n.getTextS()) ||
        		 ConMe.isNumeric(u.getTextS()) &&  ConMe.isNumeric(n.getTextS())){
        	 JOptionPane.showMessageDialog(null, "Only one currency can be convert");
        	 eu.SetTextS("");
        	 u.SetTextS("");
        	 n.SetTextS("");
         }
        		 
        	
        	//check if the string is numric
         else if(ConMe.isNumeric(eu.getTextS())){
        		String [] ConMoney = new String [3];
        		ConMoney=ConMe.FromEuro(eu.getTextS());
        		
        		eu.SetTextS(ConMoney[0]);
        		u.SetTextS(ConMoney[1]);
        		n.SetTextS(ConMoney[2]);
        	}//check if the string is numric
        	else if (ConMe.isNumeric(n.getTextS())) {
        		
        		String [] ConMoney = new String [3];
        		ConMoney=ConMe.FromNis(n.getTextS());
        		
        		eu.SetTextS(ConMoney[0]);
        		u.SetTextS(ConMoney[1]);
        		n.SetTextS(ConMoney[2]);
				
			}//check if the string is numric
        	else if (ConMe.isNumeric(u.getTextS())) {
        		String [] ConMoney = new String [3];
        		ConMoney=ConMe.FromDol(u.getTextS());
        		
        		eu.SetTextS(ConMoney[0]);
        		u.SetTextS(ConMoney[1]);
        		n.SetTextS(ConMoney[2]);
			}

        }
    });


	}
	

}	
	


