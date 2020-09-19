package bpg.br.facamp.COM738;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.Random;

public class Ga {
	
 public static Individual chromosomes[];	
 private static int popSize;
 private static int product[];
 private static int qdtProduct;
 static Random r = new Random();
 static Individual badass[] = new Individual[2];
 static Individual _newGeneration[] = new Individual[popSize];
 private static int newPopSize;
 private static Fitness fitness;
 //static Product prod;
 
 

 	public static void createChromo(Fitness fitness) {
	 chromosomes = new Individual[popSize];
	 int indexPermutation[] = mainBIN.getProducts();
	 for (int i = 0; i < chromosomes.length; i++) {
		 indexPermutation = nextPermutation(indexPermutation);
		 //Crio novo invidividuos com produtos em posições diferentes (melhores), através da permutação
		 //Quanto mais individuos eu criar, melhor vai ser a solução
		 chromosomes[i] = new Individual(indexPermutation, fitness);
	}
	 viewPopulation();
 	}
	//Codificação por permutação
	//A codificação aqui neste problema, faz correções para que os cromossomos
	//fiquem consistentes, contendo uma sequência real
 	public static int[] nextPermutation(int permutation[]) {
	
	 int newPermutation[] = new int[permutation.length];
	 for (int i = 0; i < newPermutation.length; i++) {
		newPermutation[i] = permutation[i];
	}
	 
	 for (int i = 0; i < newPermutation.length; i++) {
		int pos = r.nextInt(newPermutation.length);
		int pos1 = newPermutation[i];
		newPermutation[i] = newPermutation[pos];
		newPermutation[pos] = pos1;
		System.out.println( "Permutação: " + i + Arrays.toString(newPermutation));
		
	 }
	
	return newPermutation;
 }
	
 public static Individual[] newGeneration() {
	newPopSize = popSize;
	//System.out.println("Pop" + popSize);
	//System.out.println("Nova pop: " + newPopSize);
	
	while(newPopSize != 0) {
		newPopSize--;
		selectionParent();
		crossover();
	
	}
	return _newGeneration;
	
 }
 
 public static void selectionParent() {
	 
	 int badassOne = r.nextInt(popSize);
	 int badassTwo = r.nextInt(popSize);
	 
	 if(chromosomes[badassOne].fitness <= chromosomes[badassTwo].fitness) {
		 badass[0] = chromosomes[badassOne];
	 } else {
		 badass[0] = chromosomes[badassTwo];
	 }
	 
	 if(chromosomes[badassOne].fitness <= chromosomes[badassTwo].fitness) {
		 badass[1] = chromosomes[badassTwo];
	 } else {
		 badass[1] = chromosomes[badassOne];
	 }
	 
 }
 
 public static void crossover() {
	 qdtProduct = mainBIN.products.length;
	 int newPermutation[] = new int[qdtProduct];
	 //System.out.println(qdtProduct);
	 
	 ArrayList<Integer> badassOne = new ArrayList<>();
	 ArrayList<Integer> badassTwo = new ArrayList<>();
	 
	 //LinkedList<Integer> badassOne = new LinkedList<>();
	 //LinkedList<Integer> badassTwo = new LinkedList<>();
	 
	 
	
	  
	 for (int i = 0; i < badass[0].permutation.length; i++) {
	//System.out.println(badassOne.contains(badass[0].permutation[i]));
    //Verifica a existência do elemento especificado na lista fornecida
		 if(!badassOne.contains(badass[0].permutation[i])) {
			
			badassOne.add(badass[0].permutation[i], 1);
			badassTwo.add(badass[0].permutation[i], 1);
		} else {
			badassOne.add(badass[0].permutation[i], badassOne.get(badass[0].permutation[i])+1);
			badassTwo.add(badass[0].permutation[i], badassTwo.get(badass[0].permutation[i])+1);
		}
		
	}
	 int k = 0;
	 for (int i = 0; i < badass[0].permutation.length; i++) {
		if(badassOne.get(badass[0].permutation[i]) <= badassTwo.get(badass[0].permutation[i])) {
			newPermutation[k] = badass[0].permutation[i];
			k++;
		} 
		badassOne.add(badass[0].permutation[i], badassOne.get(badass[0].permutation[i])-1);
		if(badassOne.get(badass[1].permutation[i]) >= badassTwo.get(badass[1].permutation[i])) {
			newPermutation[k] = badass[1].permutation[i];
			k++;
		}
		badassTwo.add(badass[1].permutation[i], badassTwo.get(badass[1].permutation[i])-1);
			
		}
		
	 //Processo de mutação 
	 //Escolho dois numeros aleatorios e troco entre si
	 int p1 = r.nextInt(newPermutation.length);
	// System.out.println(p1);
	 int p2 = r.nextInt(newPermutation.length);
	// System.out.println(p2);
	 int t = newPermutation[p1];
	// System.out.println(t);
	 newPermutation[p1] = newPermutation[p2];
	 newPermutation[p2] = t;
	 
	 //Criando um novo Cromossomo do inviduo melhorado 
	 Individual newChromosome = new Individual(newPermutation, fitness);
	 _newGeneration[newPopSize] = newChromosome;
	 
 }
 
 //Retorna e seleciona o menor numero de caixas 
 public static int getMinimumBoxes() {
	 int minBoxes = Integer.MAX_VALUE;
	 for (int i = 0; i < chromosomes.length; i++) {
		if(chromosomes[i].fitness < minBoxes) {
			minBoxes = chromosomes[i].fitness;
		}
		
	}
	return minBoxes;
 }
 

 
 public static void viewPopulation() {
	 for (int i = 0; i < popSize; i++) {
		for (int j = 0; j < chromosomes[i].permutation.length; j++) {
			System.out.println(chromosomes[i].permutation[j] + " ");
		}
		System.out.println("Fitness: " + chromosomes[i].fitness);
	}
 }
 
 public static Individual[] getChromosomes() {
	return chromosomes;
}

public static int getPopSize() {
	return popSize;
}

public static int[] getProduct() {
	return product;
}

public static int getQdtProduct() {
	return qdtProduct;
}

public static Random getR() {
	return r;
}

public static Individual[] getBadass() {
	return badass;
}

public static Individual[] get_newGeneration() {
	return _newGeneration;
}

public static int getNewPopSize() {
	return newPopSize;
}

public static Fitness getFitness() {
	return fitness;
}

public static void setChromosomes(Individual[] chromosomes) {
	Ga.chromosomes = chromosomes;
}

public static void setPopSize(int popSize) {
	Ga.popSize = popSize;
}

public static void setProduct(int[] product) {
	Ga.product = product;
}

public static void setQdtProduct(int qdtProduct) {
	Ga.qdtProduct = qdtProduct;
}

public static void setR(Random r) {
	Ga.r = r;
}

public static void setBadass(Individual[] badass) {
	Ga.badass = badass;
}

public static void set_newGeneration(Individual[] _newGeneration) {
	Ga._newGeneration = _newGeneration;
}

public static void setNewPopSize(int newPopSize) {
	Ga.newPopSize = newPopSize;
}

public static void setFitness(Fitness fitness) {
	Ga.fitness = fitness;
}


// private static void mutation() {
//	 int p1 = r.nextInt(new)
// }
	
}

