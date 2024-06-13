package com.mongo.mongo.service;

import com.mongo.mongo.entity.Report;
import com.mongo.mongo.entity.ReportDetails;
import com.mongo.mongo.repository.ReportDetailsRepository;
import com.mongo.mongo.repository.ReportRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ReportServiceImpl implements ReportService {

    private final ReportRepository reportRepository;

    private final ReportDetailsRepository reportDetailsRepository;

    @Override
    @Transactional
    public Report saveReport(Report report) {
        return reportRepository.save(report);
    }


    @Override
    public Report getReportById(UUID id) {
        return reportRepository.findById(id).orElseThrow(()->new NoSuchElementException("There is no report with id: "+id));
    }

    @Override
    public List<Report> getReportsByCompany(UUID companyId) {
        return reportRepository.getReportsByCompany_Id(companyId);
    }
}