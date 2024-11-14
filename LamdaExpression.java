/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
interface A{
    void show();
}
public class Main
{
	public static void main(String[] args) {
	    A obj=new A(){
	        public void show{
	            System.out.println("hello show");
	        }
	    }
	    //its lamda expression in java 8
		A obj=()->{
		    System.out.println("hello show");
		};
		obj.show();
	}
}
