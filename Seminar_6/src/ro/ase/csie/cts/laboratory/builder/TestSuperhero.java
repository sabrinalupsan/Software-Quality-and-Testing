package ro.ase.csie.cts.laboratory.builder;

public class TestSuperhero {
	
	//create the hero
	//Superhero hero = new Superhero();
	//init the hero - don't forget to do it
	
	//still wrong:
	//Superhero hero2 = new Superhero("Superman", 100, false, false, new Weapon(), new Weapon(), new Flying(), new Flying());

	Superhero superman = new Superhero.SuperheroBuilder("Superman", 100).build();
	Superhero joker = new Superhero.SuperheroBuilder("Joker", 200)
			.isVillain()
			.build();
}
