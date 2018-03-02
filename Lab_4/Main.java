
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        StringProcessor stringProcessor = new StringProcessor();
        String s = stringProcessor.readInputText();
        s = stringProcessor.processText(s);
        stringProcessor.showResult(s);
    }
}