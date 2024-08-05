package com.jap;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ElectronicListService {
    //add all the electronics items inside the List
    public static List<String> addElectronicsItemsToList(String electronicsItems) {
       List<String> itemList = new ArrayList<>();
        String[] items = electronicsItems.split(",");

        for(String item : items) {
            if(!itemList.contains(item)) {
                itemList.add(item);
            }
        }
        return itemList;
    }

    //search the electronic item from the list and return the index position
    public static int searchElectronicItemInList(List<String> itemList, String searchItem) {
        return itemList.indexOf(searchItem);
    }

    //remove the electronic item from the list using iterator
    public static boolean removeElectronicsItemFromList(List<String> itemList, String removeItem)
    {
        Iterator<String> iterator = itemList.iterator();

        while(iterator.hasNext()) {
            String item = iterator.next();

            if(item.equals(removeItem)) {
                iterator.remove();
                return true;
            }
        }

        return false;
    }



}
