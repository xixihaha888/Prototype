package com.pq.entity;

/**
 * @author github:xixihaha888
 * @data
 **/
public class CompanyIOrder implements IOrder {
    private  Integer procount;

    public void setProcount(Integer procount) {
        this.procount = procount;
    }

    public CompanyIOrder() {
    }

    @Override
    public String toString() {
        return "CompanyIOrder{" +
                "procount=" + procount +
                '}';
    }

    public CompanyIOrder(Integer procount) {
        this.procount = procount;
    }

    public Integer getProcount() {
        return procount;
    }

    @Override
    public IOrder copy() {
        CompanyIOrder companyIOrder=new CompanyIOrder();
        companyIOrder.setProcount(this.getProcount());
        return companyIOrder;
    }
}
