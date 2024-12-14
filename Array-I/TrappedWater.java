public class TrappedWater {
    public static int calculateTrapped(int [] height){
//calculate leftMax with helper Array
int maxLeft[]=new int[height.length];
int max=Integer.MIN_VALUE;
for(int i=0; i<height.length; i++){   
  max=Math.max(height[i],max );
    maxLeft[i]=max;
}
//calculate rightMax
int [] rightMax=new int[height.length];
int max1=Integer.MIN_VALUE;
for(int i=height.length-1; i>=0; i--){
max1=Math.max(max1, height[i]);
rightMax[i]=max1;
}
//calulate trapped water
int water=0;

for(int k=0; k<height.length; k++){
   int waterLevel= Math.min(maxLeft[k], rightMax[k]);
water=water+(waterLevel-height[k]);

}

return water;
    }

    public static void main(String[] args) {
        int[] height={0,1,0,2,1,0,1,3,2,1,2,1};
       System.out.println(calculateTrapped(height));
    }
}
