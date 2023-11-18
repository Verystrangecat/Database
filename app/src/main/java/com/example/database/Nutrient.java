package com.example.database;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Nutrient {
        private long id;
        private String number;
        private String name;
        private long rank;
        private String unitName;

        @JsonProperty("id")
        public long getID() { return id; }
        @JsonProperty("id")
        public void setID(long value) { this.id = value; }

        @JsonProperty("number")
        public String getNumber() { return number; }
        @JsonProperty("number")
        public void setNumber(String value) { this.number = value; }

        @JsonProperty("name")
        public String getName() { return name; }
        @JsonProperty("name")
        public void setName(String value) { this.name = value; }

        @JsonProperty("rank")
        public long getRank() { return rank; }
        @JsonProperty("rank")
        public void setRank(long value) { this.rank = value; }

        @JsonProperty("unitName")
        public String getUnitName() { return unitName; }
        @JsonProperty("unitName")
        public void setUnitName(String value) { this.unitName = value; }
    }

