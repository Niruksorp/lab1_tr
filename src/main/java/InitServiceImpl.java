import java.util.List;

public class InitServiceImpl implements InitService {
    @Override
    public DFAStates[][] initStateTable() {
        DFAStates[][] transitionTable = new DFAStates[5][2];
        transitionTable[DFAStates.q0.getState()][0] = DFAStates.q4;
        transitionTable[DFAStates.q0.getState()][1] = DFAStates.q1;

        transitionTable[DFAStates.q1.getState()][0] = DFAStates.q0;
        transitionTable[DFAStates.q1.getState()][1] = DFAStates.q2;

        transitionTable[DFAStates.q2.getState()][0] = DFAStates.q3;
        transitionTable[DFAStates.q2.getState()][1] = DFAStates.q2;

        transitionTable[DFAStates.q3.getState()][0] = DFAStates.q0;
        transitionTable[DFAStates.q3.getState()][1] = DFAStates.q0;

        transitionTable[DFAStates.q4.getState()][0] = DFAStates.q4;
        transitionTable[DFAStates.q4.getState()][1] = DFAStates.q4;
        return transitionTable;
    }

    @Override
    public List<DFAStates> acceptedStatesInit() {
        return List.of(
                DFAStates.q0,
                DFAStates.q1,
                DFAStates.q2,
                DFAStates.q3);
    }

    @Override
    public String[] alphabetInit() {
        return new String[]{"1", "0"};
    }

    @Override
    public DFAStates startStateInit() {
        return DFAStates.q0;
    }
}
