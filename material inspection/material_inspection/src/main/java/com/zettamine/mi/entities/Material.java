package com.zettamine.mi.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Material {

	@Id
	private String materialId;
	private String description;
	private String materialType;
	private Integer noOfChar;
	
	@OneToMany(mappedBy = "material", cascade = CascadeType.ALL)
	private List<MaterialCharacteristic> characteristics = new ArrayList<>();

}
