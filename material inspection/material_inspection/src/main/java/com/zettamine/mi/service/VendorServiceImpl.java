package com.zettamine.mi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zettamine.mi.entities.SearchCriteria;
import com.zettamine.mi.entities.Vendor;
import com.zettamine.mi.repository.VendorRepository;

@Service
public class VendorServiceImpl implements VendorService {

	private VendorRepository vendorRepo;
	
	
	
	public VendorServiceImpl(VendorRepository vendorRepo) {
		super();
		this.vendorRepo = vendorRepo;
	}

	@Override
	public void save(Vendor vendor) {
		Vendor newVendor = new Vendor(vendor.getVendorId(),
								      vendor.getVendorName().toLowerCase(),
									  vendor.getEmail().toLowerCase(), 
									  vendor.getState().toLowerCase(), 
									  vendor.getCity().toLowerCase(), 
									  vendor.getStatus().toLowerCase());

		vendorRepo.save(newVendor);
	}

	@Override
	public List<Vendor> getAll() {

		return vendorRepo.findAllByStatus("active");
	}

	@Override
	public Vendor getById(int id) {
		
		return vendorRepo.findById(id).get();
	}

}
