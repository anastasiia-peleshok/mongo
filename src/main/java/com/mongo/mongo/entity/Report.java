package com.mongo.mongo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.UUID;

@RequiredArgsConstructor
@Getter
@Setter
@Entity
public class Report {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @ManyToOne
    @JoinColumn(name="company_id")
    private Company company;
    @Column(name = "report_date")
    private Timestamp reportDate;
    @Column(name = "total_revenue")
    private BigDecimal totalRevenue;
    @Column(name = "net_profit")
    private BigDecimal netProfit;

    @PrePersist
    protected void onCreate() {
        if (reportDate == null) {
            reportDate =  new java.sql.Timestamp(System.currentTimeMillis());
        }
    }
}
