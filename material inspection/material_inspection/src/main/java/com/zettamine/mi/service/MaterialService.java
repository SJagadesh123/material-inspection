package com.zettamine.mi.service;

import java.util.List;

import com.zettamine.mi.entities.Material;

public interface MaterialService {

	void save(Material material);

	List<Material> getAll();

	Material getByMaterialId(String id);
}
