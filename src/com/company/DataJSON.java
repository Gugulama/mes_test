package com.company;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DataJSON
{
    @SerializedName("questins")
    @Expose
    public List<String> questins = null;
    @SerializedName("hypothesis")
    @Expose
    public List<Hypothesi> hypothesis = null;
}
