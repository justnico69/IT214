package Encapsulation;

public class Dog {
    private String name;
    private String breed;
    private String gender;
    private int age;


    Dog(String name, String breed, String gender, int age){
        this.name = name;
        this.breed = breed;
        this.gender = gender;
        this.setAge(age);
    }

    //SETTERS
    public void setAge(int age){
        this.age = age;
    }


    //GETTERS
    public String getName(){
        return name;
    }

    public String getBreed(){
        return breed;
    }

    public String getGender(){
        return gender;
    }

    public int getAge(){
        return age;
    }




}
