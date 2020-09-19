package bpg.br.facamp.COM738;

public class Box extends Fitness {

	private int capacity = 0;

	public Box(int capacity) {
		super();
		this.capacity = capacity;
	}
	
	
	@Override
	public int getMinBoxes(int[] boxes) {
		// TODO Auto-generated method stub
		int boxSpace[] = new int[boxes.length];
		int boxes_ = 0;
		for (int i = 0; i < boxSpace.length; i++) {
			boxSpace[i] = this.capacity;
		}
		for (int i = 0; i < boxes.length; i++) {
			
			int j;
			for (j = 0; j < boxes_; j++) {
				if(boxSpace[j] >= boxes[i]) {
					boxSpace[j] -= boxes[i];
					break;
				}
			}
			
			if(j == boxes_) {
				boxes_++;
				boxSpace[boxes_-1] -= boxes[i];
			
			}
		}
	 return boxes_;
		
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}


	
	
	
}
