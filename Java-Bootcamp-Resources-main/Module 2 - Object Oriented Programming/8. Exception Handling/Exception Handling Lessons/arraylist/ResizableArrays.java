import java.util.ArrayList;

public class ResizableArrays {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("zack");
        names.add("Bello");
        names.add("Owolabi");

        names.set(0, "Zack Bello");

        names.add(3, "Sule");

        names.remove(3);

        names.clear();

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
        
        
    }
}
