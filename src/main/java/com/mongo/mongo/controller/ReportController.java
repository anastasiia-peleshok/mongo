package com.mongo.mongo.controller;

import com.mongo.mongo.entity.Company;
import com.mongo.mongo.entity.Report;
import com.mongo.mongo.service.ReportServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/report")
@RequiredArgsConstructor
public class ReportController {
    private final ReportServiceImpl reportService;
    @GetMapping("/company/{companyId}")
    public ResponseEntity<List<Report>> getAllReportsByCompany(@PathVariable UUID companyId){
        return ResponseEntity.ok(reportService.getReportsByCompany(companyId));
    }
    @GetMapping("/{uuid}")
    public ResponseEntity<Report> getReportById(@PathVariable UUID uuid){
        return ResponseEntity.ok(reportService.getReportById(uuid));
    }
    @PostMapping()
    public ResponseEntity<Report> addReport(@RequestBody Report report){
        return ResponseEntity.ok(reportService.saveReport(report));
    }
}
