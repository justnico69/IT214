package DogEncapsulation;

public class Dog {
    private String breed;
    private String name;
    private int age;

    //Setter
    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        if(age > 30){
            System.out.println("Invalid age!");
            return;
        }
        this.age = age;
    }

    public void setBreed(String breed){
        this.breed = breed;
    }

    //Getter
    public String getName(){
        return name;
    }
    public String getBreed(){
        return breed;
    }
    public int getAge(){
        return age;
    }



}
