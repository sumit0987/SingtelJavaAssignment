package com.singtel.animalDemo;

public class CluckBehaviour extends Animal {
private Animal a;
	
	public CluckBehaviour(Animal animal) {
	
		this.a = animal;
		a.setSoundType(a.getSoundType()+" Cluck Cluck");
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
	public String getSoundType(){
		return a.getSoundType();
		
	}
	@Override
	public String getMovememntType(){
		return a.getMovememntType();
	}
}
