package pack2;

import java.lang.*;
import java.util.*;

public class CustomException extends Exception{

	public CustomException() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String p = sc.next();
		//check_Pan_Aadhar(s);
			//catch(MyException e){
				System.out.println("Invalid Aadhar");
			//}
	}
	
	/*public static boolean check_Aadhar(String s) {
		
		if( s!= null && s.matches("[0-9]{12}"))
			return true;
			

	}
public static boolean valid_Password(String s) throws MyException {
		
	if( s!= null && s.matches("^(?=.*[0-9])" + "(?=.*[a-z])(?=.*[A-Z])" + "(?=.*[@#$%^&+=])" + "(?=\\S+$).{8,20}$"))
		return true;
	else
		throw new MyException;
			

	}*/
	
}
