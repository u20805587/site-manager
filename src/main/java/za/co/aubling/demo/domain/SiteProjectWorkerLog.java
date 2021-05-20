package za.co.aubling.demo.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "site_project_worker_log")
public class SiteProjectWorkerLog implements Serializable {

    @Id
    @ManyToOne
    @JoinColumn (name = "project_id")
    private SiteProject projectId;

    @Id
    @ManyToOne
    @JoinColumn (name = "worker_id")
    private SiteWorker workerId;

    @Id
    @Column (name = "work_date")
    private Date workDate;

    @Column(name = "hours")
    private BigDecimal hours;

}