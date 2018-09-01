package test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.jupiter.api.Test;

import main.FileIO;
import main.Pokedex;
import main.Pokemon;

class PokedexTest {

	@Test
	void PokedexTest1() throws IOException {
		
		Pokedex ash = new Pokedex(FileIO.readPokeFile());
		
		FileIO.exportPokeList(ash.getPokedex(),"pokedex.txt");
		FileIO.exportPokeList(ash.listTypes("Fire"),"Fire.txt");
		FileIO.exportPokeList(ash.listTypes("Water"),"Water.txt");
		FileIO.exportPokeList(ash.listTypes("Grass"),"Grass.txt");
	}


}
