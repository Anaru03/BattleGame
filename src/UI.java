import java.util.Scanner;

public class UI {
static Scanner lector = new Scanner(System.in);
    public static void UIPlayer(){
        System.out.println("Ingrese su nombre");
        String name;

        name = lector.nextLine();


        System.out.println("¿Quieres ser guerrero o explorador?");
        String type;

        type = lector.nextLine();

        Controller.newPlayer(name, type);
    }

}
