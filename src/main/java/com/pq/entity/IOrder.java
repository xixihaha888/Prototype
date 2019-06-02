package com.pq.entity;

/**
 * @author github:xixihaha888
 * @data
 **/
public interface IOrder {
    Integer getProcount();
    void setProcount(Integer procount);
    IOrder copy();

}
