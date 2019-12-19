package com.icer.pattern.adapter;

public class FishingBoatAdapter implements RowingBoat {
    FishingBoat fishingBoat;

    public FishingBoatAdapter() {
        this.fishingBoat = new FishingBoat();
    }

    @Override
    public void row() {
        fishingBoat.sail();
    }
}
