pakage com.demo;

public class MathOperation {   

   public static viod main(string[] args) {

   MathFunction add = (a,b) -> a+b;
   MathFunction  multiply = (a,b) -> a*b;
   MathFunction divide = (a,b) -> a/b;
   MathFunction subraction = (a,b) -> a-b;

   system.out.println(add.calulate(5,2));
   system.out.println(multiply.calulate(5,2));
   system.out.println(divide.calulate(5,2));
   system.out.println(subraction.calulate(5,2));
  }

}
@FunctionalInterface
interface MathOperation {


  int calculate(int a,int b);
}
