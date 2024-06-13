package com.mongo.mongo.controller;

import com.mongo.mongo.entity.Report;
import com.mongo.mongo.entity.ReportDetails;
import com.mongo.mongo.service.ReportDetailsServiceImpl;
import com.mongo.mongo.service.ReportServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/reportDetails")
@RequiredArgsConstructor
public class ReportDetailsController {
    private final ReportDetailsServiceImpl reportDetailsService;

    @GetMapping("/{reportId}")
    public ResponseEntity<ReportDetails> getReportDetailsByReportId(@PathVariable UUID reportId){
        return ResponseEntity.ok(reportDetailsService.getReportDetailsByReportId(reportId));
    }
    @PostMapping()
    public ResponseEntity<ReportDetails> addReportDetails(@RequestBody ReportDetails reportDetails){
        return ResponseEntity.ok(reportDetailsService.saveReportDetails(reportDetails));
    }
}
