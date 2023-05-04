package io.bootify.real_estate.repos;

import io.bootify.real_estate.domain.Houses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface HousesRepository extends JpaRepository<Houses, Integer> {
    List<Houses> getByZipCode(String zip);

    List<Houses> getByState(String state);

    List<Houses> getByCity(String city);

    List<Houses> getByPrice(BigDecimal price);

    List<Houses> getByBed(Integer bed);

    List<Houses> getByBath(Integer bath);

    List<Houses> findByCity(String city);
//    List<Houses> getByZip(String zip);
}
