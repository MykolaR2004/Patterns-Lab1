package org.example.data;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;

@Setter
@Getter
public class Manufacturer implements Serializable {
    private String name;
    private String country;

    public Manufacturer(String name, String country) {
        this.name = name;
        this.country = country;
    }

    @Override
    public String toString() {
        return name + " (" + country + ")";
    }
}

//public class Manufacturer implements Serializable {
//    private String name;
//    private String country;
//    private String souvenirName;
//    private String requisites;
//    private LocalDate releaseDate;
//    private int price;
//
//    public Manufacturer(String name,String country,String souvenirName,String requisites, LocalDate releaseDate, int price){
//        this.name = name;
//        this.country = country;
//        this.souvenirName = souvenirName;
//        this.requisites = requisites;
//        this.releaseDate = releaseDate;
//        this.price = price;
//    }
//
//    public String getName(){
//        return name;
//    }
//    public void setName(){
//        this.name = name;
//    }
//
//    public String getCountry(){
//        return country;
//    }
//    public void setCountry(){
//        this.country = country;
//    }
//
//    public String getSouvenirName(){
//        return souvenirName;
//    }
//    public void setSouvenirName(){
//        this.souvenirName = souvenirName;
//    }
//
//    public String getRequisites() {
//        return requisites;
//    }
//
//    public void setRequisites(String requisites) {
//        this.requisites = requisites;
//    }
//
//    public LocalDate getReleaseDate() {
//        return releaseDate;
//    }
//
//    public void setReleaseDate(LocalDate releaseDate) {
//        this.releaseDate = releaseDate;
//    }
//
//    public int getPrice() {
//        return price;
//    }
//
//    public void setPrice(int price) {
//        this.price = price;
//    }
//
//
//    @Override
//    public String toString() {
//        return  name+" "+country+" "+souvenirName+" "+requisites+" "+releaseDate+" "+price+" UAH.";
//    }
//}
