package com.example.database;

import com.fasterxml.jackson.annotation.*;

public class FoodNutrient {
    private String type;
    private Nutrient nutrient;
    private FoodNutrientDerivation foodNutrientDerivation;
    private long id;
    private double amount;

    @JsonProperty("type")
    public String getType() { return type; }
    @JsonProperty("type")
    public void setType(String value) { this.type = value; }

    @JsonProperty("nutrient")
    public Nutrient getNutrient() { return nutrient; }
    @JsonProperty("nutrient")
    public void setNutrient(Nutrient value) { this.nutrient = value; }

    @JsonProperty("foodNutrientDerivation")
    public FoodNutrientDerivation getFoodNutrientDerivation() { return foodNutrientDerivation; }
    @JsonProperty("foodNutrientDerivation")
    public void setFoodNutrientDerivation(FoodNutrientDerivation value) { this.foodNutrientDerivation = value; }

    @JsonProperty("id")
    public long getID() { return id; }
    @JsonProperty("id")
    public void setID(long value) { this.id = value; }

    @JsonProperty("amount")
    public double getAmount() { return amount; }
    @JsonProperty("amount")
    public void setAmount(double value) { this.amount = value; }
}



