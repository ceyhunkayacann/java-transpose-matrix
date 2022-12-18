public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int[][] tempMatrix = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix.length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix.length; j++){
                tempMatrix[i][j] = matrix[j][i];
                System.out.print(tempMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
