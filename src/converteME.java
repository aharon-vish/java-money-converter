import java.io.EOFException;


public class converteME {
	
	public  boolean isNumeric(String str)   // check if numeric 
	{
	  return str.matches("-?\\d+(\\.\\d+)?");  //match a number with optional '-' and decimal.
	}
	public  String [] FromEuro(String Money){// convert from euro
		String [] ConMoney = new String [3];
		
		double Euro =  0;
		double DOLLAR =0;
		double NIS =0 ;
		
		
		 Euro =  Double.parseDouble(Money);
		 DOLLAR = Euro * 1.08614;
		 NIS = Euro * 4.35469 ;
		
		ConMoney [0] = String.valueOf(Euro);
		ConMoney [1] = String.valueOf(DOLLAR);
		ConMoney [2] = String.valueOf(NIS);
		
		return ConMoney;
	}
	
	public  String [] FromNis(String Money){  //// convert from Nis
		String [] ConMoney = new String [3];
		
		double Euro =  0;
		double DOLLAR =0;
		double NIS =0 ;
		
		NIS =  Double.parseDouble(Money);
		 DOLLAR = NIS * 0.249922;
		 Euro = NIS * 0.230269 ;
		
		ConMoney [0] = String.valueOf(Euro);
		ConMoney [1] = String.valueOf(DOLLAR);
		ConMoney [2] = String.valueOf(NIS);
		
		return ConMoney;
	}
	
	public  String [] FromDol(String Money){// convert from Dollar
		String [] ConMoney = new String [3];
		
		double Euro =  0;
		double DOLLAR =0;
		double NIS =0 ;
		
		 DOLLAR =  Double.parseDouble(Money);
		 NIS = DOLLAR * 4.00225;
		 Euro = DOLLAR * 0.921369  ;
		
		ConMoney [0] = String.valueOf(Euro);
		ConMoney [1] = String.valueOf(DOLLAR);
		ConMoney [2] = String.valueOf(NIS);
		
		return ConMoney;
	}

}
