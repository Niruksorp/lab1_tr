public class DFAFacadeImpl implements DFAFacade {

    private final InitService initService = new InitServiceImpl();

    @Override
    public DFAData generateDFAData() {
        return DFAData.builder()
                .alphabet(initService.alphabetInit())
                .acceptedStatesInit(initService.acceptedStatesInit())
                .startStateInit(initService.startStateInit())
                .transitionTable(initService.initStateTable())
                .build();
    }
}
