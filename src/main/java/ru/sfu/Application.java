package ru.sfu;

import ru.sfu.Entity.DFAData;
import ru.sfu.Entity.DFAStates;
import ru.sfu.NFAFacade.DFAFacade;
import ru.sfu.NFAFacade.DFAFacadeImpl;
import ru.sfu.Service.InputService;

public class Application {

    public static void main(String[] args) {
        final DFAFacade dfaFacade = new DFAFacadeImpl();
        final InputService inputService = new InputService();
        DFAData dfaData = dfaFacade.generateDFAData();
        String s = inputService.getUserString();
        char[] chars = s.toCharArray();

        if (inputService.validateUserInput(s, dfaData.getAlphabet())) {
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
