package int101w7;
import calendar.MyMonth;
public class Int101w7 {

    public static void main(String[] args) {
        //demoRandom();
        //demoSwitch();
        demoStringPool();
    }
    static void demoStringPool(){
        var s = new String("This is a string");
        var t = "This is a string";
        System.out.println("s = [" + s + "].");
        System.out.println("s = [" + t + "].");
        System.out.println("s == t ? " + (s.equals(t)));
    }
    static void demoSwitch(){
        try{
            System.out.println("Month 1 = " + MyMonth.getMonth(1) + ".");
            System.out.println("Month 2 = " + MyMonth.getShortMonth(2) + ".");
            System.out.println("Month 3 = " + MyMonth.getMonth(-3) + ".");
        }catch (Exception e){
            System.out.println("There is an exception " + e);
        }
        
    }

    static void demoRandom() {
        int i = 1 + (int) (10 * Math.random());
        System.out.println(i);
        if (i < 5){
            System.out.println("LOW");
        }else{
            System.out.println("HIGH");
        }
    }
}
