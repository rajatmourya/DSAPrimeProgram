package basic;

public class oops1 {
    static class Dog{
        String name;
        int age;
        String color;
        void walk(){
            System.out.println(name+" is walking in the ground");
        }
        void bark(){

            System.out.println(name+" is borking the rahul");
        }
        void run(){

            System.out.println(name+" is the fast running");
        }
    }
//    void Cat{
//        int legs = 2;
//    }

    public  void main(String[] args) {
        Dog d1= new Dog();
//        Cat c1 = new Cat();
        d1.name="tommy";
        d1.age=3;
        d1.name="black";
        d1.bark();
        d1.walk();
        d1.run();
    }




}
