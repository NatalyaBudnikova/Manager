package com.iqoption.manager;

import com.iqoption.domain.AfficheItem;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AfficheManagerTest {
    AfficheManager manager = new AfficheManager();
    AfficheItem item1 = new AfficheItem(1, "title1", "comedy", "https://avatars.mds.yandex.net/get-afishanew/1");
    AfficheItem item2 = new AfficheItem(2, "title2", "drama", "https://avatars.mds.yandex.net/get-afishanew/2");
    AfficheItem item3 = new AfficheItem(3, "title3", "thriller", "https://avatars.mds.yandex.net/get-afishanew/3");
    AfficheItem item4 = new AfficheItem(4, "title4", "fantasy", "https://avatars.mds.yandex.net/get-afishanew/4");
    AfficheItem item5 = new AfficheItem(5, "title5", "comedy", "https://avatars.mds.yandex.net/get-afishanew/5");
    AfficheItem item6 = new AfficheItem(6, "title6", "fantasy", "https://avatars.mds.yandex.net/get-afishanew/6");
    AfficheItem item7 = new AfficheItem(7, "title7", "drama", "https://avatars.mds.yandex.net/get-afishanew/7");
    AfficheItem item8 = new AfficheItem(8, "title8", "drama", "https://avatars.mds.yandex.net/get-afishanew/8");
    AfficheItem item9 = new AfficheItem(9, "title9", "drama", "https://avatars.mds.yandex.net/get-afishanew/9");
    AfficheItem item10 = new AfficheItem(10, "title10", "drama", "https://avatars.mds.yandex.net/get-afishanew/10");
    AfficheItem item11 = new AfficheItem(11, "title11", "drama", "https://avatars.mds.yandex.net/get-afishanew/11");

    @BeforeEach
    void setUp() {
        manager.add(item1);
        manager.add(item2);
        manager.add(item3);
        manager.add(item4);
        manager.add(item5);
        manager.add(item6);
        manager.add(item7);
        manager.add(item8);
        manager.add(item9);
        manager.add(item10);
        manager.add(item11);
    }

    @Test
    void lastsDefault() {
        AfficheItem[] expected = {item11, item10, item9, item8, item7, item6, item5, item4, item3, item2};
        assertArrayEquals(expected, manager.getLasts());
    }

    @Test
    void lastsLessDefault() {
        AfficheManager manager = new AfficheManager();
        manager.add(item1);
        manager.add(item2);
        manager.add(item3);
        AfficheItem[] expected = {item3, item2, item1};
        assertArrayEquals(expected, manager.getLasts());
    }

    @Test
    void lastsDefaultParam() {
        AfficheItem[] expected = {item11, item10, item9, item8, item7, item6, item5, item4, item3, item2, item1};
        assertArrayEquals(expected, manager.getLasts(11));
    }

    @Test
    void lastsLessDefaultParam() {
        AfficheManager manager = new AfficheManager();
        manager.add(item1);
        manager.add(item2);
        manager.add(item3);
        AfficheItem[] expected = {item3, item2, item1};
        assertArrayEquals(expected, manager.getLasts(5));
    }

}