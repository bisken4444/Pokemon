package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import enums.PokeType;
import main.Pokemon;

class PokemonTest {

	@Test
	void PokemonTest1() {
		Pokemon Ivy = new Pokemon("Ivysaur","Grass","60");
		System.out.println(Ivy);
		assertEquals(Ivy.getName(),"Ivysaur");
		assertEquals(Ivy.getHp(),"60");
		assertEquals(Ivy.getType1(),PokeType.GRASS);	
	}
	
	@Test
	void PokemonTest2() {
		String pokeString = "3,Venusaur,Grass,Poison,525,80,82,83,100,100,80,1,False";
		Pokemon Ven = new Pokemon(pokeString);
		System.out.println(Ven);
		assertEquals(Ven.getName(),"Venusaur");
		assertEquals(Ven.getTotal(),"525");
		assertEquals(Ven.getGeneration() ,"1");
		assertEquals(Ven.getType1(),PokeType.GRASS);
		assertEquals(Ven.getType1(),PokeType.POISON);
	}

}
