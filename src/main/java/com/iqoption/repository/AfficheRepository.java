package com.iqoption.repository;

import com.iqoption.domain.AfficheItem;

public class AfficheRepository {
    private AfficheItem[] items = new AfficheItem[0];

    public void save(AfficheItem item) {
        AfficheItem[] tmp = new AfficheItem[items.length + 1];

        System.arraycopy(items,0, tmp, 0, items.length);

        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;

        items = tmp;
    }

    public AfficheItem[] findAll() {
        return items;
    }

    public AfficheItem findByID(int id) {
        AfficheItem findItem = null;
        for (AfficheItem item : items) {
            if (item.getId() == id) {
               findItem = item;
               break;
            }
        }
        return findItem;
    }

    public void removeById(int id) {
        if (items.length <= 0) {
            return;
        }
        boolean exist = false;
        for (AfficheItem item : items) {
            if (item.getId() == id) {
                exist = true;
                break;
            }
        }
        if (exist) {
            AfficheItem[] tmp = new AfficheItem[items.length - 1];
            int index = 0;
            for (AfficheItem item : items) {
                if (item.getId() != id) {
                    tmp[index] = item;
                    index++;
                }
            }
            items = tmp;
        }
    }

    public void removeAll() {
        items = new AfficheItem[0];
    }


}
