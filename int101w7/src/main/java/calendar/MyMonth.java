package calendar;

public final class MyMonth {
    private static final String M01 = "January";
    private static final String M02 = "February";
    private static final String M03 = "March";
    private static final String M04 = "April";
    
    private MyMonth() {}
    public static String getMonth(int i){        
        return switch (i){
            case 1 : {
                System.out.println("ONE");
                yield M01;
            }
            case 2 : yield M02;
            case 3 : yield M03;
            case 4 : yield M04;
            default : throw new IllegalArgumentException("Invalid Parameter: " + i);
        };
    }
    public static String getShortMonth(int i){
        return getMonth(i).substring(0, 3).toUpperCase();
    }
}
