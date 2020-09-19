package bpg.br.facamp.COM738;

import java.util.Arrays;

public class Product {

	private int weight[];

	public Product(int[] weight) {
		super();
		this.weight = weight;
	}

	public int[] getWeight() {
		return weight;
	}

	public void setWeight(int[] weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Produtos [peso =" + Arrays.toString(weight) + "]";
	}

	
	
}
