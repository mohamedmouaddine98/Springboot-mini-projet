package com.miniprojet.miniprojet.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity

public class CaseTest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long caseId;

    @Temporal(TemporalType.TIMESTAMP)
    private Date creationDate;

    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdateDate;

    @Column(length = 255)
    private String title;
    @Column(length = 2056)
    private String description;

    @PrePersist
    protected void onCreate(){
        creationDate = new Date();
        lastUpdateDate=creationDate;
    }
    protected void onUpdate(){
        lastUpdateDate=new Date();
    }

}
