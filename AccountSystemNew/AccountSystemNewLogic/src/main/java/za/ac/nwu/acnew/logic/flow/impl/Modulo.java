package za.ac.nwu.acnew.logic.flow.impl;

public class Modulo {
    public Integer doMod(int i, int i1) {
        if(i1 == 0){
            return null;
        }
        return i % i1;
    }
}
