package com.mongo.mongo.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.UUID;
@RequiredArgsConstructor
@Getter
@Setter
@Document(collection = "ReportDetails")
public class ReportDetails {

    @Id
    private UUID id;

    @Field("report_id")
    private UUID reportId;

    @Field("financial_data")
    private String financialData;

    private String comments;

//    @PrePersist
//    public void prePersist() {
//        if (id == null) {
//            id = UUID.randomUUID();
//        }
//    }
}