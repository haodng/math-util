/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math.util;

import haodng.util.MathUtility;

/**
 *
 * @author yoshidamatt
 */
public class MathUtil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        long expected = 120; // hy vọng thấy 120 nếu gọi 5!
        long actual = MathUtility.getFactorial(5);
        // in ra để kiểm tra giữ sự khớp nhau và cái ta làm
        System.out.println("5! expected: " + expected);
        System.out.println("5! actual: " + actual);
       
        //tiếp tục cho các tình huống khác 6! 7! 21! -5! 0!,....
        // các tình huống test ta gọi là test cases
        //về lý thuyết ta phải test hết các tình huống....
        //về thực hành : kì 5 sẽ rõ SWT301
        
        System.out.println("6!: 720, actual: " + MathUtility.getFactorial(6));
        System.out.println("0!: 1, actual: " + MathUtility.getFactorial(0));
        //tao kì vọng mày ném về ngoại lệ phải là ngoại lệ
        //IllegalAgrumentException nếu tao cố tình, người xài hàm
        // này của t đưa tham số amm, tham số >20
        System.out.println("expected: IllegelAgrumentException: " + MathUtility.getFactorial(-5));
        System.out.println("chuc cuoi tuan t9 vui ve");
        
    }
}
