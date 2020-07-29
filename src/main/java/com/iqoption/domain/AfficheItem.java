package com.iqoption.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AfficheItem {
    private int id;
    private String title;
    private String genre;
    private String linkImage;
}
