package com.example.hakimlivsmail;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class MailDTO {
    @JsonProperty
    private String mailTo;
    @JsonProperty
    private String type;

    @JsonCreator
    public MailDTO(@JsonProperty("mailTo") String mailTo, @JsonProperty("type") String type){
        this.mailTo = mailTo;
        this.type = type;
    }
}