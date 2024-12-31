/**
 * you have a floor 2xn where 2 is height and n i sbreath
 * you have a tile which is 2x1 means
 * you have to find the number of ways to place the tile so that the whole flore is get coverd
 */
public class _07tilePlace_problem {

    public static int findWay(int n){
        if(n == 1 || n==0){
            return 1;
        }

        return findWay(n-1) + findWay(n-2);
    }
    public static void main(String[] args) {
        System.out.println(findWay(2));
    }
}
