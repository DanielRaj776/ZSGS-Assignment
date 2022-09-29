package problem;

class MergeSort {
    
    static int[] merge (int[] arr) {
	int[] temp1;
	int[] temp2;
	int point;
	int[] result = new int[arr.length]; 
	if(arr.length == 0) {
	    System.out.println("array is empty.");
	    return arr;
	}else if(arr.length == 1) {
	    return arr;
	}
	
	if(arr.length % 2 == 1) {
	    point = arr.length/2;
	    temp1 = new int[point +1];
	    for(int i = 0; i <= point; i++) {
		temp1[i] = arr[i];
	    }
	    temp2 = new int[point];
	    for(int i = 0,j = point + 1; j < arr.length;i++, j++	) {
		temp2[i] = arr[j];
	    }
	}else {
	    point = arr.length/2;
	    temp1 = new int[point];
	    for(int i = 0;i < point; i++) {
		temp1[i] = arr[i];
	    }
	    temp2 = new int[point];
	    for(int i = 0, j = point; j < arr.length; j++, i++) {
		temp2[i] = arr[j];
	    }
	}

	temp1 = merge(temp1);
	temp2 = merge(temp2);
	
	for(int i = 0, j = 0, k = 0; (i + j) < (temp1.length + temp2.length);k++) {
	    if(i >= temp1.length) {
		result[k] = temp2[j];
		j++;
	    }else if(j >= temp2.length) {
		result[k] = temp1[i];
		i++;
	    }else {
		if(temp1[i] < temp2[j]) {
			result[k] = temp1[i];
			i++;
		    }else if(temp1[i] == temp2[j]) {
			result[k] = temp1[i];
			i++;	
		    }else {
			result[k] = temp2[j];
			j++;
		    }
	    }
	}
	return result;
    }
    
    public static void main(String[] args) {
	int[] arr1 = {10, 5, 25, 35, 75, 15, 45, 25, 45, 95, 90, 10, 70, 30};
	arr1 = merge(arr1);
	for(int x: arr1) {
	    System.out.print(x + "  ");
	}
    }

}
