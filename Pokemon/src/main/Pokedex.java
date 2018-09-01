package main;

import java.util.ArrayList;

public class Pokedex {
	
	ArrayList<Pokemon> pokedex = new ArrayList<Pokemon>();
	
	public Pokedex(Pokemon pokemon) {
		pokedex.add(pokemon);
	}
	
	public Pokedex(ArrayList<String> pokelist) {
		for (String i : pokelist) {
			Pokemon pokemon = new Pokemon(i);
			pokedex.add(pokemon);
		}
	}
	
	public void addPokemon(Pokemon pokemon) {
		 pokedex.add(pokemon);
	}

	public ArrayList<Pokemon> getPokedex() {
		return pokedex;
	}
	
	//find pokemon with 1 type
	public ArrayList<Pokemon> listTypes(String type) {
		ArrayList<Pokemon> typeList = new ArrayList<Pokemon>();
		for (Pokemon p: this.pokedex) {
			if (p.getType1().equals(type) || p.getType2().equals(type)) {
				typeList.add(p);
			}
		}
		return typeList;
	}
	
	//find pokemon with 2 types
	public ArrayList<Pokemon> listTypes(String type1, String type2) {
		ArrayList<Pokemon> typeList = new ArrayList<Pokemon>();
		for (Pokemon p: this.pokedex) {
			if (p.getType1().equals(type1) && p.getType2().equals(type2)) {
				typeList.add(p);
			}
		}
		return typeList;
	}
	
}
