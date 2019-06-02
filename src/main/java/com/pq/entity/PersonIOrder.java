package com.pq.entity;

/**
 * @author github:xixihaha888
 * @data
 **/
public class PersonIOrder implements IOrder {
    private  Integer procount;

    public PersonIOrder(Integer procount) {
        this.procount = procount;
    }

    public PersonIOrder() {
    }

    public Integer getProcount() {
        return procount;
    }

    public void setProcount(Integer procount) {
        this.procount = procount;
    }



    @Override
    public String toString() {
        return "PersonIOrder{" +
                "procount=" + procount +
                '}';
    }

    @Override
    public IOrder copy() {
         PersonIOrder personIOrder =new PersonIOrder();
         personIOrder.setProcount(this.getProcount());
         return personIOrder;
    }
}
