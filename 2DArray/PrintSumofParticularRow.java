public class PrintSumofParticularRow {
    public static int getSum(int matrix[][], int targetedRow){
int sum=0;

for(int i=0; i<matrix[targetedRow].length; i++){
    sum+=matrix[targetedRow][i];
}
return sum;
    }
    public static void main(String[] args) {
        int[][] matrix={{1,4,9},{11,4,3},{2,2,3}};
        int targetedRow=1;
        System.out.println("The sum of the targeted Row "+targetedRow+" is:" +  getSum(matrix,targetedRow));
      
    }
}
