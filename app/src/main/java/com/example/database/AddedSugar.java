package com.example.database;
import com.fasterxml.jackson.annotation.*;

public class AddedSugar {
    private double value;

    @JsonProperty("value")
    public double getValue() { return value; }
    @JsonProperty("value")
    public void setValue(double value) { this.value = value; }
}

