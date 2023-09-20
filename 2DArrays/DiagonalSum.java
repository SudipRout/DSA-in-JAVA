public class DiagonalSum {
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4}, 
                          {5,6,7,8}, 
                          {9,10,11,12}, 
                          {13, 14, 15, 16}};
        System.out.println(diagonalSum(matrix));
    }

    private static int diagonalSum(int matrix[][]) {
        int sum = 0;
        int row = matrix.length;
        int column = matrix[0].length;
        // for (int i = 0; i < row; i++) {
        //     for (int j = 0; j < column; j++) {
        //         if (i == j) {
        //             sum += matrix[i][j];
        //         }
        //         else if(i+j == row-1) {
        //             sum += matrix[i][j];
        //         }
        //     }
        // }

        for (int i = 0; i < row; i++) {
            //PrimaryDiagonal
            sum+= matrix[i][i];
            //SecondaryDiagonal
            if (i != row-1-i)
                sum+= matrix[i][row-i-1]; //i+j = [row-1]
                                          //j = [row-1-i]
        }
        return sum;
    }
}