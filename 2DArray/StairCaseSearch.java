public class StairCaseSearch {
    //staircase Search in sorted matrix which is completely sorted as well as row wise and column wise also.
    //complexity O(m+n)
    //Approach top to bottom right to left 

    public static void stairCase(int matrix[][],int key){
int startRow=0;

int endRow=matrix.length-1;
int endCol=matrix[0].length-1;

while(startRow<=endRow && endCol>=0){
    if(matrix[startRow][endCol]==key){
        System.out.println("The locations is:("+startRow+","+endCol+")");
        return;
    }
   else  if(matrix[startRow][endCol]>key){
        endCol--;
    }
    else{
startRow++;
    }
 
    


}

System.out.println("Key is not found");
    }
    public static void main(String[] args) {
        int[][] matrix={{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        int key=32;
        stairCase(matrix,key);
    }
}
