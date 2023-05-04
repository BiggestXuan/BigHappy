

/**
 *  @Author Biggest_Xuan
 *  2023/05/04
 */

public class Main {
    public static String num = "2023048";
    public static int[][] ticket = new int[][]{
            {3,11,14,22,29,3,8},
            {1,12,20,26,33,7,12},
            {5,7,12,25,30,9,11},
            {9,16,24,27,31,5,9},
            {8,15,19,24,32,1,4}
    };

    public static void main(String[] args) throws Exception {
        System.out.println("Money: "+Utils.getTotalMoney());
    }
}
