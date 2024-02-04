package com.zettamine.mi.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Vendor {
	
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "vendor_sequence")
    @SequenceGenerator(name = "vendor_sequence", sequenceName = "vendor_sequence", allocationSize = 1, initialValue = 5001)
	private Integer vendorId;
	private String vendorName;
	private String email;
	private String state;
	private String city;
	private String status = "active";
	

}
