package com.dreamoval.aml.controllers;

import com.dreamoval.aml.mongo.domain.DailySummary;
import com.dreamoval.aml.mongo.domain.ITransaction;
import com.dreamoval.aml.mongo.services.DailySummaryService;
import com.dreamoval.aml.mongo.services.ITransactionService;
import com.dreamoval.aml.util.DailyStat;
import com.dreamoval.aml.util.MonthlyChart;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by dreamadmin on 10/10/14.
 */
@Controller
public class HomeController {

    @Autowired
    ITransactionService transactionService;

    @Autowired
    DailySummaryService dailySummaryService;

    @RequestMapping("/")
    public String index(Model model) {
//        List<ITransaction> transactions = transactionService.findAll();
        MonthlyChart monthlyChart = getMonthStats(dailySummaryService.findMonthlySummary());
        model.addAttribute("monthStats",monthlyChart);

        return "index";
    }

//    public String loadGraph(){
//        MonthlyChart monthlyChart = getMonthStats(dailySummaryService.findMonthlySummary());
//        JsonObject object = new JsonObject();
//        object.add("monthly",monthlyChart);
//
//    }

    public MonthlyChart getMonthStats(List<DailySummary> dailySummaries){
        MonthlyChart chart = new MonthlyChart();

        int maximumValue = new DateTime().dayOfMonth().getMaximumValue();

        for(int i =1;i<maximumValue;i++){
            DailyStat stat = new DailyStat();
            stat.setDay(i);
            stat.setCount(0);
            for (DailySummary dailySummary : dailySummaries) {
                if(dailySummary.getDateCreated().getDayOfMonth() == i){
                    stat.setCount(dailySummary.getTransactionCount());
                }
            }
            chart.addStat(stat);
        }
        return chart;
    }
}
