import java.util.LinkedList;
public class Category {
    public LinkedList<String> main(){
    String Name;
    LinkedList<String> msp = new LinkedList<>();
    msp.add("eggs");
    msp.add("bread(white)");
    msp.add("bread(black)");
    msp.add("milk");
    msp.add("cheese");
    msp.add("bananas");
    System.out.println(msp); 
    return msp;
    }
}
