import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by jvdberg on 01/07/2014.
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("Hoe heet je?");
        String name;
        System.out.print("Geef je naam op: ");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            name = in.readLine();
            System.out.println("Hallo " + name + "!");
        } catch (IOException e) {
            System.out.println("Caught an IOException!");
        }
    }
}
