package algrithom;

public class SortTest {
	
	public void insertSort(int[] a){
		for (int i=0;i<a.length;i++){
			for(int j=i;j>0;j--){
				if(a[j]<a[j-1]){
					int temp = a[j];
					a[j] = a[j-1];
					a[j-1] = temp;
				}
			}
			this.printlist(a);
			System.out.println();
		}
	}
	
    //冒泡排序，两两比较，再相互交换位置
    public void BubbleSort(int[] a) {
        for (int i = 0; i < a.length; i++)
        {
            for (int j = i+1; j < a.length; j++) 
            {
                if (a[i] > a[j]) 
                {
                    // 交换位置
                    int cos = a[i];
                    a[i] = a[j];
                    a[j] = cos;
                }
            }
            this.printlist(a);
			System.out.println();
        }
    }
    
    public void QuickSort(int[] a, int i, int j){
    	int left = i;
    	int right = j;
    	int temp = 0;
    	if(left <= right){
    		temp = a[left];
    		while(left != right){
    			while(right > left && a[right] >= temp)
    				right--;
    			a[left] = a[right];
    			
    			while(left < right && a[left]<=temp)
    				left++;
    			a[right] = a[left];
    		}
    		a[right] = temp;
    		this.QuickSort(a, i, left-1);
    		this.QuickSort(a, right+1, j);
    	}
    }
    
    public void selectSort(int[] a){
    	for(int i=0;i<a.length;i++){
    		for(int j=i;j<a.length;j++){
    			if(a[j]<a[i]){
    				int temp = a[j];
    				a[j] = a[i];
    				a[i] = temp;
    			}
    		}
    		this.printlist(a);
    		System.out.println();
    	}
    }
	
	public void printlist(int[] a){
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}

	public static void main(String[] args) {
		int[] a = {8,3,2,5,9,3,6};
		SortTest test = new SortTest();
		test.insertSort(a);
		
		System.out.println("##########################");
		int[] a2 = {8,3,2,5,9,3,6};
		test.BubbleSort(a2);
		
		System.out.println("##########################");
		int[] a3 = {8,3,2,5,9,3,6};
		test.QuickSort(a3, 0, a3.length-1);
		test.printlist(a3);
		System.out.println();
		
		System.out.println("##########################");
		int[] a4 = {8,3,2,5,9,3,6};
		test.selectSort(a4);
		test.printlist(a4);
		
	}

}
