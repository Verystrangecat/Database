package com.example.database;

import com.fasterxml.jackson.annotation.*;

import java.util.List;

public class FoodData {

    private String discontinuedDate;
    private List<Object> foodComponents;
    private List<Object> foodAttributes;
    private List<Object> foodPortions;
    private long fdcID;
    private String description;
    private String publicationDate;
    private List<FoodNutrient> foodNutrients;
    private String dataType;
    private String foodClass;
    private String modifiedDate;
    private String availableDate;
    private String brandOwner;
    private String brandName;
    private String dataSource;
    private String brandedFoodCategory;
    private String gtinUpc;
    private String ingredients;
    private String marketCountry;
    private long servingSize;
    private String servingSizeUnit;
    private String packageWeight;
    private String notaSignificantSourceOf;
    private List<FoodData> foodUpdateLog;
    private LabelNutrients labelNutrients;




    @JsonProperty("foodComponents")
    public List<Object> getFoodComponents() { return foodComponents; }
    @JsonProperty("foodComponents")
    public void setFoodComponents(List<Object> value) { this.foodComponents = value; }

    @JsonProperty("foodAttributes")
    public List<Object> getFoodAttributes() { return foodAttributes; }
    @JsonProperty("foodAttributes")
    public void setFoodAttributes(List<Object> value) { this.foodAttributes = value; }

    @JsonProperty("foodPortions")
    public List<Object> getFoodPortions() { return foodPortions; }
    @JsonProperty("foodPortions")
    public void setFoodPortions(List<Object> value) { this.foodPortions = value; }

    @JsonProperty("fdcId")
    public long getFDCID() { return fdcID; }
    @JsonProperty("fdcId")
    public void setFDCID(long value) { this.fdcID = value; }

    @JsonProperty("description")
    public String getDescription() { return description; }
    @JsonProperty("description")
    public void setDescription(String value) { this.description = value; }



    @JsonProperty("foodNutrients")
    public List<FoodNutrient> getFoodNutrients() { return foodNutrients; }
    @JsonProperty("foodNutrients")
    public void setFoodNutrients(List<FoodNutrient> value) { this.foodNutrients = value; }

    @JsonProperty("dataType")
    public String getDataType() { return dataType; }
    @JsonProperty("dataType")
    public void setDataType(String value) { this.dataType = value; }

    @JsonProperty("foodClass")
    public String getFoodClass() { return foodClass; }
    @JsonProperty("foodClass")
    public void setFoodClass(String value) { this.foodClass = value; }







    @JsonProperty("brandOwner")
    public String getBrandOwner() { return brandOwner; }
    @JsonProperty("brandOwner")
    public void setBrandOwner(String value) { this.brandOwner = value; }

    @JsonProperty("brandName")
    public String getBrandName() { return brandName; }
    @JsonProperty("brandName")
    public void setBrandName(String value) { this.brandName = value; }

    @JsonProperty("dataSource")
    public String getDataSource() { return dataSource; }
    @JsonProperty("dataSource")
    public void setDataSource(String value) { this.dataSource = value; }

    @JsonProperty("brandedFoodCategory")
    public String getBrandedFoodCategory() { return brandedFoodCategory; }
    @JsonProperty("brandedFoodCategory")
    public void setBrandedFoodCategory(String value) { this.brandedFoodCategory = value; }

    @JsonProperty("gtinUpc")
    public String getGtinUpc() { return gtinUpc; }
    @JsonProperty("gtinUpc")
    public void setGtinUpc(String value) { this.gtinUpc = value; }

    @JsonProperty("ingredients")
    public String getIngredients() { return ingredients; }
    @JsonProperty("ingredients")
    public void setIngredients(String value) { this.ingredients = value; }

    @JsonProperty("marketCountry")
    public String getMarketCountry() { return marketCountry; }
    @JsonProperty("marketCountry")
    public void setMarketCountry(String value) { this.marketCountry = value; }

    @JsonProperty("servingSize")
    public long getServingSize() { return servingSize; }
    @JsonProperty("servingSize")
    public void setServingSize(long value) { this.servingSize = value; }

    @JsonProperty("servingSizeUnit")
    public String getServingSizeUnit() { return servingSizeUnit; }
    @JsonProperty("servingSizeUnit")
    public void setServingSizeUnit(String value) { this.servingSizeUnit = value; }

    @JsonProperty("packageWeight")
    public String getPackageWeight() { return packageWeight; }
    @JsonProperty("packageWeight")
    public void setPackageWeight(String value) { this.packageWeight = value; }

    @JsonProperty("notaSignificantSourceOf")
    public String getNotaSignificantSourceOf() { return notaSignificantSourceOf; }
    @JsonProperty("notaSignificantSourceOf")
    public void setNotaSignificantSourceOf(String value) { this.notaSignificantSourceOf = value; }

    @JsonProperty("foodUpdateLog")
    public List<FoodData> getFoodUpdateLog() { return foodUpdateLog; }
    @JsonProperty("foodUpdateLog")
    public void setFoodUpdateLog(List<FoodData> value) { this.foodUpdateLog = value; }

    @JsonProperty("labelNutrients")
    public LabelNutrients getLabelNutrients() { return labelNutrients; }
    @JsonProperty("labelNutrients")
    public void setLabelNutrients(LabelNutrients value) { this.labelNutrients = value; }
}