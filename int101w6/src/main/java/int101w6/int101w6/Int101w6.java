package int101w6.int101w6;
import geometry.Rectangle;
public class Int101w6 {

    public static void main(String[] args) {
        
        try{
            System.out.println("My rectangle r = " + new Rectangle(-4,9));
            System.out.println("My rectangle r = " + new Rectangle(5,3));
            System.out.println("My rectangle r = " + new Rectangle(4,9));
            
        }catch(Exception e){
            System.out.println("An exception occure");
        }
        System.out.println("DONE");
    }
}
