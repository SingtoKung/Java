public class Array2D {
    public static void main(String[] args) {
         
        int[][] matrix = {
            {1,2,3}, 
            {4,5,6}, 
            {7,8,7}
        };

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j]+ "\t");
            }
            System.out.println();
        }
    }
}
