package com.tms.myapp.repository;


import com.tms.myapp.domain.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OrdersRepository extends JpaRepository<Orders, Long> {
    @Query("select r from Orders r")
    List<Orders> findAllNoFilter();
    @Query("select r from Orders r where r.status =?1")
    List<Orders> findFilter(Long id);
    @Query("select r from Orders r where r.number_order =?1")
    Orders findbyNumber(String id);
}
