package com.mongo.mongo.config;

import com.mongo.mongo.entity.ReportDetails;
import org.springframework.data.mongodb.core.mapping.event.BeforeConvertCallback;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class ReportDetailsCallback implements BeforeConvertCallback<ReportDetails> {

    @Override
    public ReportDetails onBeforeConvert(ReportDetails entity, String collection) {
        if (entity.getId() == null) {
            entity.setId(UUID.randomUUID());
        }
        return entity;
    }
}