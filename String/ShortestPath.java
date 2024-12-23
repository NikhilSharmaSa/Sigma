package String;

public class ShortestPath {
    public static float findPath(String str){

int x=0;
int y=0;
for(int i=0; i<str.length(); i++){
switch (str.charAt(i)) {
    case 'W':
        x-=1;
        break;
        case 'E':
        x+=1;
        break;
        case 'N':
        y+=1;
        break;
        case 'S':
        y-=1;
        break;

    default:
        break;
}

}

        return (float)Math.sqrt((x*x)+(y*y));
    }
    public static void main(String[] args) {
        String str="WNEENESENNN";
     
       System.out.println(findPath(str));

    }
}
