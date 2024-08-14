package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name="products")
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
public class ProductEntity {

	Integer productId;
	String productName; 
	Integer price;
	String category; 
}
