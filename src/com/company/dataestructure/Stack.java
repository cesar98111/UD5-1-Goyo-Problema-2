package com.company.dataestructure;

public class Stack{
    private static final int CAPACIDAD_INICIAL =5;
    private static final int TOP = 0;
    private CustomCollection  collection = new CustomCollection(CAPACIDAD_INICIAL);

    public void push(int element){
        collection.insert(element,TOP);

    }
    public int pop(){
       return collection.delete(TOP);
    }

}
