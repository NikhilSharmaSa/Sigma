import java.util.Scanner;

public class Matrices {

    public static void search(int matrix[][] , int key){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j]==key){
                    System.out.println("The key is find at the cell"+"("+i+","+j+")!");
                    break;
                }
            }
            
        }
    }
    public static void main(String[] args) {
        int[][] matrix=new int[3][4];

        System.out.print("Please enter the elements of every cell:-");
        Scanner sc= new Scanner(System.in);
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        sc.close();

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        search(matrix, 16);
    }


}
