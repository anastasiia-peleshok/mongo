package com.mongo.mongo.service;

import com.mongo.mongo.entity.Report;
import com.mongo.mongo.entity.ReportDetails;

import java.util.List;
import java.util.UUID;

public interface ReportService {
    Report saveReport(Report report);
    Report getReportById(UUID id);
    List<Report> getReportsByCompany(UUID companyId);
}