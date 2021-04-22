package com.example.demo.ProvinceAPI;

import com.example.demo.ProvinceAPI.Province;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Result {

    @JsonProperty("records")
    private List<Province> records;

    public List<Province> getRecords() {
        return records;
    }

    public void setProvince(List<Province> records) {
        this.records = records;
    }
}
