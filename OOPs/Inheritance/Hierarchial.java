
public class Hierarchial {
    
public static void main(String args[]){
   
        
    }
}

class Animal{
    String color;
    void eat(){
        System.out.println("Eats");
    }

    void breathe(){
        System.out.println("breathe");
    }
}

class Mammals extends Animal{
    
    void walk(){
        System.out.println("walk");
    }
}
class Fish extends Animal{
    
    void swim(){
        System.out.println("swim");
    }
}
class Bird extends Animal{
    
    void fly(){
        System.out.println("fly");
    }
}

