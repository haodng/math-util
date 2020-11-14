/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package haodng.utill;

/**
 *
 * @author yoshidamatt
 */
public class MathUtility {
    //làm bộ thư viện fake giống y chang math
    //Math.PI, .abs() .sqrt() .pow(a,b) a^b
    // phàm là thư viện thì sẽ xài static khi không cân lưu info cho riêng mình
    // còn thư viện mà vẫn cần lưu info riêng, thì vẫn non-static như bth
    
    public static final double PI=3.1415;
    
    //tiện ích tính giai thừa n!=1.2.3....n
    //n phải là từ 0 trở lên
    // 0! = 1!=1
    //âm giai thừa vô nghĩa
    //giai thừa tăng cực nhanh, 21! long kh chứa đc
    //bài này mình sẽ chặn giai thừa từ 0..20
    //âm hoặc 21 chửi , kh thèm tính
    public static long getFactorial(int n){
        if(n<0 || n>20)
            throw new IllegalArgumentException("n must be between 0..20");
        if(n == 0 || n == 1)
            return 1; // dac biet, return luon
        //dua nao viet else o day, tru diem
        // mac nhien CPU đến được ở đây la hiểu răng n=2..20
        long result =1;
        for(int i=2 ; i<=n ; i++){
                result *=i;
        }
        return result;
    }
}