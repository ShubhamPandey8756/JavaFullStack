class A{
   public void show(){
        System.out.println("hello world in  A");
   }
}
class B extends A{
   public void show2(){
         System.out.println("hello world in  B");
   }
}
public class Demo{
    public static void main(String []args){
         // System.out.println("hello world");
          A obj=new A();
          obj=new B();
          obj.show2();
          //obj.show
    }
}