package bpg.br.facamp.COM738;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class mainBIN {

	private static Fitness fitness;
	static int products[] = new int[200];
	static Product product = new Product(products);
	static int capacity;

	public static int[] getProducts() {
		return products;
	}

	public static void setProducts(int[] products) {
		mainBIN.products = products;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
	
		products[0] = 81;
		products[1] = 57;
		products[2] = 36;
		products[3] = 132;
		products[4] = 51;
		products[5] = 183;
		products[6] = 30;
		products[7] = 45;
		
		products[8] = 15;
		products[9] = 3;
		products[10] = 30;
		products[11] = 75;
		products[12] = 96;
		products[13] = 12;
		products[14] = 147;
		products[15] = 48;
		products[16] = 75;
		
		products[17] = 24;
		products[18] = 66;
		products[19] = 39;
		products[20] = 66;
		products[21] = 3;
		products[22] = 66;
		products[23] = 90;
		products[24] = 18;
		products[25] = 12;
		products[26] = 33;
		
		products[27] = 6;
		products[28] = 3;
		
		products[29] = 135;
		products[30] = 39;
		products[31] = 42;
		products[32] = 12;
		products[33] = 15;
		products[34] = 75;
		products[35] = 138;
		products[36] = 33;
		products[37] = 45;
		products[38] = 12;
		
		products[39] = 72;
		products[40] = 9;
		products[41] = 15;
		products[42] = 162;
		products[43] = 45;
		products[44] = 177;
		products[45] = 6;
		products[46] = 111;
		products[47] = 111;
		products[48] = 3;
		products[49] = 57;
		products[50] = 3;
		products[51] = 87;
		products[52] = 84;
		products[53] = 60;
		
		products[54] = 66;
		products[55] = 12;
		products[56] = 30;
		products[57] = 69;
		products[58] = 36;
		products[59] = 12;
		products[60] = 21;
		products[61] = 18;
		products[62] = 63;
		products[63] = 99;
		products[64] = 39;
		products[65] = 12;
		products[66] = 66;
		products[67] = 222;
		products[68] = 87;
		products[69] = 3;
		
		products[70] = 51;
		products[71] = 33;
		products[72] = 24;
		products[73] = 27;
		products[74] = 12;
		products[75] = 15;
		products[76] = 87;
		products[77] = 81;
		products[78] = 69;
		products[79] = 168;
		products[80] = 114;
		products[81] = 69;
		products[82] = 153;
		products[83] = 18;
		products[84] = 9;
		
		products[85] = 21;
		products[86] = 96;
		products[87] = 66;
		products[88] = 36;
		products[89] = 129;
		products[90] = 42;
		products[91] = 12;
		products[92] = 6;
		products[93] = 3;
		products[94] = 63;
		products[95] = 12;
		products[96] = 51;
		products[97] = 78;
		products[98] = 6;
		products[99] = 18;
		products[100] = 93;
		products[101] = 45;
		products[102] = 108;
		products[103] = 15;
		products[104] = 36;
		
		products[105] = 93;
		products[106] = 30;
		products[107] = 9;
		products[108] = 6;
		products[109] = 126;
		products[110] = 36;
		products[111] = 9;
		products[112] = 51;
		products[113] = 6;
		products[114] = 3;
		products[115] = 12;
		products[116] = 45;
		products[117] = 24;
		products[118] = 198;
		products[119] = 9;
		
		products[120] = 9;
		products[121] = 18;
		products[122] = 33;
		products[123] = 45;
		products[124] = 33;
		products[125] = 12;
		products[126] = 108;
		products[127] = 48;
		products[128] = 12;
		products[129] = 3;
		products[130] = 3;
		products[131] = 15;
		products[132] = 36;
		products[133] = 15;
		products[134] = 48;
		products[135] = 45;
		
		products[136] = 33;
		products[137] = 3;
		products[138] = 108;
		products[139] = 15;
		products[140] = 9;
		products[141] = 21;
		products[142] = 42;
		products[143] = 30;
		products[144] = 45;
		products[145] = 33;
		products[146] = 54;
		products[147] = 9;
		products[148] = 228;
		products[149] = 60;
		products[150] = 39;
		products[151] = 9;
		products[152] = 42;
		products[153] = 78;
		products[154] = 18;
		products[155] = 99;
		products[156] = 12;
		products[157] = 36;
		
		products[158] = 30;
		products[159] = 63;
		products[160] = 57;
		products[161] = 27;
		products[162] = 6;
		products[163] = 120;
		products[164] = 30;
		products[165] = 15;
		products[166] = 33;
		products[167] = 12;
		products[168] = 138;
		
		
		products[169] = 9;
		products[170] = 18;
		products[171] = 12;
		products[172] = 24;
		products[173] = 18;
		products[174] = 84;
		products[175] = 78;
		products[176] = 6;
		products[177] = 3;
		products[178] = 78;
		products[179] = 24;
		products[180] = 150;
		products[181] = 60;
		products[182] = 45;
		products[183] = 21;
		
		products[184] = 15;
		products[185] = 24;
		products[186] = 27;
		products[187] = 81;
		
		products[188] = 87;
		products[189] = 54;
		products[190] = 87;
		products[191] = 3;
		
		products[192] = 51;
		products[193] = 9;
		products[194] = 21;
		products[195] = 42;
		products[196] = 120;
		products[197] = 261;
		products[198] = 18;
		products[199] = 261;
		
	
	
		readCapacity();
		//readWeights();
		System.out.println("Capacidade da(s) caixa(s): " + capacity);
		Ga.setPopSize(100);
		int generation = 100;
		fitness = new Box(capacity);
		Ga.createChromo(fitness);
		int minBox = Ga.getMinimumBoxes();
		System.out.println(product.toString());
	
		System.out.println("Nº minimo de caixas são (MELHOR): " + minBox );
		
		while(generation != 0) {
			//System.out.println("Quantidade de gerações: " + generation);
			generation--;	
			Ga.chromosomes = Ga.newGeneration();
			Ga.viewPopulation();
			int minBoxEvolve= Ga.getMinimumBoxes();
			if(minBoxEvolve < minBox) {
				minBoxEvolve = minBox;
			}
		}
		
	}

	private static void readCapacity() {
		File dir = new File("/home/matos/eclipse-workspace/gaAlgorithm");
		File file = new File(dir, "p04_c.txt");
		try {
			FileReader fileReader = new FileReader(file);

			BufferedReader bufferedReader = new BufferedReader(fileReader);

			String line = "";

			while ((line = bufferedReader.readLine()) != null) {
				// System.out.println(line);
				capacity = Integer.parseInt(line);
				System.out.println("c" + capacity);
			}

			fileReader.close();
			bufferedReader.close();
		} catch (IOException e) {
			System.err.println("Erro ao abrir o arquivo");
		}
	}

//	private static void readWeights() {
//		try {
//            FileReader fileReaderC = new FileReader("COM73804_c.txt");
//            BufferedReader bufferedReaderC = new BufferedReader(fileReaderC);
//            String line = bufferedReaderC.readLine();
//            capacity = Integer.parseInt(line);
//            bufferedReaderC.close();
//            String weight;
//            roduto = new ArrayList<>();
//
//            // Reading weights and profits
//            FileReader fileReaderW = new FileReader("COM738_w.txt");
//            BufferedReader bufferedReaderW = new BufferedReader(fileReaderW);
//            while ((weight = bufferedReaderW.readLine()) != null) {
//                weight = weight.trim();
//                produto.add(new Produto(0, Integer.parseInt(weight)));
//            }
//            bufferedReaderW.close();
//
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }
//	}

}
