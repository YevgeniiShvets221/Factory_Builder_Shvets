package com.company;

@SuppressWarnings("unused")
public abstract class IFormat {
    String toJSON;
    String toXML;

    public abstract String toJSON();

    public abstract String toXML();
}
