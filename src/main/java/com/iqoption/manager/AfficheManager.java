package com.iqoption.manager;

import com.iqoption.domain.AfficheItem;

public class AfficheManager {

    static final int DEFAULT_QUANTITY = 10;
    private AfficheItem[] items = new AfficheItem[0];

    public void add(AfficheItem item) {
        AfficheItem[] tmp = new AfficheItem[items.length + 1];

        System.arraycopy(items,0, tmp, 0, items.length);

        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;

        items = tmp;
    }

//    public AfficheItem[] getAll() {
//        AfficheItem[] tmp = new AfficheItem[items.length];
//        for (int i = 0; i < tmp.length; i++) {
//            int secondCursor = items.length - i - 1;
//            tmp[i] = items[secondCursor];
//        }
//        return tmp;
//    }

    public AfficheItem[] getLasts() {
        int quantity = Math.min(items.length, DEFAULT_QUANTITY);
        AfficheItem[] tmp = new AfficheItem[quantity];
        int tmpIndex = 0;
        for (int lastIndex = items.length - 1; lastIndex >= 0 && tmpIndex <= quantity-1; lastIndex--) {
            tmp[tmpIndex] = items[lastIndex];
            tmpIndex++;
        }
        return tmp;
    }

    public AfficheItem[] getLasts(int quantity) {
        quantity = Math.min(items.length, quantity);
        AfficheItem[] tmp = new AfficheItem[quantity];
        int tmpIndex = 0;
        for (int lastIndex = items.length - 1; lastIndex >= 0 && tmpIndex <= quantity-1; lastIndex--) {
            tmp[tmpIndex] = items[lastIndex];
            tmpIndex++;
        }
        return tmp;
    }


}
