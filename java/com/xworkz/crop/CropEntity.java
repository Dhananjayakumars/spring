package com.xworkz.crop;
import java.io.Serializable;

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

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "Crop_Table")

public class CropEntity implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CID")
	private long cid;
	@Column(name = "CROP_NAME")
	private String name;
	@Column(name = "CROP_TYPE")
	private CropType type;// rabi, Kharif,Zaid
	@Column(name = "CROP_PRICE")
	private double price;
	@Column(name = "CROP_SEASON")
	private CropSeason season;
	@Column(name = "ORGANIC")
	private boolean organic;
	@Column(name = "CROP_LIFE")
	private int life;
	
	public CropEntity(String name, CropType type, double price, CropSeason season, boolean organic, int life) {
		super();
		this.name = name;
		this.type = type;
		this.price = price;
		this.season = season;
		this.organic = organic;
		this.life = life;
	}
	
	

}
