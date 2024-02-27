import java.util.*;
class Animal{
    String name;
    public Animal(String name){
      this.name = name;
    }
    public void nameOfAnimal(){
        System.out.println("the name is:"+name);
    }

}
 class Dog extends Animal{
    String breed;
    public Dog(String name, String breed){
        super(name);
        this.breed=breed;
    }

     public void barks(){
         System.out.println("wooofffff!!!!");
     }
 }
public class Oops {
    public static void main(String[] args) {
Dog d = new Dog("anny","suffy");
d.nameOfAnimal();
d.barks();
    }
}
