package bpg.br.facamp.COM738;

import java.util.ArrayList;



public class BoxManager {

	private static ArrayList<Box> filled = new ArrayList<Box>();
	
	public static int numberBox() {
		return filled.size();
	}
	
}
