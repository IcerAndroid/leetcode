package com.icer.pattern.adapter;

public class Captain {
    private RowingBoat rowingBoat;

    public Captain() {
    }

    public Captain(RowingBoat rowingBoat) {
        this.rowingBoat = rowingBoat;
    }

    void row() {
        rowingBoat.row();
    }

    public void setRowingBoat(RowingBoat rowingBoat) {
        this.rowingBoat = rowingBoat;
    }
}
