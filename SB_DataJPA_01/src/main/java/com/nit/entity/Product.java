package com.nit.entity;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor

@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "PRODUCT_TBL")
public class Product {
	
	@Id
	@Column(name = "pid")
	private Integer pid;
	
	@Column(name ="PRODUCT_NAME")
	@Nonnull
	private String pname;
	
	@Nonnull
	@Column(name = "PRODUCT_PRICE")
	private Double price;
	
	@Nonnull
	@Column(name="PRODUCT_QTY")
	private Integer qty;
}
