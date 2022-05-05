package com.company.dataestructure;

import java.util.Arrays;

public class CustomCollection {
    private static final int DEFAULT_CAPACITY = 5;
    private int data[] = null;
    private int length =0;

    public CustomCollection(int initialCapacity){
        data = new int[initialCapacity];
    }
    public CustomCollection(){
        data = new int[DEFAULT_CAPACITY];
    }
    public int getElement(int position){
        return data[position];
    }
    public int length(){
        return length;
    }
    public void insert(int element, int position){
        if(length == data.length){
            int []aux = data;
            data= new int[data.length *2];

            for (int i = 0; i < aux.length; i++) {
                data[i] = aux[i];
            }
            aux= null; //esto es para que el recolector de basura se cargue a aux
        }
        for (int i = length -1; i>=position ;i--){
            data[i+1]= data[i];
        }
        data[position]=element;
        length++;
    }
    public void add(int element){
        insert(element,length);
    }
    public int search(int element){
        for (int i = 0; i < length; i++) {
            if(data[i]==element){
                return i;
            }

        }
        return -1;
    }
    public int delete(int position){
        int aux = data[position];

        for(int i= position; i< length -1; i++){
            data[i]=data[i+1];
        }
        data[length-1]=0;
        length--;
        return aux;
    }

    @Override
    public String toString() {
        if (length==0){
            return "<Empty>";
        }
            String out="";
            for (int i = 0; i < length; i++) {
                    out+=getElement(i)+",";
                }
                return out;

        }
    }

