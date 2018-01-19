package ua.jvlab.smlnk;

/*Concatenating a string with the sum of a real number and an integer*/

/* @version 1.0.0;
 * @date 2018-01-18;
 * @author "$.m.lnk";
 */

public class Main {

    public static void main(String[] args) {
        System.out.println(sumMethod(5.55, 77, "+txt"));
    }

    // concatenation method;
    public static String sumMethod(double a, int b, String c) {
        String d = (a + b) + c;
        return d;

    }
}
