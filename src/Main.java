import model.Contact;
import model.GroceryList;
import model.MobilePhone;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GroceryList groceryList = new GroceryList();
        int choice;
        do {
            System.out.println("Yapılmak istenen operasyonu seçin(0: çıkış, 1: ekleme, 2:çıkarma)");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("eklemek istediğiniz elemanları giriniz:");
                    String itemsToAdd = scanner.nextLine();
                    groceryList.addItems(itemsToAdd);
                    break;
                case 2:
                    System.out.println("silmek istediğiniz elemanları giriniz:");
                    String itemsToRemoved = scanner.nextLine();
                    groceryList.removeItems(itemsToRemoved);
                    break;
                default:
                    break;
            }
            groceryList.printSorted();
        } while (choice != 0);
        scanner.close();

        System.out.println("------------------------");

        Contact hazal = new Contact("hazal","5454545454");
        Contact bugra = new Contact("bugra", "8787985626");
        Contact umut = new Contact("umut", "8787985626");

        MobilePhone mobilePhone = new MobilePhone("7854542128");
        mobilePhone.addNewContact(hazal);
        mobilePhone.addNewContact(bugra);
        mobilePhone.printContacts();
        mobilePhone.findContact("hazal");
        mobilePhone.updateContact(hazal,umut);
        mobilePhone.printContacts();
    }
}