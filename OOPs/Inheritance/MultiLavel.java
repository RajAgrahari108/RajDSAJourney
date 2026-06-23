
public class MultiLavel {
    public static void main(String args[]){
        Dog d = new Dog(); 
        d.eat();
        d.legs = 4;
        System.out.println(d.legs);
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
    int legs;
}

class Dog extends Mammals{
    String breed;
}