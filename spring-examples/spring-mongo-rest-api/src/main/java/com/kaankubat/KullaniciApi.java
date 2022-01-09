package com.kaankubat;

import com.kaankubat.entity.Kullanici;
import com.kaankubat.repository.KullaniciRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//hhtp işlemleri(controller)

@RestController
@RequestMapping("/kullanici")
public class KullaniciApi {
    @Autowired
    private KullaniciRepository kullaniciRepository;

    @PostMapping
    public ResponseEntity<Kullanici> ekle(Kullanici kullanici) {
        return ResponseEntity.ok(kullaniciRepository.save(kullanici));
    }

    @GetMapping
    public ResponseEntity<List> tümünüListele(Kullanici kullanici) {
        return ResponseEntity.ok(kullaniciRepository.findAll());
    }
}
