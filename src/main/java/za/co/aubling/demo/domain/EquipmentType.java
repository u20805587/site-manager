package za.co.aubling.demo.domain;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "equipment_type")
public class EquipmentType {

    @Id
    @Column(name = "task_id")
    private Long taskId;

    @Id
    @Column(name = "type")
    private String type;

}
