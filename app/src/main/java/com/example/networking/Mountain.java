package com.example.networking;

public class Mountain {
    private String id;
    private String name;
    private int size;

    public Mountain(){
        size=0;
        name="none";
        id="none";
    }
    public Mountain(String id, int size, String name){
        this.id=id;
        this.size=size;
        this.name=name;
    }
    public String toString(){return name;}

    public String getId(){
        return id;
    }
    public int getSize(){
        return size;
    }
    public String getName(){
        return name;
    }
}
