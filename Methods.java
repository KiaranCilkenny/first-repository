public class Methods{

public static void main(String[]args){
  Methods m = new Methods();
  m.method1();
 }

 public void method1(){
   System.out.println("Method 1 here and I am calling method  2");
  method2();
  }

  public void method2(){
   System.out.println("Hi Method 1, from method 2, I am calling method 3");
   method3();
   }

  public void method3(){
   System.out.println("Hi method 2, form method 3,tell method 1 I say hello.");
   }
 }
