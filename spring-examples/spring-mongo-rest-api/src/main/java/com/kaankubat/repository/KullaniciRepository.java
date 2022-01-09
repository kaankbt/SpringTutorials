package com.kaankubat.repository;

import com.kaankubat.entity.Kullanici;
import org.springframework.data.mongodb.repository.MongoRepository;

/*Entity aracılığıyla veri tabanına bağlanıp veritabanından getirilen veri tabanına
kaydet gibi kök işlemlerimizi yapacak katman repository'dir.Repository interface olmalı ve repository çağrılmalı.
*/

public interface KullaniciRepository extends MongoRepository<Kullanici,String> {
}
