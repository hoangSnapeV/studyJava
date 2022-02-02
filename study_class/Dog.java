package study_class;

public class Dog {
    
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    } 

    public void speak() {
        System.out.println("I am " + this.name + " and I am " + this.age + " years old");
    }

    public static void main(String[] args) {
        Dog tim = new Dog("tim", 4);
        tim.speak();

        Dog bill = new Dog("bill", 22);
        bill.speak();
        
    }
}
