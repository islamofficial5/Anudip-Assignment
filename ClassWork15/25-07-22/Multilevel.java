package oopsprograms;

class Animal	//GrandParent
{
	public void display()
	{
		System.out.println("Animals");
	}
}

class dog extends Animal	//Parent
{
	public void bark()
	{
		System.out.println("The dog is barking");
	}
}

class puppy extends dog	//Child
{
	public void puppy()
	{
		System.out.println("Child of dog");
	}
}

public class Multilevel_Inheritance 
{

	public static void main(String[] args)
	{
		puppy pup = new puppy();
		pup.display();
		pup.bark();
		pup.puppy();
	}

}
