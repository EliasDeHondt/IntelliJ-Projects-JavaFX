package be.kdg.dictee.model;

import java.util.*;

//HET MODEL IS GEGEVEN EN MAG NIET AANGEPAST WORDEN
public class Scrambler {
    private String tekst = "test";

    public void setTekst(String tekst) {
        this.tekst = tekst;
    }

    public String getTekst() {
        return tekst;
    }

    public void scramble(){
        List<String> letters = Arrays.asList(tekst.split(""));
        Collections.shuffle(letters);
        this.tekst = "";
        for (String letter: letters) {
            tekst += letter;
        }
    }

}