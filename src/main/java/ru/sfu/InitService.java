package ru.sfu;

import java.util.List;

public interface InitService {
    DFAStates[][] initStateTable();
    List<DFAStates> acceptedStatesInit();
    char[] alphabetInit();
    DFAStates startStateInit();
}
