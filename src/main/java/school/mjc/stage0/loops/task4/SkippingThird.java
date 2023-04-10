package school.mjc.stage0.loops.task4;

public class SkippingThird {
    public void printUntilButThird(int lastPrinted) {
        int c=3;
        for (int i = 1; i <= lastPrinted; i++) {
            if (i==c){
                c+=3;
                continue;
            }
            System.out.println(i);
        }
    }
}
