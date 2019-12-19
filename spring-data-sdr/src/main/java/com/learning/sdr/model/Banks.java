package com.learning.sdr.model;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.rest.core.annotation.RestResource;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "banks")
@Data
public class Banks {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String bankCode;

    private String bankName;

    private BigDecimal minBalance;

    private BigDecimal balance;

    private String accountType;

    private String active;

}
