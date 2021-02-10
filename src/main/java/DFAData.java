import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@Builder
public class DFAData {
    private DFAStates[][] transitionTable;
    private final List<DFAStates> acceptedStatesInit;
    private final String[] alphabet;
    private DFAStates startStateInit;

    public DFAData(DFAStates[][] transitionTable, List<DFAStates> acceptedStatesInit, String[] alphabet, DFAStates startStateInit) {
        this.transitionTable = transitionTable;
        this.acceptedStatesInit = acceptedStatesInit;
        this.alphabet = alphabet;
        this.startStateInit = startStateInit;
    }
}
