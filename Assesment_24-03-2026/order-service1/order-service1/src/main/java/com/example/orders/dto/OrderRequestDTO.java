package com.example.orders.dto;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderRequestDTO {

	@NotBlank
	@NotNull
	@Size(min = 3)
	private String customerName;
	@NotBlank
	@NotNull
	@Email
	private String email;
	@NotNull
	@NotBlank
	private String productName;
	@NotNull
	@Min(value = 1)
	private Integer quantity;
	@NotNull
	@DecimalMin(value = "0.01")
	private Double pricePerUnit;
}
