package org.example.data;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;

@Setter
@Getter
@AllArgsConstructor
public class Souvenir implements Serializable {
    private String souvenirName;
    private String requisites;
    private LocalDate releaseDate;
    private int price;

    public int getReleaseYear() {
        return releaseDate.getYear();
    }

    @Override
    public String toString() {
        return souvenirName + " (" + releaseDate + ") - " + price + " UAH.";
    }

}
