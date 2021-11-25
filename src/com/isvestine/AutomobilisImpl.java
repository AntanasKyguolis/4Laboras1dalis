package com.isvestine;

import com.bazine.TransportasImpl;
import com.bazine.Transportas;

public class AutomobilisImpl extends TransportasImpl implements Automobilis{
    private String marke;
    private int duruSkaicius;
    private boolean varomasElektra;

    public AutomobilisImpl(String tipas, boolean variklis, int pagaminimoMetai, String marke, int duruSkaicius, boolean varomasElektra){
        super(tipas, variklis, pagaminimoMetai);
        this.marke = marke;
        this.duruSkaicius = duruSkaicius;
        this.varomasElektra = varomasElektra;
    }

    @Override
    public String getMarke() {
        return marke;
    }

    @Override
    public void setMarke(String marke) {
        this.marke = marke;

    }

    @Override
    public int getDuruSkaicius() {
        return duruSkaicius;
    }

    @Override
    public void setDuruSkaicius(int duruSkaicius) {
        this.duruSkaicius = duruSkaicius;

    }

    @Override
    public boolean isVaromasElektra() {
        return varomasElektra;
    }

    @Override
    public void setVaromasElektra(boolean varomasElektra) {
        this.varomasElektra = varomasElektra;

    }

    @Override
    public String toString() {
        return "Automobilio " +
                "marke = " + marke +
                ", kuriame duru skaicius " + duruSkaicius +
                ", yra varomas Elektra = " + varomasElektra +
                '}';
    }
}