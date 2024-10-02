package org.example.UI;

import org.example.data.*;
import org.example.factory.SouvenirFactory;

import java.time.LocalDate;
import java.util.Scanner;

public class manufacturerFunctionsProcessor implements ManufacturerFunctions{


    public void showSouvenirsByName(ManufacturerList manufacturers, Scanner scanner) {
        System.out.print("Введіть виробника >> ");
        String name = scanner.next();
        manufacturers.showSouvenirsByName(name);
    }

    public void showProductsByCountry(ManufacturerList manufacturers, Scanner scanner) {
        System.out.print("Введіть країну виробника >> ");
        String country = scanner.next();
        manufacturers.showProductsByCountry(country);
    }

    @Override
    public void createManufacturersData(ManufacturerList manufacturers){
        manufacturers.addManufacturer(new Manufacturer("Приватбанк","Україна"));
        manufacturers.addManufacturer(new Manufacturer("Монобанк","Україна"));
        manufacturers.addManufacturer(new Manufacturer("be_quiet!","Німеччина"));
    }

    @Override
    public void createSouvenirsData(SouvenirList souvenirs){
        souvenirs.addSouvenir(new Souvenir("Фірмова чашка","-", LocalDate.of(2020,11,25),100));
        souvenirs.addSouvenir(new Souvenir("Фірмова футболка","-", LocalDate.of(2020,11,25),100));
        souvenirs.addSouvenir(new Souvenir("Фірмові наліпки","-", LocalDate.of(2022,11,25),200));
        souvenirs.addSouvenir(new Souvenir("Фірмова кепка","-", LocalDate.of(2021,11,25),100));
    }

    @Override
    public void createPairs(MSPairList pairs){
        pairs.addPair(new ManufacturerSouvenirPair("Монобанк","Фірмова чашка"));
        pairs.addPair(new ManufacturerSouvenirPair("Монобанк","Фірмова футболка"));
        pairs.addPair(new ManufacturerSouvenirPair("Монобанк","Фірмові наліпки"));
        pairs.addPair(new ManufacturerSouvenirPair("be_quiet!","Фірмові наліпки"));
        pairs.addPair(new ManufacturerSouvenirPair("Приватбанк","Фірмова футболка"));
    }



    @Override
    public void showSouvenirsByManufacturer(MSPairList pairs, Scanner sc, SouvenirList souvenirs) {
        System.out.print("Enter name of products >> ");
        String name = sc.next();
        pairs.showSouvenirsByManufacturer(name, souvenirs);
    }

    @Override
    public void showManufacturersByPrice(MSPairList pairs, Scanner sc, ManufacturerList manufacturers, SouvenirList souvenirs) {
        System.out.print("Enter price of products >> ");
        int price = sc.nextInt();
        pairs.showManufacturersByPrice(price, manufacturers, souvenirs);
    }

    @Override
    public void showManufacturersBySouvenirYear(MSPairList pairs, Scanner sc, ManufacturerList manufacturers, SouvenirList souvenirs) {
        System.out.print("Enter day >> ");
        int d = sc.nextInt();
        System.out.print("Enter month >> ");
        int m = sc.nextInt();
        System.out.print("Enter year >> ");
        int y = sc.nextInt();
        System.out.print("Enter name of products >> ");
        String name = sc.next();
        LocalDate date = LocalDate.of(y, m, d);
        pairs.showManufacturersBySouvenirYear(name, date, manufacturers, souvenirs);
    }

    @Override
    public void showSouvenirsByYear(MSPairList pairs, Scanner scanner, ManufacturerList manufacturers, SouvenirList souvenirs) {
        pairs.showSouvenirsByYear(souvenirs);
    }

    @Override
    public void showSouvenirsByCountry(MSPairList pairs, Scanner sc, ManufacturerList manufacturers, SouvenirList souvenirs) {
        System.out.print("Enter name of products >> ");
        String country = sc.next();
        pairs.showSouvenirsByCountry(country, manufacturers, souvenirs);
    }

    @Override
    public void showAll(MSPairList pairs, Scanner scanner, ManufacturerList manufacturers, SouvenirList souvenirs) {
        pairs.showAllSouvsAndMans(manufacturers, souvenirs);
    }

    @Override
    public void showAllSouvenirs(SouvenirList souvenir) {
        for (int i = 0; i < souvenir.getSize(); i++) {
            System.out.println(souvenir.getSouvenirs()[i]);
        }
    }

//    @Override
//    public void createNewSouvenir(Scanner scanner, SouvenirList souvenirs) {
//        SouvenirFactory factory = new SouvenirFactory();
//
//        System.out.print("Введіть назву >> ");
//        String name = scanner.next();
//        System.out.print("Введіть реквізити >> ");
//        String requisites = scanner.next();
//        System.out.print("Введіть дату виробництва >> ");
//        LocalDate releaseDate = LocalDate.parse(scanner.next());
//        System.out.print("Введіть ціну >> ");
//        int price = scanner.nextInt();
//
//        Souvenir newSouvenir = factory.createSouvenir(name, requisites, releaseDate, price);
//        souvenirs.addSouvenir(newSouvenir);
//    }



}
