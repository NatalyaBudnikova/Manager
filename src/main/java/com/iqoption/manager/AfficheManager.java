package com.iqoption.manager;

import com.iqoption.domain.AfficheItem;
import com.iqoption.repository.AfficheRepository;

public class AfficheManager {

    static final int DEFAULT_QUANTITY = 10;
    private AfficheRepository repository;

    public AfficheManager(AfficheRepository repository) {
        this.repository = repository;
    }

    public void add(AfficheItem item) {
        repository.save(item);
    }

    public AfficheItem[] findAll() {
        AfficheItem[] items = repository.findAll();
        AfficheItem[] tmp = new AfficheItem[items.length];
        for (int i = 0; i < tmp.length; i++) {
            int secondCursor = items.length - i - 1;
            tmp[i] = items[secondCursor];
        }
        return tmp;
    }

    public AfficheItem[] findDefault() {
        AfficheItem[] items = repository.findAll();
        int quantity = Math.min(items.length, DEFAULT_QUANTITY);
        AfficheItem[] tmp = new AfficheItem[quantity];
        int tmpIndex = 0;
        for (int lastIndex = items.length - 1; lastIndex >= 0 && tmpIndex <= quantity-1; lastIndex--) {
            tmp[tmpIndex] = items[lastIndex];
            tmpIndex++;
        }
        return tmp;
    }

    public AfficheItem[] findParam(int quantity) {
        AfficheItem[] items = repository.findAll();
        quantity = Math.min(items.length, quantity);
        AfficheItem[] tmp = new AfficheItem[quantity];
        int tmpIndex = 0;
        for (int lastIndex = items.length - 1; lastIndex >= 0 && tmpIndex <= quantity-1; lastIndex--) {
            tmp[tmpIndex] = items[lastIndex];
            tmpIndex++;
        }
        return tmp;
    }

    public AfficheItem findById(int id) {
        return repository.findByID(id);
    }

    public void removeById(int id) {
        repository.removeById(id);
    }

    public void removeAll() {
        repository.removeAll();
    }

}
