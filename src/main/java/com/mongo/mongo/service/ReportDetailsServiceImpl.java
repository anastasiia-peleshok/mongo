package com.mongo.mongo.service;

import com.mongo.mongo.entity.Report;
import com.mongo.mongo.entity.ReportDetails;
import com.mongo.mongo.repository.ReportDetailsRepository;
import com.mongo.mongo.repository.ReportRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ReportDetailsServiceImpl implements ReportDetailsService {

    private final ReportDetailsRepository reportDetailsRepository;
    private final ReportRepository reportRepository;

    @Override
    @Transactional
    public ReportDetails saveReportDetails(ReportDetails reportDetails) {
           Report report = reportRepository.findById(reportDetails.getReportId()).orElseThrow(()->new NoSuchElementException("There is no report with id: "+reportDetails.getReportId()));
            reportDetails.setReportId(report.getId());
        return reportDetailsRepository.save(reportDetails);
    }

    @Override
    public ReportDetails getReportDetailsByReportId(UUID reportId) {
        return reportDetailsRepository.findReportDetailsByReportId(reportId).orElseThrow(()->new NoSuchElementException("There is no report with id: "+reportId));
    }
}