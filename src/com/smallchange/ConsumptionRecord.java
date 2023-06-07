package com.smallchange;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ConsumptionRecord {
    public double Balance;
    private double money = 0.00;
    private String createTime;
    private String updateTime;
    // 收入/支出key true为收入，false为支出
    private Boolean IncomeKey = true;

    public ConsumptionRecord(double balance) {
        Balance = balance;
        Date currentDate = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        createTime = format.format(currentDate);
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
        Date currentDate = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        updateTime = format.format(currentDate);
    }

    public String getCreateTime() {
        return createTime;
    }

    public Boolean getIncomeKey() {
        return IncomeKey;
    }

    public void setIncomeKey(Boolean incomeKey) {
        IncomeKey = incomeKey;
    }
}
