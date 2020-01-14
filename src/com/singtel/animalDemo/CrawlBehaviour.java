package com.singtel.animalDemo;

public class CrawlBehaviour extends Animal {
private Animal a;
	
	public CrawlBehaviour(Animal animal) {
	
		this.a = animal;
		a.setSoundType(a.getSoundType()+" I am crawling");
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
