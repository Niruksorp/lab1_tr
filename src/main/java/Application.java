public class Application {

    public static void main(String[] args) {
        final DFAFacade dfaFacade = new DFAFacadeImpl();
        DFAData dfaData = dfaFacade.generateDFAData();
        InputService inputService = new InputService();
        String s = inputService.getUserString();
        char[] chars = s.toCharArray();
        if(inputService.validateUserInput(s)) {
            DFAStates[][] dfaTable = dfaData.getTransitionTable();
            for (int i = 0; i < s.length(); i++) {
                DFAStates rez = dfaTable[dfaData.getStartStateInit().getState()][chars[i] - '0'];
                dfaData.setStartStateInit(rez);
            }
            Boolean some = false;
            for (int i = 0; i < dfaData.getAcceptedStatesInit().size(); ++i) {
                some = dfaData.getAcceptedStatesInit().stream().anyMatch(state -> state == dfaData.getStartStateInit());
            }
            if (some) {
                System.out.println("Корректно");
            } else {
                System.out.println("Не корректно");
            }
        } else System.out.println("Неправильный ввод");
    }
}
