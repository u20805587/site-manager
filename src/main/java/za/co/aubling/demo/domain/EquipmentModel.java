package za.co.aubling.demo.domain;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "equipment_mode")
public class EquipmentModel {

    @Id
    @Column(name = "brand")
    private Long brand;

    @Id
    @Column(name = "model")
    private String model;

    @Column(name = "type")
    private String type;

    @Column(name = "year")
    private String year;
}