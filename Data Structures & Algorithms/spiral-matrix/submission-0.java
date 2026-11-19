class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();

        int top = 0, right = matrix[0].length;
        int bottom = matrix.length, left = 0; 

        while(top < bottom && left < right){

            //top-row
            for(int i = left; i<right; i++){
                res.add(matrix[top][i]);
            }
            top++;
            //right-side-col
            for(int i = top; i<bottom; i++){
                res.add(matrix[i][right-1]);
            }
            right--;
            if (!(left < right && top < bottom)) {
                break;
            }
            //bottom-row
            for(int i = right-1; i>=left ; i--){
                res.add(matrix[bottom-1][i]);
            }
            bottom--;
            //left-side-col
            for(int i = bottom-1; i>=top; i--){
                res.add(matrix[i][left]);
            }
            left++;
        }
        return res;
    }
}
