package com.example.database;


import com.fasterxml.jackson.annotation.*;

    public class LabelNutrients {
        private AddedSugar fat;
        private AddedSugar sodium;
        private AddedSugar carbohydrates;
        private AddedSugar sugars;
        private AddedSugar protein;
        private AddedSugar addedSugar;
        private AddedSugar calories;

        @JsonProperty("fat")
        public AddedSugar getFat() { return fat; }
        @JsonProperty("fat")
        public void setFat(AddedSugar value) { this.fat = value; }

        @JsonProperty("sodium")
        public AddedSugar getSodium() { return sodium; }
        @JsonProperty("sodium")
        public void setSodium(AddedSugar value) { this.sodium = value; }

        @JsonProperty("carbohydrates")
        public AddedSugar getCarbohydrates() { return carbohydrates; }
        @JsonProperty("carbohydrates")
        public void setCarbohydrates(AddedSugar value) { this.carbohydrates = value; }

        @JsonProperty("sugars")
        public AddedSugar getSugars() { return sugars; }
        @JsonProperty("sugars")
        public void setSugars(AddedSugar value) { this.sugars = value; }

        @JsonProperty("protein")
        public AddedSugar getProtein() { return protein; }
        @JsonProperty("protein")
        public void setProtein(AddedSugar value) { this.protein = value; }

        @JsonProperty("addedSugar")
        public AddedSugar getAddedSugar() { return addedSugar; }
        @JsonProperty("addedSugar")
        public void setAddedSugar(AddedSugar value) { this.addedSugar = value; }

        @JsonProperty("calories")
        public AddedSugar getCalories() { return calories; }
        @JsonProperty("calories")
        public void setCalories(AddedSugar value) { this.calories = value; }
    }

