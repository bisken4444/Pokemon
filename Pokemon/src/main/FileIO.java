package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class FileIO {
	
	// writes a list of pokemon to a file
	public static void exportPokeList(ArrayList<Pokemon> pokeList) throws IOException {
		PrintStream fileStream = new PrintStream(new File("pokedex.txt"));
		for (Pokemon str : pokeList) {
			fileStream.println(str);
		}
		fileStream.close();
	}

	// lets you specify file name, need to include file EXT
	public static void exportPokeList(ArrayList<Pokemon> pokeList, String name) throws IOException {
		PrintStream fileStream = new PrintStream(new File(name));
		for (Pokemon str : pokeList) {
			fileStream.println(str);
		}
		fileStream.close();
	}

	// converts the CSV file into an ARRAYLIST of strings
	// Each element in the ARRAYLIST is a string array of the pokemon information
	public static ArrayList<String> readPokeFile() throws FileNotFoundException {
		File file = new File("pokemon.csv");
		ArrayList<String> pokeList = new ArrayList<String>();

		Scanner scanner = new Scanner(file);
		scanner.nextLine(); // remove header
		
		while (scanner.hasNextLine()) {
			pokeList.add(scanner.nextLine().toString());
		}
		scanner.close();
		return pokeList;
	}
}
