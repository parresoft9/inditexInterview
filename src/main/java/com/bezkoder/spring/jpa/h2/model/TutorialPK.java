package com.bezkoder.spring.jpa.h2.model;

import java.util.Objects;

public class TutorialPK{

    private Long brand_Id;
    private Long price_List;
    private String product_Id;

    @Override
    public boolean equals(Object o){
        if(this == o)
            return true;
        if(o == null || getClass() != o.getClass())
            return false;
        TutorialPK that = (TutorialPK) o;
        return Objects.equals(brand_Id, that.brand_Id) && Objects.equals(price_List, that.price_List) && Objects.equals(
                product_Id, that.product_Id);
    }

    @Override
    public int hashCode(){
        return Objects.hash(brand_Id, price_List, product_Id);
    }
}
