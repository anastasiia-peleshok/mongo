package com.mongo.mongo.repository;
import com.mongo.mongo.entity.ReportDetails;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;
import java.util.UUID;
public interface ReportDetailsRepository extends MongoRepository<ReportDetails, UUID> {
Optional<ReportDetails> findReportDetailsByReportId(UUID reportId);
}