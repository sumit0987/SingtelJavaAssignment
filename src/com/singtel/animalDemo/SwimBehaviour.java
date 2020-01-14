package com.singtel.animalDemo;

public class SwimBehaviour extends Animal {

	private Animal a;
	
	public SwimBehaviour(Animal animal) {
		this.a = animal;
		a.setMovementType(a.getMovememntType()+"I can Swim");
	}
	@Override
	public void setSoundType(String sType) {
		this.a.setSoundType(sType);
	}
	@Override
	public void setMovementType(String mType){
		this.a.setMovementType(mType);
	}

	@Override
	public String getMovememntType(){
		return a.getMovememntType();
	}
	@Override
	public String getSoundType(){
		return a.getSoundType();
	}

}
