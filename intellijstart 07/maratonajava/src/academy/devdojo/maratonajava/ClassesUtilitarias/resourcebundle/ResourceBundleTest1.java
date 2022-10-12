package academy.devdojo.maratonajava.ClassesUtilitarias.resourcebundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest1 {
    public static void main(String[] args) {
        ResourceBundle x = ResourceBundle.getBundle("msg",new Locale("en","US"));
        System.out.println(x.getBaseBundleName());
        System.out.println(x.containsKey("1"));
        System.out.println(x.containsKey("3"));
        System.out.println(x.getKeys());
        System.out.println(x.getString("1"));
        System.out.println(x.getString("2"));

    }
}
