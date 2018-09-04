package main;

import enums.PokeType;

public class Pokemon {
	
	private String numb;
	private String name;	
	private PokeType type1;	
	private PokeType type2;	
	private String total;	
	private String hp;
	private String attack;	
	private String defSp;
	private String atkSp;
	private String def;
	private String speed;	
	private String generation;	
	private String legendary;
	private String pokeString;
	
	public Pokemon(String name, String type1, String hp) {
		this.name = name;
		this.type1 = PokeType.valueOf(type1.toUpperCase());
		this.hp = hp;
		this.type2 = PokeType.NONE;
	}

	public Pokemon(String pokeString) {
		this.pokeString = pokeString;
		String[] st = pokeString.split(","); 
        int i=0;
        this.numb = st[i++];
    	this.name = st[i++];
    	this.type1 = PokeType.valueOf(st[i++].toUpperCase());
    	this.type2 = PokeType.valueOf(st[i++].toUpperCase());
    	this.total = st[i++];
    	this.hp = st[i++];
    	this.attack = st[i++];
    	this.defSp = st[i++];
    	this.atkSp = st[i++];
    	this.def = st[i++];
    	this.speed = st[i++];
    	this.generation = st[i++];
    	this.legendary = st[i];
	}

	public String toString() {
		if (this.pokeString == null) {
			return this.name + " : " + this.type1 + " : HP-" + this.hp;
		} else {
			return this.pokeString;
		}
	}

	public String getNumb() {
		return numb;
	}

	public String getName() {
		return name;
	}

	public PokeType getType1() {
		return type1;
	}

	public PokeType getType2() {
		return type2;
	}

	public String getTotal() {
		return total;
	}

	public String getHp() {
		return hp;
	}

	public String getAttack() {
		return attack;
	}

	public String getDefSp() {
		return defSp;
	}

	public String getAtkSp() {
		return atkSp;
	}

	public String getDef() {
		return def;
	}

	public String getSpeed() {
		return speed;
	}

	public String getGeneration() {
		return generation;
	}

	public String getLegendary() {
		return legendary;
	}

	public String getPokeString() {
		return pokeString;
	}
	
	
}
