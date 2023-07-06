package com.HouseRent.View;

import com.HouseRent.Domain.House;
import com.HouseRent.Service.HouseService;
import com.HouseRent.Utils.Utility;

/**
 *
 */
public class HouseView {
    // 控制显示菜单
    private boolean loop = true;
    // 接受用户选选择菜单
    private char key = ' ';

    private HouseService houseService = new HouseService(10);

    // 显示菜单
    public void mainMenu() {
        do {
            System.out.println("==========================房屋出租系统菜单===============================");
            System.out.println("1.新增房源");
            System.out.println("2.查找房屋");
            System.out.println("3.删除房屋信息");
            System.out.println("4.修改房屋信息");
            System.out.println("5.显示房屋信息");
            System.out.println("6.退出");
            System.out.println("请输入你的选择1-6：");
            key = Utility.readChar();
            switch (key) {
                case '1':
                    System.out.println("新增房源");
                    break;
                case '2':
                    System.out.println("查找房屋");
                    break;
                case '3':
                    System.out.println("删除房屋信息");
                    break;
                case '4':
                    System.out.println("修改房屋信息");
                    break;
                case '5':
                    System.out.println("显示房屋信息");
                    listHouses();
                    break;
                case '6':
                    loop = false;
                    break;
            }
        } while (loop);
    }

    public void listHouses() {
        System.out.println("==========================房屋列表===============================");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态(未出租/已出租)\t\t");
        House[] houses = houseService.list();
        for (int i = 0; i < houses.length; i++) {
            if (houses[i] != null) {
                System.out.println(houses[i]);
            }
        }
        System.out.println("==========================房屋列表显示完毕===============================");
    }
}
