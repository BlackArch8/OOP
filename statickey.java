
import java.util.ArrayList;

class Display{
    private static int count;
    private String name;
    private static ArrayList<String> list = new ArrayList<String>();

    public Display(String name){
        this.name = name;
        list.add(this.name);
        Display.count++;
    }
    public static int getcount(){
        return Display.count;
    }
    public static ArrayList<String> getlist(){
        return Display.list;
    }

}

public class statickey {
    public static void main(String[] args) {

       
        new Display("hu");
        new Display("ho");
        
        System.out.println(Display.getcount());
        System.out.println(Display.getlist());
    }
    
}
