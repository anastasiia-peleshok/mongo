package com.mongo.mongo.repository;
import com.mongo.mongo.entity.Company;
import com.mongo.mongo.entity.Report;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;
@Repository
public interface ReportRepository extends JpaRepository<Report, UUID> {
    List<Report> getReportsByCompany_Id(UUID companyId);
}