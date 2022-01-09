package com.kaankubat.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashMap;

// Veri tabanı içerisinde bir collectiona (tablo) denk gelen verinin modelini(entity) tutan class

@Document
public class Kullanici {
    @Id
    private String id;
    private String adi;
    private String soyadi;
    private HashMap ozellikleri;
}
