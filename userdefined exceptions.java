 class ShubhamEXception extends Exception {
    public  ShubhamEXception(String s){
         super(s);
    }
 }
public class Main
{
	public static void main(String[] args) {
		System.out.println("Lets understand the Exception Handeling ");
		int j=0;
		int i=20;
		try{
		    j=18/i;
		    if(j==0){
		        throw new ShubhamEXception("stored it in backup db") ;
		    }
		    else{
		        System.out.println("Stored it in main db");
		    }
		}
		catch(ShubhamEXception e){
		    System.out.println("Backup db Stored with data Successfully "+ e);
		}
		
	}
}