package com.pq.demo;

import com.pq.entity.IOrder;
import com.pq.entity.PersonIOrder;
import com.pq.service.OrderService;
import java.util.List;

/**
 * @author github:xixihaha888
 * @data
 **/
public class TestDemo {
    public static void main(String[] args) {
        PersonIOrder order =new PersonIOrder(101);
        OrderService orderService =new OrderService();
        List<IOrder>orders=orderService.dealWithOrder(order);
        System.out.println(orders.size());
    }
}
