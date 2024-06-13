package com.mongo.mongo.service;

import com.mongo.mongo.entity.ReportDetails;

import java.util.UUID;

public interface ReportDetailsService {
    ReportDetails saveReportDetails(ReportDetails reportDetails);
    ReportDetails getReportDetailsByReportId(UUID reportId);
}
