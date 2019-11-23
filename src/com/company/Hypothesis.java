package com.company;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Hypothesis {
    @SerializedName("ifTrue")
    @Expose
    public Double ifTrue;
    @SerializedName("ifFalse")
    @Expose
    public Double ifFalse;
}
