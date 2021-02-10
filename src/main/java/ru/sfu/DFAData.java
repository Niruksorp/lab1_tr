package ru.sfu;

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
    private final char[] alphabet;
    private DFAStates startStateInit;

    public DFAData(DFAStates[][] transitionTable,
                   List<DFAStates> acceptedStatesInit,
                   char[] alphabet,
                   DFAStates startStateInit) {
        this.transitionTable = transitionTable;
        this.acceptedStatesInit = acceptedStatesInit;
        this.alphabet = alphabet;
        this.startStateInit = startStateInit;
    }
}
