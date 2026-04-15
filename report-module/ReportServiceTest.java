package com.devops.report;

import com.devops.evaluation.Result;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ReportServiceTest {

    @Test
    void testReportGeneration() {
        ReportService service = new ReportService();

        Result result = new Result(90);
        Report report = service.generate("John", result);

        assertEquals("John scored 90%", report.getMessage());
    }

    @Test
    void testAnotherUser() {
        ReportService service = new ReportService();

        Result result = new Result(50);
        Report report = service.generate("Alice", result);

        assertEquals("Alice scored 50%", report.getMessage());
    }
}