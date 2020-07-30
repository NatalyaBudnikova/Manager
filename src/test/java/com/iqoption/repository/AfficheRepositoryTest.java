package com.iqoption.repository;

import com.iqoption.domain.AfficheItem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AfficheRepositoryTest {
    @Test
    void removeById() {
        AfficheRepository repository = new AfficheRepository();
        AfficheItem item1 = new AfficheItem(1, "title1", "comedy", "https://avatars.mds.yandex.net/get-afishanew/1");
        AfficheItem item2 = new AfficheItem(2, "title2", "drama", "https://avatars.mds.yandex.net/get-afishanew/2");
        AfficheItem item3 = new AfficheItem(3, "title3", "thriller", "https://avatars.mds.yandex.net/get-afishanew/3");

        repository.save(item1);
        repository.save(item2);
        repository.save(item3);

        repository.removeById(2);

        AfficheItem[] expected = {item1, item3};
        assertArrayEquals(expected, repository.findAll());
    }

    @Test
    void removeByIdWithoutItems() {
        AfficheRepository repository = new AfficheRepository();
        repository.removeById(2);

        AfficheItem[] expected = {};
        assertArrayEquals(expected, repository.findAll());
    }

    @Test
    void removeAll() {
        AfficheRepository repository = new AfficheRepository();
        AfficheItem item1 = new AfficheItem(1, "title1", "comedy", "https://avatars.mds.yandex.net/get-afishanew/1");
        AfficheItem item2 = new AfficheItem(2, "title2", "drama", "https://avatars.mds.yandex.net/get-afishanew/2");
        AfficheItem item3 = new AfficheItem(3, "title3", "thriller", "https://avatars.mds.yandex.net/get-afishanew/3");

        repository.save(item1);
        repository.save(item2);
        repository.save(item3);

        repository.removeAll();

        AfficheItem[] expected = {};
        assertArrayEquals(expected, repository.findAll());
    }

    @Test
    void removeAllWithoutItems() {
        AfficheRepository repository = new AfficheRepository();
        repository.removeAll();

        AfficheItem[] expected = {};
        assertArrayEquals(expected, repository.findAll());
    }

    @Test
    void findById() {
        AfficheRepository repository = new AfficheRepository();
        AfficheItem item1 = new AfficheItem(1, "title1", "comedy", "https://avatars.mds.yandex.net/get-afishanew/1");
        AfficheItem item2 = new AfficheItem(2, "title2", "drama", "https://avatars.mds.yandex.net/get-afishanew/2");
        AfficheItem item3 = new AfficheItem(3, "title3", "thriller", "https://avatars.mds.yandex.net/get-afishanew/3");

        repository.save(item1);
        repository.save(item2);
        repository.save(item3);

        assertEquals(item2, repository.findByID(2));
    }

    @Test
    void findByIdNotFind() {
        AfficheRepository repository = new AfficheRepository();
        AfficheItem item1 = new AfficheItem(1, "title1", "comedy", "https://avatars.mds.yandex.net/get-afishanew/1");
        AfficheItem item2 = new AfficheItem(2, "title2", "drama", "https://avatars.mds.yandex.net/get-afishanew/2");
        AfficheItem item3 = new AfficheItem(3, "title3", "thriller", "https://avatars.mds.yandex.net/get-afishanew/3");

        repository.save(item1);
        repository.save(item2);
        repository.save(item3);

        assertEquals(null, repository.findByID(5));
    }



}