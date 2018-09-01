package main;

public class Pokemon {
	
	private String numb;
	private String name;	
	private String type1;	
	private String type2;	
	private String total;	
	private String hp;
	private String attack;	
	private String defSp;
	private String atkSp;
	private String def;
	private String speed;	
	private String generation;	
	private String legendary;
	
	
	public Pokemon(String name, String type1, String hp) {
		this.name = name;
		this.type1 = type1;
		this.hp = hp;
		this.type2 = "";
	}

	public Pokemon(String pokeString) {
		String[] st = pokeString.split(","); 
        int i=0;
        this.numb = st[i++];
    	this.name = st[i++];
    	this.type1 = st[i++];
    	this.type2 = st[i++];
    	this.total = st[i++];
    	this.hp = st[i++];
    	this.attack = st[i++];
    	this.defSp = st[i++];
    	this.atkSp = st[i++];
    	this.def = st[i++];
    	this.speed = st[i++];
    	this.generation = st[i++];
    	this.legendary = st[i++];
	}

	public String toString() {
		if (this.type2.equals("")) {
			return this.name + " : " + this.type1 + " : HP-" + this.hp;
		} else {
			return this.name + " : " + this.type1 + " : " + this.type2 + " : HP-" + this.hp;
		}
	}

	public String getNumb() {
		return numb;
	}

	public String getName() {
		return name;
	}

	public String getType1() {
		return type1;
	}

	public String getType2() {
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
	
	
}
