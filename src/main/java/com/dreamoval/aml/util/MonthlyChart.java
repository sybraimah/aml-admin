package com.dreamoval.aml.util;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dreamadmin on 7/29/14.
 */
public class MonthlyChart {

    private List<DailyStat> stats;

    public void addStat(DailyStat dailyStat){
        if (this.stats == null) {
            this.stats = new ArrayList<DailyStat>();
        }
        stats.add(dailyStat);
    }

    public void removeStat(DailyStat dailyStat){
        if(this.stats!=null){
            stats.remove(dailyStat);
        }
    }

    public List<DailyStat> getStats() {
        return stats;
    }

    public void setStats(List<DailyStat> stats) {
        this.stats = stats;
    }
}
