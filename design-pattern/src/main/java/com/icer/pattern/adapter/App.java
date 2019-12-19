package com.icer.pattern.adapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Captain captain = new Captain();
        captain.setRowingBoat(new FishingBoatAdapter());
        captain.row();
        List<Integer> integers = Arrays.asList(1, 2, 3, 4);
        integers.add(5);
        System.out.println(integers);
    }
}
