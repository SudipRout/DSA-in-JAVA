public class SearchInSortedMatrix {
    public static void main(String[] args) {
        int matrix[][] = {{10, 20, 30, 40}, 
                          {15, 25, 35, 45}, 
                          {27, 29, 37, 48}, 
                          {32, 33, 39, 50}};
        int key = 33;
        staircaseSearch(matrix, key);
    }

    public static boolean staircaseSearch(int matrix[][], int key) {
        int row = 0;
        int column = matrix[0].length-1;
        
        while (row < matrix.length && column >= 0) {
            if (matrix[row][column] == key) {
                System.out.println("Found at: ("+row+","+column+")");
                return true;
            }
            else if (matrix[row][column] > key) { //key < cell value
                column--;                         //move left
            }
            else {                                //key > cell value
                row++;                            //move down
            }
        }
        System.out.println("Not Found");
        return false;
    }
}