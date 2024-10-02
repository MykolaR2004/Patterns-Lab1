package org.example.data;


import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;
import java.util.Comparator;

@Getter
public class SouvenirList {
    @Setter
    private int size = 0;
    private Souvenir[] souvenirs = new Souvenir[10];
    private void ensureCapacity(int newCapacity) {
        if (newCapacity <= souvenirs.length) return;
        Souvenir[] newArray = new Souvenir[souvenirs.length * 2];
        System.arraycopy(souvenirs, 0, newArray, 0, souvenirs.length);
        souvenirs = newArray;
    }
    public void addSouvenir(Souvenir souvenir) {
        ensureCapacity(size + 1);
        souvenirs[size++] = souvenir;
    }

    public void showSouvenirs(SouvenirList souvenir) {
        for (int i = 0; i < souvenirs.length; i++) {
            System.out.println(souvenir.getSouvenirs()[i]);
        }
    }

}
