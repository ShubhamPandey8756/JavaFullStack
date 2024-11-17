/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class A extends  Thread{
    
     
       public void run(){
           for(int i=0;i<10;i++){
        System.out.println("hi");
    }
   } 
}
class B extends  Thread{
   
       public void run(){
           for(int i=0;i<10;i++){
        System.out.println("hello");
    }
   } 
    
}
public class Main
{
	public static void main(String[] args) {
      
          A obj1=new A();
          B obj2=new B();
          obj1.start();
          obj2.start();
      
	}
}