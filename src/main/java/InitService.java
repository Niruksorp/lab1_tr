import java.util.List;

public interface InitService {
    DFAStates[][] initStateTable();
    List<DFAStates> acceptedStatesInit();
    String[] alphabetInit();
    DFAStates startStateInit();
}
