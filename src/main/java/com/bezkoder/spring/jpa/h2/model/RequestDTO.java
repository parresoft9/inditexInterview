package com.bezkoder.spring.jpa.h2.model;

import java.time.LocalDateTime;

public class RequestDTO{

    private LocalDateTime fechaAplicacion;
    private String product_Id;
    private Long brand_Id;

    public RequestDTO(LocalDateTime fechaAplicacion, String product_Id, Long brand_Id){
        this.fechaAplicacion = fechaAplicacion;
        this.product_Id = product_Id;
        this.brand_Id = brand_Id;
    }

    public LocalDateTime getFechaAplicacion(){
        return fechaAplicacion;
    }

    public String getProduct_Id(){
        return product_Id;
    }

    public Long getBrand_Id(){
        return brand_Id;
    }
}
