package com.slackintegration.webhooks.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.lang.reflect.Field;
import java.util.List;

/**
 * Created by srinidhi on 01/04/2021.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Attachment {
    private String text;

    public void setText(String text) {
        this.text = text;
    }
}

