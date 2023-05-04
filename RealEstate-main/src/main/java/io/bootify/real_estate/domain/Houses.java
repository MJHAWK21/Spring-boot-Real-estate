package io.bootify.real_estate.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Houses {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 20)
    private String status;

    @Column(nullable = false)
    private Integer bed;

    @Column(nullable = false)
    private Integer bath;

    @Column(nullable = false, precision = 12, scale = 2)
    private double acreLot;

    @Column(nullable = false, length = 50)
    private String city;

    @Column(nullable = false, length = 50)
    private String state;

    @Column(nullable = false, length = 10)
    private String zipCode;

    @Column(nullable = false)
    private Double houseSize;

    @Column
    private String prevSoldDate;

    @Column(nullable = false, precision = 12, scale = 2)
    private BigDecimal price;

}
