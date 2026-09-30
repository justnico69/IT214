package AbstractsAndInterfaces;

public class Duck extends Animal implements Flyable, Swimmable {
    @Override
    public void makeNoise(){
        System.out.println("Quack Quack");
    }

    @Override
    public void fly(){
        System.out.println("flying");
    }

    @Override
    public void swim(){
        System.out.println("swimmingg");
    }
}