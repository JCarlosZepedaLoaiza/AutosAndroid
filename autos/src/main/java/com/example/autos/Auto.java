package com.example.autos;

public class Auto {
    private String mark;
    private String model;
    private int year;

    public Auto(String mark, String model, int year) {
        this.mark = mark;
        this.model = model;
        this.year = year;
    }
    public Auto(){
        this.year= 2020;
        this.mark = "KIA";
        this.model = "Rio";
    }

    public String toString(){
        String resp = "\nMarca: " + this.mark + "\nModelo: " + this.model + "\nAño: " + this.year;
        return resp;
    }

    public Boolean IsPreowned(){
        LocalDate date = LocalDate.now();
        Integer year = date.getYear();
        if (this.year<year){
            return Boolean.True;
        }
        else{
            return Boolean.False;
        }
    }
}
