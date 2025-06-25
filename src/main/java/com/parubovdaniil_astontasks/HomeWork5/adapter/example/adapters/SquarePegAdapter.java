package com.parubovdaniil_astontasks.HomeWork5.adapter.example.adapters;

import com.parubovdaniil_astontasks.HomeWork5.adapter.example.round.RoundPeg;
import com.parubovdaniil_astontasks.HomeWork5.adapter.example.square.SquarePeg;

public class SquarePegAdapter extends RoundPeg {
    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    @Override
    public double getRadius() {
        double result;
        result = (Math.sqrt(Math.pow((peg.getWidth() / 2), 2) * 2));
        return result;
    }
}
