package com.smallchange;

import java.util.Scanner;

public class SmallChangeSys {
    /**
     * 1. 先完成显示菜单，并可以选择菜单，给出对应提示
     * 2. 完成零钱通明细
     */
    // 定义余额
    public static double Balance = 0;
    // 定义账本数组
    public static ConsumptionRecord[] Ledger = new ConsumptionRecord[100];
    static int ConsumptionRecordIdx = 0;

    public static void main(String[] args) {
        // 定义带单相关变量
        boolean loop = true;
        // 接受输入
        Scanner scanner = new Scanner(System.in);
        String key = "";
        do {
            System.out.println("--------------------零钱通菜单-------------------");
            System.out.println("                1  零钱通 明细                   ");
            System.out.println("                2  收 益 入 账                   ");
            System.out.println("                3  消  费                   ");
            System.out.println("                4  退     出                   ");
            System.out.println("请选择1-4");
            key = scanner.next();

            switch (key) {
                case "1":
                    System.out.println("显示零钱通");
                    break;
                case "2":
                    System.out.println("显示收 益 入 账 ");
                    break;
                case "3":
                    SaveConsumption();
                    break;
                case "4":
                    System.out.println("进行退出");
                    loop = false;
                    break;
                default:
                    System.out.println("输入选择有误，请重新选择");
            }

        } while (loop);

        System.out.println("---------------------项目已退出--------------------------");
    }

    public static <ex> void SaveConsumption() {
        System.out.println("开始进行记录");
        System.out.println("请输入记录金额");
        String amountString;
        Scanner scannerAmount = new Scanner(System.in);
        amountString = scannerAmount.next();
        System.out.println("请输入1或0代表收入或者支出：1：收入，0：支出");
        String IncomeTypeString;
        Scanner scannerIncomeType = new Scanner(System.in);
        IncomeTypeString = scannerIncomeType.next();
        double amount = Double.parseDouble(amountString);
        Boolean IncomeType = "1".equals(IncomeTypeString);
        Consumption(amount, IncomeType);
    }

    private static void Consumption(double amount, Boolean IncomeType) {
        ConsumptionRecord onceAmount = new ConsumptionRecord(Balance);
        onceAmount.setMoney(amount);
        onceAmount.setIncomeKey(IncomeType);
        Ledger[ConsumptionRecordIdx] = onceAmount;
        ConsumptionRecordIdx++;
    }
}
