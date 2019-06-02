package com.pq.service;

import com.pq.entity.CompanyIOrder;
import com.pq.entity.IOrder;
import com.pq.entity.PersonIOrder;

import java.util.ArrayList;
import java.util.List;

/**
 * @author github:xixihaha888
 * @data
 **/
public class OrderService {
    public List<IOrder> dealWithOrder(IOrder order) {

        List<IOrder> orders = new ArrayList<>();
        while (order.getProcount() > 20) {
            IOrder order1 =order.copy();
            order1.setProcount(20);
            order.setProcount(order.getProcount()-20);
            orders.add(order1);
            }
        orders.add(order);
        return orders;
        }

    }


