/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		System.out.println("Lets understand the Exception Handeling ");
		int j=0;
		int i=20;
		try{
		    j=18/i;
		    if(j==0){
		        throw new ArithmeticException("stored it in backup db") ;
		    }
		    else{
		        System.out.println("Stored it in main db");
		    }
		}
		catch(ArithmeticException e){
		    System.out.println("Backup db Stored with data Successfully "+ e);
		}
		
	}
}