/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Comparator<String>com=new Comparator<String>(){
	    
	    public int compare(String i,String j){
	          if(i.length()>j.length()){
	              return 1;
	          }
	          return -1;
	          }
	    
	};
	  
	  List<String>list=new ArrayList<>();
	  list.add("aadadad");
	  list.add("asdfgh");
	  list.add("asdfg");
	  list.add("asdf");
	  list.add("asd");
	  list.add("as");
	  list.add("a");
	  Collections.sort(list,com);
	  System.out.println(list);
	 
	  
	}
}