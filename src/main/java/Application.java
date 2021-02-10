import java.io.IOException;

public class Application {

    public static void main(String[] args) {
        final DFAFacade dfaFacade = new DFAFacadeImpl();
        DFAData dfaData = dfaFacade.generateDFAData();
        int inChar;
        String s = "";
        try {
            inChar = System.in.read();
            while (System.in.available() > 0) {
                s += (char) inChar;
                inChar = System.in.read();
            }
        } catch (IOException e) {
            System.out.println("Ошибка");
        }
        char[] chars = s.toCharArray();
        Boolean str = s
                .chars()
                .allMatch(i -> i == '1' || i == '0');

        DFAStates[][] dfaTable = dfaData.getTransitionTable();
        for (int i = 0; i < s.length(); i++) {
            DFAStates rez = dfaTable[dfaData.getStartStateInit().getState()][chars[i] - '0'];
            dfaData.setStartStateInit(rez);
        }
        Boolean some = false;
        for (int i = 0; i < dfaData.getAcceptedStatesInit().size(); ++ i) {
            some = dfaData.getAcceptedStatesInit().stream().anyMatch(state -> state == dfaData.getStartStateInit());
        }
        if(some) {
            System.out.println("Норм");
        } else {
            System.out.println("Не норм");;
        }
    }
}
