public class Application {

    public static void main(String[] args) {
        Application.start();
    }

    private static void start(){
        View view = new View();
        Controller controller = new Controller();
        StringConverter stringConverter = new StringConverter();

        view.showGreeting();
        view.printOnConsole(stringConverter.convert(controller.getDataFromUser()));
    }
}
