package model;

import java.util.ArrayList;
import java.util.Collections;

public class GroceryList {
    private ArrayList<String> items;

    public GroceryList() {
        this.items = new ArrayList<>();
    }

    public void addItems(String items){
       String[] splitItems = items.split(",");
       for(String item: splitItems){
           String trimItem = item.trim();
           if(checkItemIsInList(trimItem)) {
               System.out.println("Bu ürün mevcut: " + trimItem);
           }else{
               this.items.add(trimItem);
               sortItems();
           }
       }
    }
    public void removeItems(String items){
        String[] splitItems = items.split(",");
        for(String item: splitItems){
            String trimItem = item.trim();
            if(checkItemIsInList(trimItem)){
                this.items.remove(trimItem);
            }else{
                System.out.println("Ürün listede mevcut değil: " + trimItem);
            }
        }
    }

    public void printSorted(){
        System.out.println("Mevcut pazar listesi: ");
        for(String item: this.items){
            System.out.println(item);
        }
    }

    public boolean checkItemIsInList(String item){
        return items.contains(item);
    }

    public void sortItems(){
        Collections.sort(this.items);
    }

}
