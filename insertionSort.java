
// @5907101024 : Pacharapon Sreepiachai

public class insertionSort {
	private int [] element ;
	private int eSize ;
	public insertionSort(int size){
		if(size < 0)
			this.element = new int[size];
	else
		this.element = new int [10];
		eSize = 0;
	}

	public void insert(int e){
		this.element[eSize] = e ;
			eSize++ ;
	}

	public void show(){
		for(int i =0 ; i < eSize ; i++){
			System.out.print(this.element[i]+" // ");
		}
			System.out.println(" ");
	}

	public void insertionSort(){
		int out, in, temp ;
	for(out = 1; out<eSize; out++){
		temp = this.element[out];
		for(in  = out ; in> 0 && this.element[in-1]>= temp ; in--){
			this.element[in]=this.element[in-1];
			}
		this.element[in]= temp;
		}
	}
	
	private void swap(int left , int right){
			int temp = this.element[left];
			this.element[left] = this.element[right] ;
			this.element[right] = temp ;

}

	public static void main (String[] args){
		int max = 20 ;
		insertionSort Algor = new insertionSort(max);
				Algor.insert(87);
				Algor.insert(43);
				Algor.insert(95);
				Algor.insert(32);
				Algor.insert(91);
				Algor.insert(78);
				Algor.insert(26);
				Algor.insert(12);
	System.out.print("Original Order insertion : ");
	Algor.show();
		Algor.insertionSort();
	System.out.print("Sorted Order: ");
	Algor.show();
	}
}

// get code form Sirawit
