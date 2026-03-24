package com.example.orders.service;

import com.example.orders.dto.OrderRequestDTO;
import com.example.orders.entity.OrderEntity;
import com.example.orders.exception.OrderNotFoundException;
import com.example.orders.mapper.OrderMapper;
import com.example.orders.repository.OrderRepository;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderRepository repo;

	@Override
	public OrderEntity createOrder(OrderRequestDTO request) {
		return repo.save(OrderMapper.toEntity(request));
	}

	@Override
	public OrderEntity getOrderById(Long id) {
		Optional<OrderEntity> o = repo.findById(id);
		if (o.isPresent()) {
			return o.get();
		} else {
			throw new OrderNotFoundException();
		}
	}

	@Override
	public void deleteOrder(Long id) {
		 if (!repo.existsById(id)) {
		        throw new OrderNotFoundException("Order not found");
		    }
		    repo.deleteById(id);
	}
}
