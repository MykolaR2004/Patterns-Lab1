package org.example;


import org.example.UI.ManufacturerFunctions;
import org.example.UI.manufacturerFunctionsProcessor;
import org.example.data.MSPairList;
import org.example.data.ManufacturerList;
import org.example.data.SouvenirList;
import org.example.SI.FI;
import org.example.factory.creatingOfNewSouvenir;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
        }

    private void menu() {
        println("[1] Завершити програму");
        println("[2] Заповнити усі дані");
        println("[3] Вивести сувеніри за вказаним виробником");
        println("[4] Вивести сувеніри за вказаною країною");
        println("[5] Вивести інформацію про виробників, чиї ціни на сувеніри менше заданої");
        println("[6] Вивести інформацію по всіх виробниках та, для кожного виробника вивести інформацію\n" +
                "про всі сувеніри, які він виробляє.");
        println("[7] Вивести інформацію по виробнику за датою виробництва та назвою сувеніра.");
        println("[9] Вивести всі сувеніри.");
        println("[10] Додати новий сувенір.");

        System.out.print(">> ");
    }
    private void run() {
        ManufacturerList manufacturers = new ManufacturerList();
        SouvenirList souvenirs = new SouvenirList();
        MSPairList pairs = new MSPairList();
        ManufacturerFunctions funs = new manufacturerFunctionsProcessor();
        FI factory = new creatingOfNewSouvenir();
        loop:
        while (true) {
            menu();
            Scanner scanner = new Scanner(System.in);
            int m = scanner.nextInt();
            switch (m) {

                case 2 -> {
                    funs.createPairs(pairs);
                    funs.createManufacturersData(manufacturers);
                    funs.createSouvenirsData(souvenirs);
                }
                case 3 -> funs.showSouvenirsByManufacturer(pairs, scanner, souvenirs);
                case 4 -> funs.showSouvenirsByCountry(pairs, scanner, manufacturers, souvenirs);
                case 5 -> funs.showManufacturersByPrice(pairs, scanner, manufacturers, souvenirs);
                case 6 -> funs.showAll(pairs, scanner, manufacturers, souvenirs);
                case 7 -> funs.showManufacturersBySouvenirYear(pairs, scanner, manufacturers, souvenirs);
                case 8 -> funs.showSouvenirsByYear(pairs, scanner, manufacturers, souvenirs);
                case 9 -> funs.showAllSouvenirs(souvenirs);
                case 10 -> factory.createNewSouvenir(scanner, souvenirs);
                case 1 -> {
                    break loop;
                }
            }
        }

    }

    private void println(String value) {
        System.out.println(value);
    }
}
