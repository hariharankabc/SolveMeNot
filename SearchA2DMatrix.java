class Solution {
    // problems/search-a-2d-matrix/
    public boolean searchMatrix(int[][] matrix, int target) {
        int noOfColumns = matrix[0].length;
        int startIndex = 0;
        int endIndex = matrix.length - 1;
        while(startIndex <= endIndex){
            int index = startIndex + (endIndex - startIndex) / 2;
            if((matrix[index][0] <= target)&&(matrix[index][noOfColumns-1] >= target)){
                return binarySearch(matrix[index], target);
            }else if(matrix[index][0]>target){
                endIndex = index -1;
            }else if(matrix[index][0]<target){
                startIndex = index +1;
            }
        }
        return false;
    }
    boolean binarySearch(int arr[], int x){
	    int l = 0, r = arr.length - 1;
	    while (l <= r) {
		    int m = l + (r - l) / 2;
			if (arr[m] == x)
				return true;
			if (arr[m] < x)
				l = m + 1;
			else
				r = m - 1;
	    }
	    return false;
    }
}
