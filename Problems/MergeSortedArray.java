package problem;

class MergeSortedArray {
    static void merge(int[] nums1, int m, int[] nums2, int n) {
	int index = 0;
	if(m == 0 && n != 0) {
	    for(int i = 0; i < n; i++) {
		nums1[i] = nums2[i];
	    }
	}else if(n != 0) {
	    for(int i = m - 1,j = nums1.length-1; i >= 0; i--,j--) {
		    nums1[j] = nums1[i];
		    if(i == 0)
			index = j;
	    }
	    for(int i = index, j = 0, k = 0; k < nums1.length; k++) {
		if(i == nums1.length) {
		    nums1[k] = nums2[j];
		    j++;
		}else if(j == n) {
		    nums1[k] = nums1[i];
		    i++;
		}else if(nums1[i] < nums2[j]) {
			nums1[k] = nums1[i];
			i++;
		}else if(nums1[i] == nums2[j]) {
			nums1[k] = nums2[j];
			j++;
			k++;
			nums1[k] = nums1[i];
			i++;
		}else if(nums1[i] > nums2[j]) {
			nums1[k] = nums2[j];
			j++;
		}
	    }
	}
    }
    public static void main(String[] args) {
	int m, n;
	int[] nums1 = {3, 6 , 7, 0, 0, 0};
	m = 3;
	int[] nums2 = {2, 4, 7};
	n = 3;
	
	merge(nums1, m, nums2, n);
	for(int x : nums1) {
		System.out.print(x + " ");
	}
    }

}
