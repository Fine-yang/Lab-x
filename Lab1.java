/**
 * For more information, contact: 
 *      13302010032@fudan.edu.cn | 13302010020@fudan.edu.cn | 13302010006@fudan.edu.cn
 * 
 */
public class Lab1{
    /**
     * In this block, you should write the code to implement the bitsum function for Integer.
     * eg. bitsum(123)=1+2+3=6
     */
    public static int bitsum(int x){
        // your code here
        return 0;
    }

    /**
     * In this block, you should write the code to implement the bitsum function for String consisting of
     *      only lowercase letters.
     * Attention: you may refer to the ASCII table, but it does not mean that you can directly add up two 
     *      characters to solve the problem.
     * eg. bitsum(abc)='a'+'b'+'c'=1+2+3=6
     */
    public static int bitsum2(String s){
        // your code here
        return 0;
    }

    /**
     * In this block, you should write the code to implement the bitsum function for String consisting of
     *      both lowercase letters and arabic numbers.
     * eg. bitsum(abc)='a'+'0'=1+0=1
     */
    public static int bitsum3(String s){
        // [OPTIONAL]your code here
        return 0;
    }

    public static void main(String[] args){
        assert bitsum(123)==6;
        assert bitsum(999)==27;
        assert bitsum(123456789)==45;
        System.out.println("Congratulations! You solve problem 1!");

        assert bitsum2("a")==1;
        assert bitsum2("abc")==6;
        assert bitsum2("zzz")==78;
        System.out.println("Congratulations! You solve problem 2!");
 
        assert bitsum3("a0000") = 1;
        assert bitsum3("09bc1") = 15`
        System.out.println("Execellent! You solve problem 3!");
    }
}
