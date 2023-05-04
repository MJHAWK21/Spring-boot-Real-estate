package io.bootify.real_estate.controller;

//import org.springframework.stereotype.Controller;
import io.bootify.real_estate.domain.Houses;
import io.bootify.real_estate.repos.HousesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/HOME")
public class HomeController {


   @Autowired
   private HousesRepository repo;
    @GetMapping("/getdate")
    public List<Houses> getData(){
        return repo.findAll();
    }
    @GetMapping("/{zip}")
    public List<Houses> getByZipId(@PathVariable String zip ){
        return repo.getByZipCode(zip);
    }
    @GetMapping("/state/{state}")
    public List<Houses> getByStateValue(@PathVariable String state){
        return  repo.getByState(state);
    }
    @GetMapping("/aaa/gg/{city}")
    public List<Houses> getByCityValue(@PathVariable String city){
        return repo.getByCity(city);
    }
    @GetMapping("/price/{price}")
    public  List<Houses> getByPriceValue(@PathVariable BigDecimal price){
        return repo.getByPrice(price);
    }
    @GetMapping("/bed/{bed}")
    public List<Houses> getByBedValue(@PathVariable Integer bed){
        return repo.getByBed(bed);
    }
    @GetMapping("/bath/{bath}")
    public List<Houses> getByBathValue(@PathVariable Integer bath){
        return repo.getByBath(bath);
    }
    @GetMapping("/status/{city}")
    public int getCountOfForSalePropertiesInCity(@PathVariable String city) {
        List<Houses> propertiesInCity = repo.findByCity(city);
        int count = (int) propertiesInCity.stream()
                .filter(p -> p.getStatus().equals("for_sale"))
                .count();
        return count;
    }
    
}
