package com.singtel.animalDemo;

public abstract class Animal {
	/*void walk(){
		System.out.println("I am walking");
	}*/
	private String soundType="";
	private String movementType="";
	
	public String getSoundType() {
		return this.soundType;
	}
	public void setSoundType(String sType) {
		this.soundType=sType;
	}
	public void setMovementType(String mType){
		this.movementType=mType;
	}
	public String getMovememntType(){
		return this.movementType;
	}
}
