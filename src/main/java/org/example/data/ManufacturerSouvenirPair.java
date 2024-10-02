package org.example.data;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
public class ManufacturerSouvenirPair {
    private String name;
    private String souvenirName;

    public ManufacturerSouvenirPair(String name, String souvenirName) {
        this.name = name;
        this.souvenirName = souvenirName;
    }

    @Override
    public String toString() {
        return name + " - " + souvenirName;
    }
}
