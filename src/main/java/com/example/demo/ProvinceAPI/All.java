package com.example.demo.ProvinceAPI;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)

public class All {

    @JsonProperty("result")
    private Result Result;
    public Object getResult() {
        return Result;
    }
    public void setResult(Result result) {
        Result = result;
    }
}
