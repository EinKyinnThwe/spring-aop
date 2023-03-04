package com.demo.format;

import com.demo.annotation.Logger;
import com.demo.ds.Report;
import org.springframework.stereotype.Component;

@Component @Logger
public class ReportFormatter {
    public Report formatReport(Report report) {

        try {
            Thread.sleep(3000);

        }catch(InterruptedException e){

        }
        System.out.println(report.getClass().getSimpleName() + "formatted");
        return report;
    }
}
