
public class SpiralMatrix {


    public static void printSpiral(int spiral[][]){
        int startRow=0;
        int startCol=0;
        int endRow=spiral.length-1;
        int endCol=spiral[0].length-1;
        while (startRow<=endRow && startCol<=endCol) {
            //top
            for(int j=startCol; j<=endCol; j++){
                System.out.print(spiral[startRow][j]+" ");
            }
            //right
            for(int i=startRow+1; i<=endRow; i++){
                System.out.print(spiral[i][endCol]+" ");
            }
            //bottom
            for(int j=endCol-1; j>=startCol; j--){
                if(startRow==endRow){
                    break;
                }
                System.out.print(spiral[endRow][j]+" ");
            }
            //left
            for(int i=endRow-1; i>startRow; i--){
                if(startCol==endCol){
                    break;
                }
                System.out.print(spiral[i][startCol]+" ");
            }


            startRow++;
            startCol++;
            endCol--;
            endRow--;
        }
    }
    public static void main(String[] args) {
        int[][] spiral={
                        {3},
                        {2}
                     
                    };


                    printSpiral(spiral);
    
    }
}