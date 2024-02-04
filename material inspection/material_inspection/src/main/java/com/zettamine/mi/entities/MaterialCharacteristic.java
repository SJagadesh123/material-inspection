package com.zettamine.mi.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MaterialCharacteristic {

	@Id
	private Integer chId;
	private String chDesc;
	private String uom;

	@Column(name = "tol_ul")
	private double upperLimit;

	@Column(name = "tol_ll")
	private double lowerLimit;

	@ManyToOne
	@JoinColumn(name = "material_id")
	private Material material;
}
