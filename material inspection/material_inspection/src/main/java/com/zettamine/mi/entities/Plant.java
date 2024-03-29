package com.zettamine.mi.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Plant {

	@Id
	private String plantId;
	private String plantName;
	private String city;
	private String state;
	private String status = "active";
}
