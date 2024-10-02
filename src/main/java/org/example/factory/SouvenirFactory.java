package org.example.factory;

import org.example.data.Souvenir;

import java.time.LocalDate;

public class SouvenirFactory {
    //Метод для создания сувениров с задаными параметрами
    public Souvenir createSouvenir(String name, String requisites, LocalDate releaseDate, int price) {
        return new Souvenir(name, requisites, releaseDate, price);
    }
}
