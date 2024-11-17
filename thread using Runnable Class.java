/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class A implements  Runnable{
    
     
       public void run(){
           for(int i=0;i<10;i++){
        try{
            Thread.sleep(5);
            System.out.println("hi");
        }
        catch(Exception e){
           System.out.println("execption in class A"+e);
        }
    }
   } 
}
class B implements  Runnable{
    
     
       public void run(){
           for(int i=0;i<10;i++){
        try{
            Thread.sleep(5);
            System.out.println("hello");
        }
        catch(Exception e){
           System.out.println("execption in class B"+e);
        }
    }
   } 
}
public class Main
{
	public static void main(String[] args) {
      
          Runnable obj1=new A();
          Runnable obj2=new B();
          Thread t1= new Thread(obj1);
          Thread t2= new Thread(obj2);
          t1.start();
          t2.start();
      
	}
}