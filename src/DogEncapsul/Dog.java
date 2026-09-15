package DogEncapsul;

public class Dog {
    private String breed;
    private String name;
    private String gender;
    private int age;


    //Setter
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setBreed(String breed){
        this.breed = breed;
    }
    public void setGender(String gender){
        this.gender = gender;
    }

    //Getter
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
