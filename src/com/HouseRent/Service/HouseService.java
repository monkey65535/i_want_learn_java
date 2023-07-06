package com.HouseRent.Service;


import com.HouseRent.Domain.House;

/**
 * 定义House 保存House对象
 * 相应Houseview的调用
 * 完成对房屋的操作 CURD
 */
public class HouseService {
    private House[] houses;

    public HouseService(int size) {
        houses = new House[size];
        houses[0] = new House(1, "jack", "1122", "asdasdadasdas", 2000, "未出租");
    }

    public House[] list() {
        return houses;
    }
}
