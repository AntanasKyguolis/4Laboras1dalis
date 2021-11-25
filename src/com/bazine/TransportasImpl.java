package com.bazine;

public class TransportasImpl implements Transportas {
    private String tipas;
    private boolean variklis;
    private int pagaminimoMetai;

    public TransportasImpl(String  tipas, boolean variklis, int pagaminimoMetai){
        this.tipas = tipas;
        this.variklis = variklis;
        this.pagaminimoMetai = pagaminimoMetai;
    }


    @Override
    public String getTipas() {
        return tipas;
    }

    @Override
    public void setTipas(String tipas) {
        this.tipas = tipas;

    }

    @Override
    public boolean isVariklis() {
        return variklis;
    }

    @Override
    public void setVariklis(boolean variklis) {
        this.variklis = variklis;

    }

    @Override
    public int getPagaminimoMetai() {
        return pagaminimoMetai;
    }

    @Override
    public void setPagaminimoMetai(int pagaminimoMetai) {
        this.pagaminimoMetai =pagaminimoMetai;

    }

    @Override
    public String toString() {
        return "TransportasImpl{" +
                "tipas='" + tipas + '\'' +
                ", variklis=" + variklis +
                ", pagaminimoMetai=" + pagaminimoMetai +
                '}';
    }
}