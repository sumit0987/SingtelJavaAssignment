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

	}

}
