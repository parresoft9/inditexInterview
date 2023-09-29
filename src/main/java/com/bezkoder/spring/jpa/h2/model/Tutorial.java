package com.bezkoder.spring.jpa.h2.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;

@Entity
@Table(name = "tutorials")
@IdClass(value = TutorialPK.class)
public class Tutorial{

    @Id private Long brand_Id;
    @Id private Long price_List;
    @Id private String product_Id;

    @Column(name = "START_DATE") private LocalDateTime start_date;
    @Column(name = "END_DATE") private LocalDateTime end_date;

    @Column(name = "PRICE_LIST") private long price_list;
    @Column(name = "PRIORITY") private long priority;
    @Column(name = "PRICE") private float price;

    @Column(name = "CURR") private String curr;

    public Tutorial(){

    }

    public Tutorial(Long brand_Id, Long price_List, String product_Id, LocalDateTime start_date, LocalDateTime end_date,
            long price_list, long priority, float price, String curr){
        this.brand_Id = brand_Id;
        this.price_List = price_List;
        this.product_Id = product_Id;
        this.start_date = start_date;
        this.end_date = end_date;
        this.price_list = price_list;
        this.priority = priority;
        this.price = price;
        this.curr = curr;
    }

    public Long getBrand_Id(){
        return brand_Id;
    }

    public void setBrand_Id(Long brand_Id){
        this.brand_Id = brand_Id;
    }

    public Long getPrice_List(){
        return price_List;
    }

    public void setPrice_List(Long price_List){
        this.price_List = price_List;
    }

    public String getProduct_Id(){
        return product_Id;
    }

    public void setProduct_Id(String product_Id){
        this.product_Id = product_Id;
    }

    public LocalDateTime getStart_date(){
        return start_date;
    }

    public void setStart_date(LocalDateTime start_date){
        this.start_date = start_date;
    }

    public LocalDateTime getEnd_date(){
        return end_date;
    }

    public void setEnd_date(LocalDateTime end_date){
        this.end_date = end_date;
    }

    public long getPrice_list(){
        return price_list;
    }

    public void setPrice_list(long price_list){
        this.price_list = price_list;
    }

    public long getPriority(){
        return priority;
    }

    public void setPriority(long priority){
        this.priority = priority;
    }

    public float getPrice(){
        return price;
    }

    public void setPrice(float price){
        this.price = price;
    }

    public String getCurr(){
        return curr;
    }

    public void setCurr(String curr){
        this.curr = curr;
    }

    @Override
    public String toString(){
        return "Tutorial{" + "brand_Id=" + brand_Id + ", price_List=" + price_List + ", product_Id='" + product_Id
                + '\'' + ", start_date=" + start_date + ", end_date=" + end_date + ", price_list=" + price_list
                + ", priority=" + priority + ", price=" + price + ", curr='" + curr + '\'' + '}';
    }
}
