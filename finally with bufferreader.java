import java.io.BufferedReader; 
import java.io.InputStreamReader; 
import java.io.FileReader; 
import java.io.IOException;
public class Main
{
	public static void main(String[] args) throws IOException  {
	
		try{
		   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		   int num=Integer.parseInt(br.readLine());
		   System.out.println(num);
		}
		finally{
		    System.out.println("bye");
		}
		
	}
}