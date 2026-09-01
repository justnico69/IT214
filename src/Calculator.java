 public class Calculator {

    class Addition {

     int add(int a, int b) {
         return a + b;
     }

     int add(int a, int b, int c) {
         return a + b + c;
     }

     double add(double a, double b) {
         return a + b;
     }
 }
     public void main(String[] args) {
        Addition calc = new Addition();
         System.out.println(calc.add(1,2));
         System.out.println(calc.add(1,2,3));
         System.out.println(calc.add(1,2.4));

     }
 }
