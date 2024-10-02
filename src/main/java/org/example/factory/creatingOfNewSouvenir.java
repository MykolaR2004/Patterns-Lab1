package org.example.factory;

import org.example.SI.FI;
import org.example.data.Souvenir;
import org.example.data.SouvenirList;

import java.time.LocalDate;
import java.util.Scanner;

public class creatingOfNewSouvenir implements FI {
    @Override
    public void createNewSouvenir(Scanner scanner, SouvenirList souvenirs) {
        //Створюємо єкземпляр фабрики сувенірів
        SouvenirFactory factory = new SouvenirFactory();

        System.out.print("Введіть назву >> ");
        String name = scanner.next();
        System.out.print("Введіть реквізити >> ");
        String requisites = scanner.next();
        System.out.print("Введіть дату виробництва >> ");
        LocalDate releaseDate = LocalDate.parse(scanner.next());
        System.out.print("Введіть ціну >> ");
        int price = scanner.nextInt();
        //Використовуємо фабрику для створення об'єкту
        Souvenir newSouvenir = factory.createSouvenir(name, requisites, releaseDate, price);
        souvenirs.addSouvenir(newSouvenir);
    }
}
