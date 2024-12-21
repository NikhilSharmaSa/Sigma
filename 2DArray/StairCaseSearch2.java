public class StairCaseSearch2 {
    //Bottom to top of left to right approach
    //2nd approach from bottom to top 
    //compplexity is O(m+n)

    public static void stairCase(int matrix[][], int key){
        int endRow=matrix.length-1;
        int startCol=0;
        while (endRow>=0 && startCol<=matrix[0].length) {
            if(matrix[endRow][startCol]==key){
                System.out.println("The key is found at the cell:("+endRow+","+startCol+")");
                return;
            }else if(matrix[endRow][startCol]>key){
                endRow--;
            }else{
                startCol++;
            }
            
        }
        System.out.println("the key is not found");
    }
    public static void main(String[] args) {
        int[][] matrix={{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        int key=32;
        stairCase(matrix,key);
    }
}
