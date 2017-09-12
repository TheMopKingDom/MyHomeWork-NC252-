package th.ac.utcc.cpe.mopMo.bubblesortArray;

public class Bubblehome_Mix {
	private double [] element;
	private int eSize;
	
	public Bubblehome_Mix(int size){
		if(size >0)
			this.element = new double [size];
		else
			// main is 10
			this.element = new double [size];
		
		eSize = 0;
		
	}
	public void insert(double e){
		this.element[eSize] = e;
		eSize++;
	}
	public void show(){
		for(int i=0;i<eSize;i++){
			System.out.println(this.element[i] +" ");
		}
		System.out.println("");
	}
	public void bubbleSort(){
		int in,out;
		for(out=eSize-1 ; out>0;out--){
			for(in=0;in<out;in++)
			if(this.element[in]<this.element[in+1]){
				this.swap(in,in+1);
			}
		}
	}
	private void swap(int left, int right){
		double temp = this.element[right];
		this.element[right] = this.element[left];
		this.element[left] = temp;
	}

	
	public static void main (String args[]){
			int max= 20;
			Bubblehome_Mix bubble = new Bubblehome_Mix(max);
			
			bubble.insert(87.45);
			bubble.insert(43);
			bubble.insert(98);
			bubble.insert(32.12);
			bubble.insert(91);
			bubble.insert(78);
			bubble.insert(26.64);
			bubble.insert(12);
			bubble.insert(12.32);
			
			System.out.println("Original Order : ");
			bubble.show();
			
			bubble.bubbleSort();
			System.out.print(" Sorted Order: ");
			bubble.show();
	}
}
