package com.tms.myapp.service.impl;


import com.tms.myapp.domain.Orders;
import com.tms.myapp.domain.OrdersData;
import com.tms.myapp.dto.OrdersDTO;
import com.tms.myapp.dto.OrdersDataDTO;
import com.tms.myapp.exceptions.UserNotFoundException;
import com.tms.myapp.repository.OrdersDataRepository;
import com.tms.myapp.repository.OrdersRepository;
import com.tms.myapp.service.OrdersService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrdersServiceImpl implements OrdersService {

    private final OrdersRepository ordersRepository;
    private final OrdersDataRepository ordersDataRepository;
    @Autowired
    public OrdersServiceImpl(OrdersRepository ordersRepository,
                             OrdersDataRepository ordersDataRepository)
    {
        this.ordersRepository = ordersRepository;
        this.ordersDataRepository = ordersDataRepository;
    }



    @Override
    public List<OrdersDTO> getListOrders(Long filter) {
        if (filter==0) {
            return ordersRepository.findAll()
                    .stream()
                    .map(OrdersDTO::fromOrders)
                    .collect(Collectors.toList());
        }
        else{
            return ordersRepository.findFilter(filter)
                    .stream()
                    .map(OrdersDTO::fromOrders)
                    .collect(Collectors.toList());
        }
    }


    @Override
    public Orders updateOrder(Orders OrdersFromDb, Long status) {
        OrdersFromDb.setStatus(status);
        return ordersRepository.save(OrdersFromDb);
    }

    @Override
    public Orders findById(String id) {
        return ordersRepository.findbyNumber(id);
    }

    @Override
    public List<OrdersDataDTO> getListDataOrders(String NumberOrder) {

        return ordersDataRepository.findOrderDataByOrder(ordersRepository.findbyNumber(NumberOrder)).stream().map(OrdersDataDTO::fromOrdersData).collect(Collectors.toList());
    }

}
