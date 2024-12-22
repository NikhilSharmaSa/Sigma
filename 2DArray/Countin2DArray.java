public class Countin2DArray {

    public static int countKey(int[][] matrix, int key){
int count=0;
for(int i=0; i<matrix.length; i++){
    for(int j =0; j<matrix[0].length; j++){
        if(matrix[i][j]==key){
            count++;
        }
    }
}
        return count;
    }
    public static void main(String[] args) {
        int[][] matrix={{6,7,9,7,5,7},{1,7,9,8,9,7}};
        int key=7;
        System.out.println("The count of the key is inside the array: "+ countKey(matrix,key));
    
    }
}
