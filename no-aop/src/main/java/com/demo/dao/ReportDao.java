package com.demo.dao;

import com.demo.ds.Report;
import org.springframework.stereotype.Component;

@Component
public class ReportDao {
    public void save(Report report) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(report.getClass().getSimpleName()+ "saved.");
    }
}
