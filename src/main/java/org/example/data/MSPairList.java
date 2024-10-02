package org.example.data;


import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;

public class MSPairList {
    @Setter
    @Getter
    private int size = 0;
    private ManufacturerSouvenirPair[] pairs = new ManufacturerSouvenirPair[10];


    private void ensureCapacity(int newCapacity) {
        if (newCapacity <= pairs.length) return;
        ManufacturerSouvenirPair[] newArray = new ManufacturerSouvenirPair[pairs.length * 2];
        System.arraycopy(pairs, 0, newArray, 0, pairs.length);
        pairs = newArray;
    }

    public void addPair(ManufacturerSouvenirPair pair) {
        ensureCapacity(size + 1);
        pairs[size++] = pair;
    }

    public void showSouvenirsByManufacturer(String name, SouvenirList souvenirs) {
        for (int i = 0; i < size; i++) {
        if (name.equals(pairs[i].getName()) ) {
            for (int j = 0; j < souvenirs.getSize(); j++) {
                if (pairs[i].getSouvenirName().equals(souvenirs.getSouvenirs()[j].getSouvenirName()))
                    System.out.println(souvenirs.getSouvenirs()[j]);
                }
            }
        }
    }

    public void showSouvenirsByCountry(String country, ManufacturerList manufacturers, SouvenirList souvenirs) {
        for (int i = 0; i < manufacturers.getSize(); i++) {
            if (country.equals(manufacturers.getManufacturers()[i].getCountry())) {
                System.out.println(manufacturers.getManufacturers()[i]);
                showSouvenirsByManufacturer(manufacturers.getManufacturers()[i].getName(), souvenirs);
            }
        }
    }


    public void showManufacturersByPrice(int price, ManufacturerList manufacturers, SouvenirList souvenirs) {
        for (int i = 0; i < souvenirs.getSize(); i++) {
            if (price > (souvenirs.getSouvenirs()[i].getPrice())) {
                System.out.println(manufacturers.getManufacturers()[i]);
            }
        }
    }

    public void showAllSouvsAndMans(ManufacturerList manufacturers, SouvenirList souvenirs) {
        for (int i = 0; i < manufacturers.getSize(); i++) {
            System.out.println(manufacturers.getManufacturers()[i].getName());
            showSouvenirsByManufacturer(manufacturers.getManufacturers()[i].getName(),souvenirs);
        }
    }

    public void showManufacturersBySouvenirYear(String name, LocalDate date, ManufacturerList manufacturers, SouvenirList souvenirs) {
        int year = date.getYear();
        for (int i = 0; i < manufacturers.getSize(); i++) {

            System.out.println("!"+ manufacturers.getManufacturers()[i]);

//            if (year == (souvenirs.getSouvenirs()[i].getReleaseDate().getYear()) )
                for (int j = 0; j < size; j++) {
                    if (year == (souvenirs.getSouvenirs()[i].getReleaseDate().getYear()) &&
                    pairs[j].getSouvenirName().equals(souvenirs.getSouvenirs()[i].getSouvenirName()))
                        System.out.println(1);
                }
        }
    }

    public void showSouvenirsByYear(SouvenirList souvenirs) {
        for (int i = 0; i < size; i++) {
            {
                System.out.println(souvenirs.getSouvenirs()[i]);
            }
        }
    }

//    public void showManufacturersByPrice(int price, ManufacturerList manufacturers, SouvenirList souvenirs) {   && name.equals(souvenirs.getSouvenirs()[i].getSouvenirName())
//        for (int i = 0; i < souvenirs.getSize(); i++) {
//            if (price > (souvenirs.getSouvenirs()[i].getPrice())) {
//                for (int j = 0; j < manufacturers.getSize(); j++) {
//                    System.out.println(manufacturers.getManufacturers()[i]);
//                }
//
//            }
//        }
//    }


}
