package FirstPractice;

import FirstPractice.methods.MathMethods;
import java.util.Date;

public class Prog3 {
    public static void main(String[] args) {
        int num = getRandomNum();
        System.out.println(num);
        
    }

    public static int getRandomNum() {
        Date date = new Date();
        long time = date.getTime();
        time ^= time >> 13;
        time ^= time << 7;
        time ^= time >>> 20;
        time ^= time << 25;
        return (int)MathMethods.abs(time % Integer.MAX_VALUE);
    }
}
