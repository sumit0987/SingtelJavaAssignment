package com.singtel.animalDemo;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Trying to decorate every object with its own specific behaviour ie, swimming, walking, etc
		
		//for Question 2 (a) and (b) i.e duck with Quack behaviour and swim behaviour
		Animal bird = new Bird();
		Animal duck = new QuackBehaviour(new SwimBehaviour(bird));
		System.out.println(duck.getSoundType());
		System.out.println(duck.getMovememntType());
		
		//for Question 2 (c) and (d) i.e chicken with cluck behaviour and walk behaviour
		Animal bird1 = new Bird();
		Animal chicken = new CluckBehaviour(new WalkBehaviour(bird1));
		System.out.println(chicken.getSoundType());
		System.out.println(chicken.getMovememntType());
		
		//for Question 3 i.e rooster with cock-a-doodle-doo behaviour
		//I have not created any relationship type between chicken and rooster as I am decorationg objects with its behaviour 
		Animal bird2 = new Bird();
		Animal rooster = new CockaDoodleBehaviour(bird2);
		System.out.println(rooster.getSoundType());
		
		//for Question 4 i.e parrot living near a dog, a cat and a rooster
		//I have kept the parrot maintainable by adding the required behaviour whenever needed.
		//If a parrot is living near a duck then I will add QuackBehaviour to the parrot
		Animal parrot=new Bird();
		Animal parrotWithDog=new BarkingBehavior(parrot);
		System.out.println(parrotWithDog.getSoundType());
		
		Animal parrot2=new Bird();
		Animal parrotWithCat=new MeowBehaviour(parrot2);
		System.out.println(parrotWithCat.getSoundType());
		
		Animal parrot3=new Bird();
		Animal parrotWithRooster=new CockaDoodleBehaviour(parrot3);
		System.out.println(parrotWithRooster.getSoundType());
		
		//For question B(1), Fish object which can swim
		Animal fish = new SwimBehaviour(new Fish());
		System.out.println(fish.getMovememntType());
		
		
		

	}

}
