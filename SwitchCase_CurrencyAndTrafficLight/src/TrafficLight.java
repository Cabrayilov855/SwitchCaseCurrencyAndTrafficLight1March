import java.util.Scanner;

public class TrafficLight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seçim edə biləcəyiniz rənglər :\n 1.red\n 2.orange\n 3.green");
        String text = scanner.next();

        switch (text){
            case "red":
                System.out.println("Stop");
                break;
            case "orange"  :
                System.out.println("Ready");
                break;
            case "green":
                System.out.println("Go");
                break;
            default:
                System.out.println("Choice is not defianed");
        }
    }
}
