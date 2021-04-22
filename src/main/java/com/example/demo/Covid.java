package com.example.demo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Covid {
    @JsonProperty("Confirmed")
    private int confirmed;
    @JsonProperty("Recovered")
    private int recovered;
    @JsonProperty("Hospitalized")
    private int hospitalized;
    @JsonProperty("Deaths")
    private int deaths;
    @JsonProperty("NewConfirmed")
    private int newConfirmed;
    @JsonProperty("NewRecovered")
    private int newRecovered;
    @JsonProperty("NewHospitalized")
    private int newHospitalized;
    @JsonProperty("NewDeaths")
    private int newDeaths;
    @JsonProperty("UpdateDate")
    private String updateDate;
    @JsonProperty("Source")
    private String source;
    @JsonProperty("DevBy")
    private String devBy;
    @JsonProperty("SeverBy")
    private String serverBy;

    public int getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(int confirmed) {
        this.confirmed = confirmed;
    }

    public int getRecovered() {
        return recovered;
    }

    public void setRecovered(int recovered) {
        this.recovered = recovered;
    }

    public int getHospitalized() {
        return hospitalized;
    }

    public void setHospitalized(int hospitalized) {
        this.hospitalized = hospitalized;
    }

    public int getDeaths() {
        return deaths;
    }

    public void setDeaths(int deaths) {
        this.deaths = deaths;
    }

    public int getNewConfirmed() {
        return newConfirmed;
    }

    public void setNewConfirmed(int newConfirmed) {
        this.newConfirmed = newConfirmed;
    }

    public int getNewRecovered() {
        return newRecovered;
    }

    public void setNewRecovered(int newRecovered) {
        this.newRecovered = newRecovered;
    }

    public int getNewHospitalized() {
        return newHospitalized;
    }

    public void setNewHospitalized(int newHospitalized) {
        this.newHospitalized = newHospitalized;
    }

    public int getNewDeaths() {
        return newDeaths;
    }

    public void setNewDeaths(int newDeaths) {
        this.newDeaths = newDeaths;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDevBy() {
        return devBy;
    }

    public void setDevBy(String devBy) {
        this.devBy = devBy;
    }

    public String getServerBy() {
        return serverBy;
    }

    public void setServerBy(String serverBy) {
        this.serverBy = serverBy;
    }
}
