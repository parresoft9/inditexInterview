package com.bezkoder.spring.jpa.h2.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bezkoder.spring.jpa.h2.model.Tutorial;

public interface TutorialRepository extends JpaRepository<Tutorial, Long>{

    @Query(value = "SELECT e.* FROM tutorials e WHERE start_date <=:date AND end_date>=:date AND brand_Id =:brand_Id AND product_Id =:product_Id ORDER BY priority DESC", nativeQuery = true)
    List<Tutorial> findPriceByDateProductAndBrand(LocalDateTime date, long brand_Id, String product_Id);

}
