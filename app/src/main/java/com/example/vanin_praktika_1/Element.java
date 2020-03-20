package com.example.vanin_praktika_1;

public class Element {
    private String name; // название
    private int flagResource; // ресурс флага
    private int color;
    public Element(String name, int flag, int colour){
        this.name=name;
        this.flagResource=flag;
        this.color=colour;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getFlagResource() {
        return this.flagResource;
    }
    public void setFlagResource(int flagResource) {
        this.flagResource = flagResource;
    }
    public void setColor(int color) { this.color = color; }
    public int getColor() { return color; }
}
