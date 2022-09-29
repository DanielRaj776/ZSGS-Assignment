package problem;

class MidelOfTwoArray {
    static double findMedianSortedArrays(int[] nums1, int[] nums2) {
	int totalLength = nums1.length + nums2.length;
	int midel1, midel2;
	midel1 = midel2 = totalLength / 2;
	double num1 = 0, num2 = 0;
	if (totalLength % 2 == 0)
	    midel1 = midel1 - 1;
	for (int i = 0, j = 0, k = 0; i < nums1.length || j < nums2.length; k++) {
	    if (i == nums1.length) {
		if (k == midel1 && k == midel2) {
		    num1 = num2 = nums2[j];
		} else if (k == midel2) {
		    num2 = nums2[j];
		} else {
		    num1 = nums2[j + (midel1 - k)];
		    num2 = nums2[j + (midel2 - k)];
		}
		break;
	    } else if (j == nums2.length) {
		if (k == midel1 && k == midel2) {
		    num1 = num2 = nums1[i];
		} else if (k == midel2) {
		    num2 = nums1[i];
		} else {
		    num1 = nums1[i + (midel1 - k)];
		    num2 = nums1[i + (midel2 - k)];
		}
		break;
	    } else {
		if (nums1[i] <= nums2[j]) {
		    if (k == midel1) {
			num1 = nums1[i];
		    }
		    if (k == midel2) {
			num2 = nums1[i];
			break;
		    }
		    i++;
		} else {
		    if (k == midel1) {
			num1 = nums2[j];
		    }
		    if (k == midel2) {
			num2 = nums2[j];
			break;
		    }
		    j++;
		}
	    }
	}
	return (num1 + num2) / 2;
    }
    public static void main(String[] args) {
	int[] arr1 = {1, 2};
	int[] arr2 = {3, 4};
	System.out.println(findMedianSortedArrays(arr1, arr2));
    }
}
