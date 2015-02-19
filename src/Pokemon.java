
public class Pokemon {
	//data fields
	String trainer;
	int numOfPokeballs;
	int badges;
	//constructors
	Pokemon(){
		
	}
	Pokemon(String name, int pokeBalls, int numBadges){
		this.trainer = name;
		this.numOfPokeballs = pokeBalls;
		this.badges =  numBadges;
	}
	//methods
	public String getTrainer(){
		return trainer;
	}
	public int getBadges(){
		return badges;
	}
	public int getNOPB(){
		return numOfPokeballs;
	}
	@Override
	public String toString(){
		return ("The trainer name is "+ this.trainer+ " "+"he has "+this.badges+" "+ "badges and he has "+this.numOfPokeballs+" "+"pokeballs");
	}
	
}
