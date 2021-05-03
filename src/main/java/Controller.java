import java.util.Scanner;

public class Controller {

    public String getDataFromUser(){
        Scanner scanner = new Scanner(System.in);
        String data = scanner.nextLine();
        scanner.close();
        return data.toUpperCase();
    }
}
