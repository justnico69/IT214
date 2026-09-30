package AbstractsAndInterfaces;

class Dog extends Animal implements Swimmable{
    @Override
    public void makeNoise(){
        System.out.println("Bark Bark");
    }

    @Override
    public void swim(){
        System.out.println("This doggo is swimming");
    }



}
