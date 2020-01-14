package com.singtel.animalDemo;

public class FlyBehaviour extends Animal{

private Animal a;
	
	public FlyBehaviour(Animal animal) {
		this.a = animal;
		a.setMovementType(a.getMovememntType()+"I am Flying");
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
