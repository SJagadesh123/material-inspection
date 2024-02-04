package com.zettamine.mi.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zettamine.mi.entities.Vendor;

public interface VendorRepository extends JpaRepository<Vendor, Serializable> {

	
}