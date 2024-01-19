package Part1.logic;

import java.util.ArrayList;
import java.util.Objects;

public class Building {
	private ArrayList<EnterProfile> enterProfileList;

	private int populationCount = 0;
	private int potentialInfectedCount = 0;
	
	public Building() {
		enterProfileList = new ArrayList<EnterProfile>();
	}

	public EnterProfile addProfile(Person person, int temperature) {
		for(int i = 0; i < enterProfileList.size(); ++i){
			EnterProfile check = getEnterProfileList().get(i);
			if(Objects.equals(check.getPerson().getName(), person.getName())) {
//				populationCount--;
//				if(check.hasFever()){
//					potentialInfectedCount--;
//				}
//				***WTF Bro???***
				removeProfile(i);
				break;
			}
		}

		EnterProfile pe = new EnterProfile(person, temperature);

		if(pe.hasFever()) {
			potentialInfectedCount++;
		}
		populationCount++;
		enterProfileList.add(pe);
		return pe;
	}
	
	
	public EnterProfile removeProfile(int index) {
		EnterProfile removedPerson = enterProfileList.remove(index);
		if(removedPerson.hasFever()) {
			potentialInfectedCount--;
		}
		populationCount--;
		return removedPerson;
	}
	


	public int getPopulationCount() {
		return populationCount;
	}

	public int getPotentialInfectedCount() {
		return potentialInfectedCount;
	}

	public ArrayList<EnterProfile> getEnterProfileList() {
		return enterProfileList;
	}
}
