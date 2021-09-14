package com.example.hakimlivsmail;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class MailDTO {
    @JsonProperty
    private String toMail;
    @JsonProperty
    private String subject;
    @JsonProperty
    private String content;

    @JsonCreator


}