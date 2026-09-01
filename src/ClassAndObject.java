public class ClassAndObject {

    public void sayHello(String name){
        System.out.println("Hello! " + name);
    }

    static void main (String[] args){

       ClassAndObject object = new ClassAndObject();

       object.sayHello("Nico");
    }
}
