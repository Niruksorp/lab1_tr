import java.io.IOException;

public class InputService {
    String getUserString() {
        String s = "";
        int inChar;
        try {
            inChar = System.in.read();
            while (System.in.available() > 0) {
                s += (char) inChar;
                inChar = System.in.read();
            }
        } catch (IOException e) {
            System.out.println("Ошибка");
        }
        return s;
    }
    Boolean validateUserInput(String s) {
        return s
                .chars()
                .allMatch(i -> i == '1' || i == '0');
    }
}
