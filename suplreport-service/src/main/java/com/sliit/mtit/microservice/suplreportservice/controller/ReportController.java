package com.sliit.mtit.microservice.suplreportservice.controller;


import com.sliit.mtit.microservice.suplreportservice.dto.ReportRequest;
import com.sliit.mtit.microservice.suplreportservice.dto.ReportResponse;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/report")
public class ReportController {

    @PostMapping(consumes = "application/json",produces = "application/json")
public @ResponseBody ReportResponse addreport(@RequestBody ReportRequest request){

        System.out.println("report Details : "+request);

        var reportResponse = new ReportResponse();
        reportResponse.setReportId(UUID.randomUUID().toString());
        reportResponse.setReportnote("Add suses");

    return reportResponse;
    }
}
