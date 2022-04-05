package com.tms.myapp.repository;


import com.tms.myapp.domain.Orders;
import com.tms.myapp.domain.OrdersData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OrdersDataRepository extends JpaRepository<OrdersData, String> {
    @Query("select r from OrdersData r where r.id_number_order =?1")
    List<OrdersData> findOrderDataByOrder(Orders id);
}
