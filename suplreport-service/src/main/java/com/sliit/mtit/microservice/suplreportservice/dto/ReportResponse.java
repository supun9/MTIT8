package com.sliit.mtit.microservice.suplreportservice.dto;

public class ReportResponse {


    private String reportId;
    private String reportnote;

    public String getReportId() {
        return reportId;
    }

    public void setReportId(String reportId) {
        this.reportId = reportId;
    }

    public String getReportnote(String supplier_add_successfully) {
        return reportnote;
    }

    public void setReportnote(String reportnote) {
        this.reportnote = reportnote;
    }


}
