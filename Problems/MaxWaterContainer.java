package problem;

class MaxWaterContainer {
    static int maxArea(int[] height) {
	int area = 0;
	int len, hig;
	if(height.length == 0)
	    return area;
	
	for(int i = 0; i < height.length - 1; i++) {
	    for(int j = i + 1; j < height.length; j++) {
		len = j - i;
		hig = height[i] < height[j]? height[i]:height[j];
		if(area < (len * hig))
		    area = len * hig;
	    }
	}
	return area;
    }
    public static void main(String[] args) {
	
	int[] hi = {1, 1};
	
	int result = maxArea(hi);
	
	System.out.println("area : " + result);
    }

}
