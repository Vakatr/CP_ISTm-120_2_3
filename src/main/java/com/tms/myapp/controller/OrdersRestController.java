package com.tms.myapp.controller;

import com.tms.myapp.domain.Orders;
import com.tms.myapp.dto.OrdersDTO;
import com.tms.myapp.dto.OrdersDataDTO;
import com.tms.myapp.repository.OrdersRepository;
import com.tms.myapp.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/api/info/")
public class OrdersRestController {

    private final OrdersService ordersService;
    private final OrdersRepository ordersRepository;
    @Autowired
    public OrdersRestController(
                                OrdersRepository ordersRepository,
                                OrdersService ordersService) {
        this.ordersRepository = ordersRepository;
        this.ordersService = ordersService;
    }

    @GetMapping(value = "/listorders")
    public ResponseEntity<List<OrdersDTO>> getList() {
        List<OrdersDTO> result = ordersService.getListOrders(0L);
        return result.size() != 0 ? new ResponseEntity<>(result, HttpStatus.OK) : new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping(value = "/ordersdata/{ListOrder}")
    public ResponseEntity<List<OrdersDataDTO>> getOrdersData(@PathVariable String ListOrder) {
        List<OrdersDataDTO> result = ordersService.getListDataOrders(ListOrder);
        return result.size() != 0 ? new ResponseEntity<>(result, HttpStatus.OK) : new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping("/updatestatus/{number_order}")
    public ResponseEntity<OrdersDTO> update(@PathVariable("number_order") String orderNumber,
    @RequestBody Orders order
    ) {
        Orders ordersFromDb = ordersService.findById(orderNumber);
        OrdersDTO result = OrdersDTO.fromOrders(ordersService.updateOrder(ordersFromDb, order.getStatus()));
        return result.getNumber_order() != null ? new ResponseEntity<OrdersDTO>(result, HttpStatus.OK) : new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
