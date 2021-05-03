public class StringConverter {
    private static final String LINE_BREAK = "\n";
    public String convert(String userText){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < userText.length(); i++){
            stringBuilder.append(SymbolProvider.findSymbol(String.valueOf(userText.charAt(i))));
            stringBuilder.append(LINE_BREAK);
            stringBuilder.append(LINE_BREAK);
        }
        return new String(stringBuilder);
    }
}
