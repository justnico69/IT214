package Dog;

public class Dog {
    private String breed;
    private String name;
    private int age;


    //Setters
    public void setName(String name){
        this.name = name;
    }
    public void setBreed(String breed){
        this.breed = breed;
    }
    public void setAge(int age){
        if(age > 20){
            System.out.println("Invalid age!");
            return;
        }
        this.age = age;
    }

    //Getters
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
