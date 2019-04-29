package edu.handong.csee.java.inheritance;

public class Cat extends Animal {
	
	//hiding
    public static void testClassMethod() {
        System.out.println("The static method in Cat");
    }
    @Override 
    public void testInstanceMethod() {
        System.out.println("The instance method in Cat");
    }

    public static void main(String[] args) {
        Cat myCat = new Cat();
        Animal myAnimal = myCat;
        Animal.testClassMethod(); // This will print out method in Animal because the method is declared as static 
        myAnimal.testInstanceMethod(); //  This will call the testInstanceMethod in a class Cat --> overrides
        myAnimal.testClassMethod(); // This also will print out the same result as line 17 because of hiding
        myCat.testClassMethod(); // This will print out testclassMethod in a class Cat because its type is Cat
    }
}
