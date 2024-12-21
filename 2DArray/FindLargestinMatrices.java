import java.util.Scanner;

public class FindLargestinMatrices {
    public static int findmax(int[][] matrix){
int max=Integer.MIN_VALUE;
for(int i=0; i<matrix.length; i++){
    for(int j=0; j<matrix[0].length; j++){
        if(matrix[i][j]>max){
            max=matrix[i][j];
        }
    }
}

return max;
    }

    //find min
    public static int findmin(int[][] matrix){
        int min=Integer.MAX_VALUE;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j]<min){
                    min=matrix[i][j];
                }
            }
        }
        
        return min;
            }
    public static void main(String[] args) {
        int[][] matrix=new int[3][4];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
               matrix[i][j]=sc.nextInt(); 
            }
        }
        sc.close();
        System.out.println("The Largest Element is the matrix is:"+ findmax(matrix));
        
        System.out.println("The smallest Element is the matrix is:"+ findmin(matrix));
   

    }
}
