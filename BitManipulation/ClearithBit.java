package BitManipulation;

public class ClearithBit {

    public static int clearIthbit(int n, int i){
int bitmask=~(i<<i);
return n&bitmask;
    }
    public static void main(String[] args) {
        System.out.println(clearIthbit(10,1));
    }
}
