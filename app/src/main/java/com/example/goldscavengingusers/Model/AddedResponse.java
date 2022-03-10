package com.example.goldscavengingusers.Model;

import com.google.gson.annotations.SerializedName;

public class AddedResponse {

    @SerializedName("goldBarOwner")
    private AddedModel addedModel;
    @SerializedName("error")
    private boolean error;
    @SerializedName("message_en")
    private String message_en;
    @SerializedName("message_ar")
    private String message_ar;

    public AddedResponse(AddedModel addedModel, boolean error, String message_en, String message_ar) {
        this.addedModel = addedModel;
        this.error = error;
        this.message_en = message_en;
        this.message_ar = message_ar;
    }

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public String getMessage_en() {
        return message_en;
    }

    public void setMessage_en(String message_en) {
        this.message_en = message_en;
    }

    public String getMessage_ar() {
        return message_ar;
    }

    public void setMessage_ar(String message_ar) {
        this.message_ar = message_ar;
    }

    public AddedModel getAddedModel() {
        return addedModel;
    }

    public void setAddedModel(AddedModel addedModel) {
        this.addedModel = addedModel;
    }
}
