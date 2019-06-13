package thinkinginjava.demo.com.test;

/**
 * @author luyu
 * @ClassName RecursiveCall
 * @description: TODO
 * @date 2019/6/10 16:28
 * @Version 1.0
 */
public class RecursiveCall {
    static  int count = 0;
    public static void recur(int i, int n)
    {
        count++;
        System.out.print("B>");
        for(int k = i; k <= n; k++){
            System.out.print("I>");
            recur(k + 1, n);
            System.out.print("R>");

        }
    }

    public static void main(String[] args) {
        recur(0,4);
        System.out.println("");
        System.out.println("COUNT:"+count);
    }
}
