import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("Escriu el teu nom: ");
        String nom = in.nextLine ();
        System.out.println("\nHola " + nom + "!!\n");
        in.close();  
    }
}
