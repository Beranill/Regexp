import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        String a = "Hello23131312312there423453523hey534543543qwesad";
        String[] words = a.split("\\d+");
        System.out.println(Arrays.toString(words));

        String b = "Hello there hey";
        String modifiedString =  b.replaceAll(" ", ".");
        String modifiedString2 = b.replaceFirst(" ", ".");
        System.out.println(modifiedString);
        System.out.println(modifiedString2);
    }
}
