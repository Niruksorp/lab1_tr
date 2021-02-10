package ru.sfu.Entity;

public enum DFAStates {
    q0(0),
    q1(1),
    q2(2),
    q3(3),
    q4(4);

    private final Integer state;

    DFAStates(Integer integer) {
        this.state = integer;
    }

    public Integer getState() {
        return state;
    }
}