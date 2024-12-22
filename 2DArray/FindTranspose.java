public class FindTranspose {

    public static void getTranspose(int [][] matrix){

int matrix2[][]=new int [matrix[0].length][matrix.length];


for(int i=0; i<matrix2.length; i++){
    for(int j=0; j<matrix2[0].length; j++){
        matrix2[i][j]=matrix[j][i];
    }
}
        for(int i=0; i<matrix2.length; i++){
            for(int j=0; j<matrix2[0].length; j++){
                System.out.print(matrix2[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,3},{4,5,6}};
        getTranspose(matrix);
    }
}
