package com.tms.myapp.service;


import com.tms.myapp.domain.Orders;
import com.tms.myapp.domain.OrdersData;
import com.tms.myapp.dto.OrdersDTO;
import com.tms.myapp.dto.OrdersDataDTO;

import java.util.List;

public interface OrdersService {
    List<OrdersDTO> getListOrders(Long filter);
    Orders updateOrder(Orders OrderFromDb, Long status);
    Orders findById(String id);

    List<OrdersDataDTO> getListDataOrders(String NumberOrders);
}
