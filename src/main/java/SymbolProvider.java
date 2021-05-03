import java.util.ResourceBundle;

public class SymbolProvider {
    private static final String RESOURCE_FILE = "symbols";

    public static String findSymbol(String symbol){
        ResourceBundle resourceBundle = ResourceBundle.getBundle(RESOURCE_FILE);
        return resourceBundle.getString(symbol);
    }

    private SymbolProvider(){
    }

}
