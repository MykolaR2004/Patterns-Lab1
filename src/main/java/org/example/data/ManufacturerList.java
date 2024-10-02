package org.example.data;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
public class ManufacturerList {
    @Setter
    private int size = 0;
    public Manufacturer[] manufacturers = new Manufacturer[10];



    private void ensureCapacity(int newCapacity) {
        if (newCapacity <= manufacturers.length) return;
        Manufacturer[] newArray = new Manufacturer[manufacturers.length * 2];
        System.arraycopy(manufacturers, 0, newArray, 0, manufacturers.length);
        manufacturers = newArray;
    }


    public void showProductsByCountry(String country) {
        for (int i = 0; i < size; i++) {
            if (manufacturers[i].getCountry().equals(country)) {
                System.out.println(manufacturers[i]);
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(manufacturers[i]).append("\n");
        }
        return sb.toString();
    }


    public void showSouvenirsByName(String name) {
    }

    public void addManufacturer(Manufacturer manufacturer) {
        ensureCapacity(size + 1);
        manufacturers[size++] = manufacturer;
    }

}

