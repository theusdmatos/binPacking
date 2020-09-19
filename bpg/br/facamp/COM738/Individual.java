package bpg.br.facamp.COM738;

import java.util.Arrays;

public class Individual {

	//Cromossomo do individuo 
	
	
	public int fitness;
	//Representa os produtos "permutados" com as correções e consistentes
	public int permutation[]; 
	public static Fitness fitness_;
	
	public Individual(int[] permutation, Fitness fit) {
		super();
		this.permutation = permutation;
		this.fitness_  = fit;
		this.fitness = fit.getMinBoxes(this.permutation);
	}
	

}
