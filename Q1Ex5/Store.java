/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex05photonmapola;
import java.util.ArrayList;

/**
 *
 * @author Rebecca
 */
public class Store {
    private String name;
    private double earnings;
    private ArrayList<Item> itemList;
    private static ArrayList<Store> storeList = new ArrayList();

    public Store(String name){
        this.name = name;
        this.earnings = 0;
        itemList = new ArrayList();
        storeList.add(this);     
    }

    public String getName(){
        return name;
    }
    
    public double getEarnings(){
        return earnings;
    }
    
    public void sellItem(int index){
        if (itemList.size() >= index) {
            // get Item at index from itemList and add its cost to earnings
            earnings += itemList.get(index).getCost();
            // print statement indicating the sale
            System.out.printf("%s just sold %s%n", getName(), itemList.get(index).getName());
            System.out.printf("Earnings: %.2f%n%n", getEarnings());       
        } else {
            /* check if index is within the size of the itemList
            (if not, print statement that there are only x items in the store)*/
            System.out.printf("%s only has %d products%n%n", getName(), itemList.size());
        }      
    }
    
    public void sellItem(String name){
        /* check if Item with given name is in the itemList
        (you will need to loop over itemList)*/
        for(Item i: itemList){
            if (i.getName().equalsIgnoreCase(name)) {
                // get Item from itemList and add its cost to earnings
                earnings += i.getCost();
                // print statement indicating the sale
                System.out.printf("%s just sold %s%n", getName(), i.getName());
                System.out.printf("Earnings: %.2f%n%n", earnings);
                break;
            } else {
                // (if not, print statement that the store doesn't sell it)
                System.out.printf("%s does not sell %s%n%n", getName(), name);
            }
        }
    }
    
    public void sellItem(Item i){
        // check if Item i exists in the store (there is a method that can help with this)       
        if (itemList.contains(i)) {
            // get Item i from itemList and add its cost to earnings
           earnings += i.getCost();
            // print statement indicating the sale
            System.out.printf("%s just sold %s%n", getName(), i.getName());
            System.out.printf("Earnings: %.2f%n%n", getEarnings());
      } else {
            //if not, print statement that the store doesn't sell it)
            System.out.printf("%s does not sell %s%n%n", getName(), i.getName());            
        }
    }
    
    public void addItem(Item i){
      // add Item i to store's itemList
      itemList.add(i);
    }
    
    public void filterType(String type){
      // loop over itemList and print all items with the specified type      
      System.out.printf("Items in %s with the specified type:%n", getName());
      for(Item i: itemList){
        if (i.getType().equals(type)) {
            System.out.printf("%s%n", i.getName());
        }
      }
        System.out.println();
    }
    public void filterCheap(double maxCost){
      // loop over itemList and print all items with a cost lower than or equal to the specified value
      System.out.printf("Items in %s with a lower or equal cost:%n", getName());
      for(Item i: itemList){
        double x = i.getCost();
        if (x <= maxCost) {
            System.out.printf("%s%n", i.getName());
        }
      }
        System.out.println();
    }
    public void filterExpensive(double minCost){
      // loop over itemList and print all items with a cost higher than or equal to the specified value
      System.out.printf("Items in %s with a higher or equal cost:%n", name);
      for(Item i: itemList){
        double x = i.getCost();
        if (minCost<= x) {
            System.out.printf("%s%n", i.getName());
        }
      }
        System.out.println();
    }
    public static void printStats(){
      // loop over storeList and print the name and the earnings'Store.java'
        for (Store s: storeList) {
            System.out.printf("Name: %s%nEarnings: %s%n%n", s.getName(), s.getEarnings());
        }
    }
}
