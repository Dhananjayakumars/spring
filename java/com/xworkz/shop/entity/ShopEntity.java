package com.xworkz.shop.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
@Table (name = "shop_table")


public class ShopEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private long shopId;
	private String shopName;
	private String location;
	private String ownerName;
	private boolean open;
	public ShopEntity(String shopName, String location, String ownerName, boolean open) {
		super();
		this.shopName = shopName;
		this.location = location;
		this.ownerName = ownerName;
		this.open = open;
	}
	

}
