public class heapsort {

	public static void main(String[] args) {
		int[]Heap = {5,22,9,76,63,81,48,92,54,28};

		int index = Heap.length/2-1;

		Heapify(Heap,index,Heap.length);
		sort(Heap,Heap.length-1);
		System.out.println("Here is the sort________________");
	}

	private static void sort(int[]Heap, int length) {
		if(length == 0)
			return;

		int temp = Heap[length];
		Heap[length] = Heap[0];
		Heap[0] = temp;
		
		for(int i: Heap)
			System.out.print(i+"  ");
		System.out.println();
		int index = (length)/2-1;
		Heapify(Heap,index, length);
		
		sort(Heap,length-1);
	}


	public static void Heapify(int[]Heap, int index, int Maximumsize) {

		if(index == -1)
			return;
		LargestSwap(Heap,index, Maximumsize);
		for(int i: Heap)
			System.out.print(i+"  ");
		System.out.println();
		Heapify(Heap,index-1, Maximumsize);
	}

	public static void LargestSwap(int[]Heap, int index, int Maximumsize) {
		if(index>Maximumsize)
			return;

		int FixUp = 0;
		if(index*2+2>=Maximumsize) {
			if(index*2+1>=Maximumsize)
				return;
			
			
			else
				FixUp = Heap[index*2+1];
		}
		else
			FixUp = Math.max(Heap[index*2+1], Heap[index*2+2]);

		int I = 0;
		if(FixUp == Heap[index*2+1]) {
			I = index*2+1;
		}
		else 
			I = index*2+2;

		if(Heap[index]<Heap[I]) {
			int temp = Heap[index];
			Heap[index] = Heap[I];
			Heap[I] = temp;
			if(I*2+1<Maximumsize)
				LargestSwap(Heap,I, Maximumsize);
		}
	}


}
