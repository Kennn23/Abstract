import java.util.Scanner;
public abstract class RunAnimal extends Animal{

    public static void main(String[] args){
    	
    	Bird B = new Bird();
    	Cat C = new Cat();
    	Dog D = new Dog();
    Scanner sc = new Scanner(System.in);
  
    	System.out.println("Choose an animal. Press B for Bird, C for Cat, or D for Dog: ");
    	String name = sc.nextLine();
    	
    if(name.equalsIgnoreCase("B")){
    	B.eat();
    	B.sleep();
    	B.makeSound();
    }
    if (name.equalsIgnoreCase("C")){
    	C.eat();
    	C.sleep();
    	C.makeSound();
    }
    if (name.equalsIgnoreCase("D")){
    	D.eat();
    	D.sleep();
    	D.makeSound();
    }
    else{
    }
    	System.out.print("Invalid Input. ");
    }
    }
}